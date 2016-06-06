package ru.ocrv.asoup3.pfmx;

import ru.ocrv.asoup3.pfmx.model.PfmxMessage;
import ru.ocrv.asoup3.pfmx.parser.*;
import ru.ocrv.asoup3.pfmx.util.ClassUtil;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PfmxParser {
    public static final String CHARSET = "x-IBM1025";
    private static final String SPD_VAG = "P_VAG";
    private static final String SPD_PRIC = "P_PRIC_OTC";
    private static final String SPD_DISABLED = "FFFFFFFFFF";
    private static final int SPD_VAG_LENGTH = 336;
    private static final int SPD_PRIC_LENGTH = 336;

    private int processors = Runtime.getRuntime().availableProcessors();

    private ExecutorService managedExecutorService;

    public PfmxMessage processPfmx(byte[] pfmxData) {
        return processPfmx(pfmxData, null);
    }

    public PfmxMessage processPfmx(byte[] pfmxData, ExecutorService managedExecutorService) {

        this.managedExecutorService = managedExecutorService;

        PfmxMessage pfmx = PfmxHeaderParser.processPfmxHeader(pfmxData);

        int offset = 208 - 4 + pfmx.getAdditionalLength().intValue();
        int modelLength = 0;
        do {
            offset = offset + 4 + modelLength;
            byte[] current = new byte[4];
            if(offset >= pfmxData.length) {
                return pfmx;
            }
            System.arraycopy(pfmxData, offset, current, 0, 4);
            String modelName = new String(current, Charset.forName(CHARSET));
            System.arraycopy(pfmxData, offset + 4, current, 0, 4);
            modelLength = new BigInteger(current).intValue();

            PfmxModelParser modelParser = null;

            byte[] modelData = new byte[modelLength - 4];
            System.arraycopy(pfmxData, offset + 8, modelData, 0, modelLength - 4);

            if (modelName.toUpperCase().startsWith(PfmxConstants.TABLE_VMD)) {
                modelParser = new PfmxVmdParser();
            } else if (modelName.toUpperCase().startsWith(PfmxConstants.TABLE_LMD)) {
                modelParser = new PfmxLmdParser();
            } else if (modelName.toUpperCase().startsWith(PfmxConstants.TABLE_PMD)) {
                modelParser = new PfmxPmdParser();
            } else if (modelName.toUpperCase().startsWith(PfmxConstants.TABLE_KMD)) {
                modelParser = new PfmxKmdParser();
            } else if (modelName.toUpperCase().startsWith(PfmxConstants.TABLE_OMD)) {
                if ("0410".equals(pfmx.getKsmcbpf()) && "0333".equals(pfmx.getKskmcbpf())) {
                    modelParser = new PfmxOmdCancelParser();
                } else {
                    modelParser = new PfmxOmdParser();
                }
            } else if (modelName.toUpperCase().startsWith(PfmxConstants.TABLE_BMD)) {
                modelParser = new PfmxBmdParser();
            } else if (modelName.toUpperCase().startsWith(PfmxConstants.TABLE_DVS)) {
                modelParser = new PfmxVmdDvsParser();
            } else if (modelName.toUpperCase().startsWith(PfmxConstants.TABLE_SPD)) {
                // Do nothing - for checking
            } else {
                //throw new RuntimeException("Unknown model type: " + modelName);
            }

            if (modelName.toUpperCase().startsWith("SPD")) {
                processSpdRow(pfmx, modelData);
            } else {
                if(modelParser != null) {
                    processModel(pfmx, modelData, modelParser);
                }
            }

        } while (offset < pfmx.getPackageSize().intValue() - modelLength - 4);

        return pfmx;
    }

    private void processModel(final PfmxMessage pfmx, final byte[] modelData, final PfmxModelParser modelParser) {

        ExecutorService es = managedExecutorService;
        if (es == null) {
            es = Executors.newFixedThreadPool(processors);
        }
        List<Future> threadList = new ArrayList<Future>();

        int globalOffset = 0;
        do {
            final int localOffset = globalOffset;
            byte[] rowByteLength = new byte[4];
            System.arraycopy(modelData, globalOffset, rowByteLength, 0, 4);
            final int modelLength = ClassUtil.byteArrayToInt(rowByteLength);
            threadList.add(es.submit(new Runnable() {

                public void run() {

                    modelParser.processRow(pfmx, modelData, localOffset, modelLength);
                }
            }));
            globalOffset += modelLength;
        } while (globalOffset < modelData.length);

        try {
            for (Future fut : threadList) {
                fut.get();
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            if (managedExecutorService == null) {
                es.shutdown();
            }
        }
    }

    public void processSpdRow(PfmxMessage pfmx, byte[] modelData) {

        int offset = 12 + 4 + 10;
        byte[] current = new byte[10];
        System.arraycopy(modelData, offset - 10, current, 0, current.length);
        String tableName = new String(current, Charset.forName(CHARSET)).trim();
        while (SPD_VAG.equals(tableName) || SPD_PRIC.equals(tableName)) {
            byte[] rowByteLength = new byte[4];
            System.arraycopy(modelData, offset, rowByteLength, 0, 4);
            int rows = new BigInteger(rowByteLength).intValue();

            if (SPD_VAG.equals(tableName)) {

                processSpdVagTable(pfmx, modelData, offset, rows);
                offset += SPD_VAG_LENGTH * rows + 10;
            }
            if (SPD_PRIC.equals(tableName)) {
                processSpdPricTable(pfmx, modelData, offset, rows);
                offset += SPD_PRIC_LENGTH * rows + 10;
            }
            System.arraycopy(modelData, offset, current, 0, current.length);
            tableName = new String(current, Charset.forName(CHARSET)).trim();
        }
    }

    private void processSpdVagTable(final PfmxMessage pfmx, final byte[] modelData, int globalOffset, int rows) {

        ExecutorService es = managedExecutorService;
        if (es == null) {
            es = Executors.newFixedThreadPool(processors);
        }
        List<Future> threadList = new ArrayList<Future>();

        for (int i = 0; i < rows; i++) {
            final int localOffset = globalOffset;
            threadList.add(es.submit(new Runnable() {

                @Override
                public void run() {

                    pfmx.addSpdVagRow(PfmxSpdVagParser.processSpdVagRow(modelData, localOffset));
                }
            }));
            globalOffset += SPD_VAG_LENGTH;
        }

        try {
            for (Future fut : threadList) {
                fut.get();
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            if (managedExecutorService == null) {
                es.shutdown();
            }
        }
    }

    private void processSpdPricTable(final PfmxMessage pfmx, final byte[] modelData, int globalOffset, int rows) {

        ExecutorService es = managedExecutorService;
        if (es == null) {
            es = Executors.newFixedThreadPool(processors);
        }
        List<Future> threadList = new ArrayList<Future>();

        for (int i = 0; i < rows; i++) {
            final int localOffset = globalOffset;
            threadList.add(es.submit(new Runnable() {

                @Override
                public void run() {

                    pfmx.addSpdPricRow(PfmxSpdPricParser.processSpdPricRow(modelData, localOffset));
                }
            }));
            globalOffset += SPD_PRIC_LENGTH;
        }

        try {
            for (Future fut : threadList) {
                fut.get();
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            if (managedExecutorService == null) {
                es.shutdown();
            }
        }
    }
}
