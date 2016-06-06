package ru.ocrv.asoup3.pfmx.parser;

import static ru.ocrv.asoup3.pfmx.PfmxParser.CHARSET;

import java.nio.charset.Charset;

import ru.ocrv.asoup3.pfmx.model.PfmxMessage;
import ru.ocrv.asoup3.pfmx.model.PfmxOmdRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtokatlgRow;
import ru.ocrv.asoup3.pfmx.util.ClassUtil;

public class PfmxOmdCancelParser implements PfmxModelParser {

    public void processRow(PfmxMessage pfmx, byte[] modelData, int localOffset, int modelLength) {

        PfmxOmdRow omd = new PfmxOmdRow();
        omd.setRowLength(modelLength);

        int offset = 16 + localOffset;

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 0 + offset, rawVal, 0, 2);
            omd.setKtdank(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2 + offset, rawVal, 0, 2);
            omd.setKtdant(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 4 + offset, rawVal, 0, 2);
            omd.setKtokatlg(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 6 + offset, rawVal, 0, 2);
            omd.setKtgruz(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 8 + offset, rawVal, 0, 2);
            omd.setKtovag(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 10 + offset, rawVal, 0, 2);
            omd.setKtokont(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 12 + offset, rawVal, 0, 2);
            omd.setKtooper(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 14 + offset, rawVal, 0, 2);
            omd.setKttkoor(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 16 + offset, rawVal, 0, 2);
            omd.setKtotext(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 18 + offset, rawVal, 0, 2);
            omd.setKtoperev(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 20 + offset, rawVal, 0, 2);
            omd.setKtootm(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 22 + offset, rawVal, 0, 2);
            omd.setKtperead(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 24 + offset, rawVal, 0, 2);
            omd.setKtplat(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 26 + offset, rawVal, 0, 2);
            omd.setKtoakt(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 28 + offset, rawVal, 0, 2);
            omd.setKtvpereg(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 30 + offset, rawVal, 0, 2);
            omd.setKtkpereg(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 32 + offset, rawVal, 0, 2);
            omd.setKtprisps(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        offset += 34;

        PfmxOmdKtokatlgRow ktokatlgRow = new PfmxOmdKtokatlgRow();

        {
            byte[] rawVal = new byte[12];
            System.arraycopy(modelData, 0 + offset, rawVal, 0, 12);
            ktokatlgRow.setIdOtprk(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        ktokatlgRow.setDorRasch(pfmx.getIkoddor().toString());

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 14 + offset, rawVal, 0, 2);
            ktokatlgRow.setKopOmd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 16 + offset, rawVal, 0, 19);
            ktokatlgRow.setDataForm410(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        omd.addKtokatlgRow(ktokatlgRow);

        /* Optimization. Don't need to copy key values into other collections. */

        //        for (int i = 0; i < omd.getKtdank(); i++) {
        //
        //            PfmxOmdKtdankRow ktdankRow = new PfmxOmdKtdankRow();
        //
        //            omd.addKtdankRow(ktdankRow);
        //        }
        //
        //        for (int i = 0; i < omd.getKtdant(); i++) {
        //
        //            PfmxOmdKtdantRow ktdantRow = new PfmxOmdKtdantRow();
        //
        //            omd.addKtdantRow(ktdantRow);
        //        }
        //
        //        for (int i = 0; i < omd.getKtgruz(); i++) {
        //
        //            PfmxOmdKtgruzRow ktgruzRow = new PfmxOmdKtgruzRow();
        //
        //            omd.addKtgruzRow(ktgruzRow);
        //
        //        }
        //
        //        for (int i = 0; i < omd.getKtovag(); i++) {
        //
        //            PfmxOmdKtovagRow ktovagRow = new PfmxOmdKtovagRow();
        //
        //            omd.addKtovagRow(ktovagRow);
        //
        //        }
        //
        //        for (int i = 0; i < omd.getKtokont(); i++) {
        //
        //            PfmxOmdKtokontRow ktokontRow = new PfmxOmdKtokontRow();
        //
        //            omd.addKtokontRow(ktokontRow);
        //
        //        }
        //
        //        for (int i = 0; i < omd.getKtooper(); i++) {
        //
        //            PfmxOmdKtooperRow ktooperRow = new PfmxOmdKtooperRow();
        //
        //            omd.addKtooperRow(ktooperRow);
        //
        //        }
        //
        //        for (int i = 0; i < omd.getKttkoor(); i++) {
        //
        //            PfmxOmdKttkoorRow kttkoorRow = new PfmxOmdKttkoorRow();
        //
        //            omd.addKttkoorRow(kttkoorRow);
        //
        //        }
        //
        //        for (int i = 0; i < omd.getKtootm(); i++) {
        //
        //            PfmxOmdKtootmRow ktootmRow = new PfmxOmdKtootmRow();
        //
        //            omd.addKtootmRow(ktootmRow);
        //
        //        }
        //
        //        for (int i = 0; i < omd.getKtperead(); i++) {
        //
        //            PfmxOmdKtpereadRow ktpereadRow = new PfmxOmdKtpereadRow();
        //
        //            omd.addKtpereadRow(ktpereadRow);
        //
        //        }
        //
        //        for (int i = 0; i < omd.getKtplat(); i++) {
        //
        //            PfmxOmdKtplatRow ktplatRow = new PfmxOmdKtplatRow();
        //
        //            omd.addKtplatRow(ktplatRow);
        //
        //        }
        //
        //        for (int i = 0; i < omd.getKtoakt(); i++) {
        //
        //            PfmxOmdKtoaktRow ktoaktRow = new PfmxOmdKtoaktRow();
        //
        //            omd.addKtoaktRow(ktoaktRow);
        //
        //        }
        //
        //        for (int i = 0; i < omd.getKtvpereg(); i++) {
        //
        //            PfmxOmdKtvperegRow ktvperegRow = new PfmxOmdKtvperegRow();
        //
        //            omd.addKtvperegRow(ktvperegRow);
        //
        //        }
        //
        //        for (int i = 0; i < omd.getKtkpereg(); i++) {
        //
        //            PfmxOmdKtkperegRow ktkperegRow = new PfmxOmdKtkperegRow();
        //
        //            omd.addKtkperegRow(ktkperegRow);
        //
        //        }

        pfmx.addOmdRow(omd);

    }

}
