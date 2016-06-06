package ru.ocrv.asoup3.pfmx.parser;

import static ru.ocrv.asoup3.pfmx.PfmxParser.CHARSET;

import ru.ocrv.asoup3.pfmx.PfmxParser;
import ru.ocrv.asoup3.pfmx.model.PfmxMessage;
import ru.ocrv.asoup3.pfmx.model.PfmxVmdDvsRow;
import ru.ocrv.asoup3.pfmx.util.ClassUtil;

import java.nio.charset.Charset;

/**
 * @author Anton Saburov <Anton.Saburov@OCRV.RU> on 30.06.2015.
 */
public class PfmxVmdDvsParser implements PfmxModelParser
{
    @Override
    public void processRow(PfmxMessage pfmx, byte[] modelData, int localOffset, int modelLength) {

        PfmxVmdDvsRow vmdDvs = new PfmxVmdDvsRow();
        vmdDvs.setRowLength(modelLength);

        int offset = 4 + localOffset;

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 0 + offset, rawVal, 0, 2);
            vmdDvs.setPrTfz1(new Integer((ClassUtil.byteArrayToShort(rawVal))));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 2 + offset, rawVal, 0, 10);
            vmdDvs.setPrTfz2(rawVal);
        }

//        {
//            byte[] rawVal = new byte[12];
//            System.arraycopy(modelData, 12 + offset, rawVal, 0, 12);
//            vmdDvs.setPrTfz(new Short(ClassUtil.byteArrayToShort(rawVal)));
//        }

        {
            byte[] rawVal = new byte[12];
            System.arraycopy(modelData, 12 + offset, rawVal, 0, 12);
            vmdDvs.setNomVag(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 24 + offset, rawVal, 0, 2);
            vmdDvs.setDorRasch(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 26 + offset, rawVal, 0, 4);
            vmdDvs.setStanOp(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 30 + offset, rawVal, 0, 19);
            vmdDvs.setDateOp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 49 + offset, rawVal, 0, 2);
            vmdDvs.setKopVmd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 51 + offset, rawVal, 0, 2);
            vmdDvs.setNomPark(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 53 + offset, rawVal, 0, 2);
            vmdDvs.setNomPut(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 55 + offset, rawVal, 0, 2);
            vmdDvs.setNomParkPred(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 57 + offset, rawVal, 0, 2);
            vmdDvs.setNomPutPred(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 59 + offset, rawVal, 0, 1);
            vmdDvs.setTipSist(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 60 + offset, rawVal, 0, 1);
            vmdDvs.setPrVagPoezd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[15];
            System.arraycopy(modelData, 61 + offset, rawVal, 0, 15);
            vmdDvs.setIndexPoezd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 76 + offset, rawVal, 0, 19);
            vmdDvs.setDateNOsm(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 95 + offset, rawVal, 0, 19);
            vmdDvs.setDateOkOsm(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 114 + offset, rawVal, 0, 4);
            vmdDvs.setStanOsm(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 118 + offset, rawVal, 0, 2);
            vmdDvs.setGrpodVag(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 120 + offset, rawVal, 0, 4);
            vmdDvs.setOtmGod(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 124 + offset, rawVal, 0, 10);
            vmdDvs.setNomZv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 134 + offset, rawVal, 0, 4);
            vmdDvs.setStanPog(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 138 + offset, rawVal, 0, 4);
            vmdDvs.setKodGrz(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 142 + offset, rawVal, 0, 2);
            vmdDvs.setStrNazn(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 144 + offset, rawVal, 0, 10);
            vmdDvs.setGruzotpr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 154 + offset, rawVal, 0, 4);
            vmdDvs.setNomVagon(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 158 + offset, rawVal, 0, 2);
            vmdDvs.setKdorRasch(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 160 + offset, rawVal, 0, 4);
            vmdDvs.setKds(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 164 + offset, rawVal, 0, 19);
            vmdDvs.setDvs(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 183 + offset, rawVal, 0, 9);
            vmdDvs.setKpp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 192 + offset, rawVal, 0, 4);
            vmdDvs.setKdsT(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 196 + offset, rawVal, 0, 19);
            vmdDvs.setDvsT(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 215 + offset, rawVal, 0, 9);
            vmdDvs.setKppT(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 224 + offset, rawVal, 0, 4);
            vmdDvs.setUns0(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 228 + offset, rawVal, 0, 4);
            vmdDvs.setUns0T(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[50];
            System.arraycopy(modelData, 232 + offset, rawVal, 0, 50);
            vmdDvs.setRezdvs0(rawVal);
        }

        pfmx.addVmdDvsRow(vmdDvs);
    }
}
