package ru.ocrv.asoup3.pfmx.parser;

import java.math.BigInteger;
import java.nio.charset.Charset;

import ru.ocrv.asoup3.pfmx.model.PfmxMessage;
import ru.ocrv.asoup3.pfmx.model.PfmxOmdRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtdankRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtdantRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtgruzRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtkperegRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtoaktRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtokatlgRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtokontRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtooperRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtootmRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtovagRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtpereadRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtplatRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKttkoorRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtvperegRow;
import ru.ocrv.asoup3.pfmx.util.ClassUtil;
import ru.ocrv.asoup3.pfmx.PfmxParser;

public class PfmxOmdParser implements PfmxModelParser {

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

        for (int i = 0; i < omd.getKtdank(); i++) {

            PfmxOmdKtdankRow ktdankRow = new PfmxOmdKtdankRow();

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 0 + offset, rawVal, 0, 12);
                ktdankRow.setIdOtprk(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 12 + offset, rawVal, 0, 2);
                ktdankRow.setDorRasch(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 14 + offset, rawVal, 0, 2);
                ktdankRow.setKodDok(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[8];
                System.arraycopy(modelData, 16 + offset, rawVal, 0, 8);
                ktdankRow.setPrDan(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 24 + offset, rawVal, 0, 2);
                ktdankRow.setKdor(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 26 + offset, rawVal, 0, 1);
                ktdankRow.setPrPlan(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[7];
                System.arraycopy(modelData, 27 + offset, rawVal, 0, 7);
                ktdankRow.setNomPlan(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 34 + offset, rawVal, 0, 4);
                ktdankRow.setStanOtpr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 38 + offset, rawVal, 0, 4);
                ktdankRow.setStanOtprInodor(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 42 + offset, rawVal, 0, 2);
                ktdankRow.setGruzotpr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 44 + offset, rawVal, 0, 12);
                ktdankRow.setGruzotprInodor(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[9];
                System.arraycopy(modelData, 56 + offset, rawVal, 0, 9);
                ktdankRow.setKodPlOtpr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[20];
                System.arraycopy(modelData, 65 + offset, rawVal, 0, 20);
                ktdankRow.setNomSchOtpr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 85 + offset, rawVal, 0, 6);
                ktdankRow.setIndeks(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[9];
                System.arraycopy(modelData, 91 + offset, rawVal, 0, 9);
                ktdankRow.setBankIdKod(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[13];
                System.arraycopy(modelData, 100 + offset, rawVal, 0, 13);
                ktdankRow.setIdNomNalog(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 113 + offset, rawVal, 0, 2);
                ktdankRow.setStrOtpr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[30];
                System.arraycopy(modelData, 115 + offset, rawVal, 0, 30);
                ktdankRow.setNomDogPost(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[30];
                System.arraycopy(modelData, 145 + offset, rawVal, 0, 30);
                ktdankRow.setNomLicPost(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[30];
                System.arraycopy(modelData, 175 + offset, rawVal, 0, 30);
                ktdankRow.setNomKonPost(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 205 + offset, rawVal, 0, 4);
                ktdankRow.setStanNazn(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 209 + offset, rawVal, 0, 4);
                ktdankRow.setStanNaznInodor(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 213 + offset, rawVal, 0, 2);
                ktdankRow.setDorNazn(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 215 + offset, rawVal, 0, 2);
                ktdankRow.setKodAdmNazn(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 217 + offset, rawVal, 0, 2);
                ktdankRow.setGruzpol(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 219 + offset, rawVal, 0, 12);
                ktdankRow.setGruzpolInodor(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[9];
                System.arraycopy(modelData, 231 + offset, rawVal, 0, 9);
                ktdankRow.setKodPlPol(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 240 + offset, rawVal, 0, 2);
                ktdankRow.setStrNazn(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 242 + offset, rawVal, 0, 4);
                ktdankRow.setStanVxPogran(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 246 + offset, rawVal, 0, 4);
                ktdankRow.setStanVyxPogran(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 250 + offset, rawVal, 0, 1);
                ktdankRow.setVidDok(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 251 + offset, rawVal, 0, 2);
                ktdankRow.setVidSoob(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 253 + offset, rawVal, 0, 2);
                ktdankRow.setVidOtprk(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 255 + offset, rawVal, 0, 1);
                ktdankRow.setKodVidKol(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 256 + offset, rawVal, 0, 2);
                ktdankRow.setNomSost(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 258 + offset, rawVal, 0, 1);
                ktdankRow.setKodMarsh(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 259 + offset, rawVal, 0, 4);
                ktdankRow.setNomOtprMarsh(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 263 + offset, rawVal, 0, 6);
                ktdankRow.setNomKolMarsh(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 269 + offset, rawVal, 0, 1);
                ktdankRow.setPrVal(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 270 + offset, rawVal, 0, 2);
                ktdankRow.setKolListDok(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 272 + offset, rawVal, 0, 1);
                ktdankRow.setKemOprMas(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 273 + offset, rawVal, 0, 2);
                ktdankRow.setKodSpOprMas(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 275 + offset, rawVal, 0, 6);
                ktdankRow.setGrpVagVes(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 281 + offset, rawVal, 0, 1);
                ktdankRow.setKodPogrSr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 282 + offset, rawVal, 0, 4);
                ktdankRow.setVesGrzBr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 286 + offset, rawVal, 0, 1);
                ktdankRow.setPrProvTar(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 287 + offset, rawVal, 0, 4);
                ktdankRow.setVesTarKg(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 291 + offset, rawVal, 0, 4);
                ktdankRow.setVesGrzNet(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 295 + offset, rawVal, 0, 2);
                ktdankRow.setKolVag(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[5];
                System.arraycopy(modelData, 297 + offset, rawVal, 0, 5);
                ktdankRow.setItKolMest(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 302 + offset, rawVal, 0, 4);
                ktdankRow.setMasMestNet(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 306 + offset, rawVal, 0, 4);
                ktdankRow.setMasMestBrut(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 310 + offset, rawVal, 0, 6);
                ktdankRow.setKodGrEtsng(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 316 + offset, rawVal, 0, 4);
                ktdankRow.setKodGrEtsngInt(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 320 + offset, rawVal, 0, 2);
                ktdankRow.setTarifKlass(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 322 + offset, rawVal, 0, 1);
                ktdankRow.setPrNormDok(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[8];
                System.arraycopy(modelData, 323 + offset, rawVal, 0, 8);
                ktdankRow.setNomGlTu(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[8];
                System.arraycopy(modelData, 331 + offset, rawVal, 0, 8);
                ktdankRow.setNomRzdTu(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[8];
                System.arraycopy(modelData, 339 + offset, rawVal, 0, 8);
                ktdankRow.setNomParTu(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 347 + offset, rawVal, 0, 1);
                ktdankRow.setTipKanSv(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[15];
                System.arraycopy(modelData, 348 + offset, rawVal, 0, 15);
                ktdankRow.setNomUstr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 363 + offset, rawVal, 0, 2);
                ktdankRow.setVidPogr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 365 + offset, rawVal, 0, 2);
                ktdankRow.setPrPerev(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 367 + offset, rawVal, 0, 1);
                ktdankRow.setKodSkor(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 368 + offset, rawVal, 0, 6);
                ktdankRow.setNomRe(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 374 + offset, rawVal, 0, 1);
                ktdankRow.setKodZpu(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 375 + offset, rawVal, 0, 6);
                ktdankRow.setNomDogVoxr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[8];
                System.arraycopy(modelData, 381 + offset, rawVal, 0, 8);
                ktdankRow.setNomRazrPer(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 389 + offset, rawVal, 0, 2);
                ktdankRow.setKolKtk(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[5];
                System.arraycopy(modelData, 391 + offset, rawVal, 0, 5);
                ktdankRow.setGrpKont1(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 396 + offset, rawVal, 0, 2);
                ktdankRow.setKolStk(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[5];
                System.arraycopy(modelData, 398 + offset, rawVal, 0, 5);
                ktdankRow.setGrpKont2(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 403 + offset, rawVal, 0, 1);
                ktdankRow.setPrMnPer(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 404 + offset, rawVal, 0, 1);
                ktdankRow.setPrVsPer(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 405 + offset, rawVal, 0, 1);
                ktdankRow.setPrNrpPer(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 406 + offset, rawVal, 0, 1);
                ktdankRow.setPrKmpKont(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 407 + offset, rawVal, 0, 1);
                ktdankRow.setPrOpasGr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[3];
                System.arraycopy(modelData, 408 + offset, rawVal, 0, 3);
                ktdankRow.setNppsPogr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 411 + offset, rawVal, 0, 12);
                ktdankRow.setUno(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            omd.addKtdankRow(ktdankRow);

            offset += 423;

        }

        for (int i = 0; i < omd.getKtdant(); i++) {

            PfmxOmdKtdantRow ktdantRow = new PfmxOmdKtdantRow();

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 0 + offset, rawVal, 0, 12);
                ktdantRow.setIdOtprk(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 12 + offset, rawVal, 0, 2);
                ktdantRow.setDorRasch(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 14 + offset, rawVal, 0, 2);
                ktdantRow.setKodStInf(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[8];
                System.arraycopy(modelData, 16 + offset, rawVal, 0, 8);
                ktdantRow.setShOperN(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[25];
                System.arraycopy(modelData, 24 + offset, rawVal, 0, 25);
                ktdantRow.setNaimDorOtpr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[7];
                System.arraycopy(modelData, 49 + offset, rawVal, 0, 7);
                ktdantRow.setMnkAdmOtpr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[25];
                System.arraycopy(modelData, 56 + offset, rawVal, 0, 25);
                ktdantRow.setNaimStOtpr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[90];
                System.arraycopy(modelData, 81 + offset, rawVal, 0, 90);
                ktdantRow.setNaimGrot(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[9];
                System.arraycopy(modelData, 171 + offset, rawVal, 0, 9);
                ktdantRow.setPochIndOtpr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[35];
                System.arraycopy(modelData, 180 + offset, rawVal, 0, 35);
                ktdantRow.setPochAdrOtprn(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[35];
                System.arraycopy(modelData, 215 + offset, rawVal, 0, 35);
                ktdantRow.setPochAdrOtpro(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[90];
                System.arraycopy(modelData, 250 + offset, rawVal, 0, 90);
                ktdantRow.setNaimPlatOtpr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[24];
                System.arraycopy(modelData, 340 + offset, rawVal, 0, 24);
                ktdantRow.setNaimBankn(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[24];
                System.arraycopy(modelData, 364 + offset, rawVal, 0, 24);
                ktdantRow.setNaimBanko(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[25];
                System.arraycopy(modelData, 388 + offset, rawVal, 0, 25);
                ktdantRow.setNaimDorNazn(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[7];
                System.arraycopy(modelData, 413 + offset, rawVal, 0, 7);
                ktdantRow.setMnkAdmNazn(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[25];
                System.arraycopy(modelData, 420 + offset, rawVal, 0, 25);
                ktdantRow.setNaimStNazn(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[30];
                System.arraycopy(modelData, 445 + offset, rawVal, 0, 30);
                ktdantRow.setPodPodPut(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[90];
                System.arraycopy(modelData, 475 + offset, rawVal, 0, 90);
                ktdantRow.setNaimGrpol(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[9];
                System.arraycopy(modelData, 565 + offset, rawVal, 0, 9);
                ktdantRow.setPochIndPol(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[35];
                System.arraycopy(modelData, 574 + offset, rawVal, 0, 35);
                ktdantRow.setPochAdrPoln(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[35];
                System.arraycopy(modelData, 609 + offset, rawVal, 0, 35);
                ktdantRow.setPochAdrPolo(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[25];
                System.arraycopy(modelData, 644 + offset, rawVal, 0, 25);
                ktdantRow.setNaimVxPst(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[25];
                System.arraycopy(modelData, 669 + offset, rawVal, 0, 25);
                ktdantRow.setNaimVixPst(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[48];
                System.arraycopy(modelData, 694 + offset, rawVal, 0, 48);
                ktdantRow.setKolMestProp(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[26];
                System.arraycopy(modelData, 742 + offset, rawVal, 0, 26);
                ktdantRow.setKolVagProp(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[96];
                System.arraycopy(modelData, 768 + offset, rawVal, 0, 96);
                ktdantRow.setItMasProp(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[26];
                System.arraycopy(modelData, 864 + offset, rawVal, 0, 26);
                ktdantRow.setObCenGr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[8];
                System.arraycopy(modelData, 890 + offset, rawVal, 0, 8);
                ktdantRow.setAbonLnw(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[16];
                System.arraycopy(modelData, 898 + offset, rawVal, 0, 16);
                ktdantRow.setAotAbon(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 914 + offset, rawVal, 0, 6);
                ktdantRow.setKpp410(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[3];
                System.arraycopy(modelData, 920 + offset, rawVal, 0, 3);
                ktdantRow.setKoper410(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 923 + offset, rawVal, 0, 6);
                ktdantRow.setKps410(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 929 + offset, rawVal, 0, 4);
                ktdantRow.setKvs410(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[5];
                System.arraycopy(modelData, 933 + offset, rawVal, 0, 5);
                ktdantRow.setNpps410(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[19];
                System.arraycopy(modelData, 938 + offset, rawVal, 0, 19);
                ktdantRow.setDateFs410(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[19];
                System.arraycopy(modelData, 957 + offset, rawVal, 0, 19);
                ktdantRow.setDatePs410(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[10];
                System.arraycopy(modelData, 976 + offset, rawVal, 0, 10);
                ktdantRow.setPolSlugPr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            omd.addKtdantRow(ktdantRow);

            offset += 986;

        }

        for (int i = 0; i < omd.getKtokatlg(); i++) {

            PfmxOmdKtokatlgRow ktokatlgRow = new PfmxOmdKtokatlgRow();

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 0 + offset, rawVal, 0, 12);
                ktokatlgRow.setIdOtprk(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 12 + offset, rawVal, 0, 2);
                ktokatlgRow.setDorRasch(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 14 + offset, rawVal, 0, 2);
                ktokatlgRow.setKopOmd(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[19];
                System.arraycopy(modelData, 16 + offset, rawVal, 0, 19);
                ktokatlgRow.setDateOp(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 35 + offset, rawVal, 0, 4);
                ktokatlgRow.setStOp(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 39 + offset, rawVal, 0, 4);
                ktokatlgRow.setKodSoob(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[15];
                System.arraycopy(modelData, 43 + offset, rawVal, 0, 15);
                ktokatlgRow.setIndexPoezd(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 58 + offset, rawVal, 0, 12);
                ktokatlgRow.setNomVag(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 70 + offset, rawVal, 0, 4);
                ktokatlgRow.setNomVagInt(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 74 + offset, rawVal, 0, 1);
                ktokatlgRow.setPrPolnSved(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 75 + offset, rawVal, 0, 2);
                ktokatlgRow.setPorNomOtpr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 77 + offset, rawVal, 0, 2);
                ktokatlgRow.setKodDok(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 79 + offset, rawVal, 0, 4);
                ktokatlgRow.setStanOtpr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 83 + offset, rawVal, 0, 4);
                ktokatlgRow.setStanOtprInodor(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 87 + offset, rawVal, 0, 2);
                ktokatlgRow.setGruzotpr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 89 + offset, rawVal, 0, 12);
                ktokatlgRow.setGruzotprInodor(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 101 + offset, rawVal, 0, 2);
                ktokatlgRow.setStrOtpr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 103 + offset, rawVal, 0, 4);
                ktokatlgRow.setStanNazn(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 107 + offset, rawVal, 0, 4);
                ktokatlgRow.setStanNaznInodor(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 111 + offset, rawVal, 0, 2);
                ktokatlgRow.setDorNazn(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 113 + offset, rawVal, 0, 2);
                ktokatlgRow.setKodAdmNazn(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 115 + offset, rawVal, 0, 2);
                ktokatlgRow.setGruzpol(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 117 + offset, rawVal, 0, 12);
                ktokatlgRow.setGruzpolInodor(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 129 + offset, rawVal, 0, 2);
                ktokatlgRow.setStrNazn(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 131 + offset, rawVal, 0, 4);
                ktokatlgRow.setStanVxPogran(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 135 + offset, rawVal, 0, 4);
                ktokatlgRow.setStanVyxPogran(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 139 + offset, rawVal, 0, 1);
                ktokatlgRow.setVidDok(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 140 + offset, rawVal, 0, 2);
                ktokatlgRow.setVidSoob(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 142 + offset, rawVal, 0, 2);
                ktokatlgRow.setVidOtprk(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 144 + offset, rawVal, 0, 4);
                ktokatlgRow.setVesGrzBr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 148 + offset, rawVal, 0, 4);
                ktokatlgRow.setVesTarKg(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 152 + offset, rawVal, 0, 4);
                ktokatlgRow.setVesGrzNet(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 156 + offset, rawVal, 0, 2);
                ktokatlgRow.setKolVag(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 158 + offset, rawVal, 0, 6);
                ktokatlgRow.setKodGrEtsng(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 164 + offset, rawVal, 0, 2);
                ktokatlgRow.setVidPogr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 166 + offset, rawVal, 0, 2);
                ktokatlgRow.setPrPerev(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 168 + offset, rawVal, 0, 1);
                ktokatlgRow.setKodZpu(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 169 + offset, rawVal, 0, 2);
                ktokatlgRow.setKolKtk(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 171 + offset, rawVal, 0, 2);
                ktokatlgRow.setKolStk(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[3];
                System.arraycopy(modelData, 173 + offset, rawVal, 0, 3);
                ktokatlgRow.setNppsPogr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[3];
                System.arraycopy(modelData, 176 + offset, rawVal, 0, 3);
                ktokatlgRow.setNomSoobPogr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[3];
                System.arraycopy(modelData, 179 + offset, rawVal, 0, 3);
                ktokatlgRow.setNomSoobVigr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 182 + offset, rawVal, 0, 12);
                ktokatlgRow.setUno(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 194 + offset, rawVal, 0, 2);
                ktokatlgRow.setKodStInf(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[8];
                System.arraycopy(modelData, 196 + offset, rawVal, 0, 8);
                ktokatlgRow.setShOperN(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[16];
                System.arraycopy(modelData, 204 + offset, rawVal, 0, 16);
                ktokatlgRow.setShOperOt(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[16];
                System.arraycopy(modelData, 220 + offset, rawVal, 0, 16);
                ktokatlgRow.setShPosPodt(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[10];
                System.arraycopy(modelData, 236 + offset, rawVal, 0, 10);
                ktokatlgRow.setPolSlugPr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[19];
                System.arraycopy(modelData, 246 + offset, rawVal, 0, 19);
                ktokatlgRow.setDateDostav(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[10];
                System.arraycopy(modelData, 265 + offset, rawVal, 0, 10);
                ktokatlgRow.setNomZajavki(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 275 + offset, rawVal, 0, 4);
                ktokatlgRow.setTarTkm(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 279 + offset, rawVal, 0, 4);
                ktokatlgRow.setEksTkm(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[16];
                System.arraycopy(modelData, 283 + offset, rawVal, 0, 16);
                ktokatlgRow.setAvtootvet(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 299 + offset, rawVal, 0, 6);
                ktokatlgRow.setKpp410(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[3];
                System.arraycopy(modelData, 305 + offset, rawVal, 0, 3);
                ktokatlgRow.setKop410(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 308 + offset, rawVal, 0, 6);
                ktokatlgRow.setKpso410(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[5];
                System.arraycopy(modelData, 314 + offset, rawVal, 0, 5);
                ktokatlgRow.setPorNom410(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[19];
                System.arraycopy(modelData, 319 + offset, rawVal, 0, 19);
                ktokatlgRow.setDataForm410(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[19];
                System.arraycopy(modelData, 338 + offset, rawVal, 0, 19);
                ktokatlgRow.setDataPriem410(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 357 + offset, rawVal, 0, 6);
                ktokatlgRow.setKpp402(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[3];
                System.arraycopy(modelData, 363 + offset, rawVal, 0, 3);
                ktokatlgRow.setKop402(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[5];
                System.arraycopy(modelData, 366 + offset, rawVal, 0, 5);
                ktokatlgRow.setPorNom402(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 371 + offset, rawVal, 0, 6);
                ktokatlgRow.setKpso402(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[19];
                System.arraycopy(modelData, 377 + offset, rawVal, 0, 19);
                ktokatlgRow.setDatForm402(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[19];
                System.arraycopy(modelData, 396 + offset, rawVal, 0, 19);
                ktokatlgRow.setDatPriem402(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 415 + offset, rawVal, 0, 2);
                ktokatlgRow.setPrOper(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            omd.addKtokatlgRow(ktokatlgRow);

            offset += 417;
        }

        for (int i = 0; i < omd.getKtgruz(); i++) {

            PfmxOmdKtgruzRow ktgruzRow = new PfmxOmdKtgruzRow();

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 0 + offset, rawVal, 0, 12);
                ktgruzRow.setIdOtprk(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 12 + offset, rawVal, 0, 6);
                ktgruzRow.setKodGrEtsng(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 18 + offset, rawVal, 0, 2);
                ktgruzRow.setNppStr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 20 + offset, rawVal, 0, 2);
                ktgruzRow.setDorRasch(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 22 + offset, rawVal, 0, 4);
                ktgruzRow.setKodGrzEtsngInt(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 26 + offset, rawVal, 0, 6);
                ktgruzRow.setZnMarNom(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 32 + offset, rawVal, 0, 4);
                ktgruzRow.setKolPaket(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[5];
                System.arraycopy(modelData, 36 + offset, rawVal, 0, 5);
                ktgruzRow.setKolMest(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[3];
                System.arraycopy(modelData, 41 + offset, rawVal, 0, 3);
                ktgruzRow.setKodUpak(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 44 + offset, rawVal, 0, 4);
                ktgruzRow.setMasGr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[36];
                System.arraycopy(modelData, 48 + offset, rawVal, 0, 36);
                ktgruzRow.setNaimGrEtsng(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 84 + offset, rawVal, 0, 4);
                ktgruzRow.setObjem(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 88 + offset, rawVal, 0, 12);
                ktgruzRow.setKodGrGng(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[7];
                System.arraycopy(modelData, 100 + offset, rawVal, 0, 7);
                ktgruzRow.setKodGrzGng(new BigInteger(rawVal));
            }

            {
                byte[] rawVal = new byte[36];
                System.arraycopy(modelData, 107 + offset, rawVal, 0, 36);
                ktgruzRow.setNaimGrGng(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 143 + offset, rawVal, 0, 4);
                ktgruzRow.setNomSpOoh(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[3];
                System.arraycopy(modelData, 147 + offset, rawVal, 0, 3);
                ktgruzRow.setUslNomOpasGr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[3];
                System.arraycopy(modelData, 150 + offset, rawVal, 0, 3);
                ktgruzRow.setNomAvKart(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            omd.addKtgruzRow(ktgruzRow);

            offset += 153;
        }

        for (int i = 0; i < omd.getKtovag(); i++) {

            PfmxOmdKtovagRow ktovagRow = new PfmxOmdKtovagRow();

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 0 + offset, rawVal, 0, 12);
                ktovagRow.setIdOtprk(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 12 + offset, rawVal, 0, 12);
                ktovagRow.setNomVag(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 24 + offset, rawVal, 0, 2);
                ktovagRow.setDorRasch(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 26 + offset, rawVal, 0, 4);
                ktovagRow.setNomVagInt(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 30 + offset, rawVal, 0, 2);
                ktovagRow.setNppVag(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 32 + offset, rawVal, 0, 2);
                ktovagRow.setKodSob(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 34 + offset, rawVal, 0, 2);
                ktovagRow.setOtmRol(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 36 + offset, rawVal, 0, 2);
                ktovagRow.setRodVagUch(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 38 + offset, rawVal, 0, 2);
                ktovagRow.setKolOsey(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 40 + offset, rawVal, 0, 2);
                ktovagRow.setGrpVag(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 42 + offset, rawVal, 0, 2);
                ktovagRow.setDopNormZagr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 44 + offset, rawVal, 0, 2);
                ktovagRow.setTexNormZagr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 46 + offset, rawVal, 0, 1);
                ktovagRow.setPrSob(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 47 + offset, rawVal, 0, 4);
                ktovagRow.setMasGr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[13];
                System.arraycopy(modelData, 51 + offset, rawVal, 0, 13);
                ktovagRow.setTarifVag(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[5];
                System.arraycopy(modelData, 64 + offset, rawVal, 0, 5);
                ktovagRow.setKolMest(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 69 + offset, rawVal, 0, 12);
                ktovagRow.setPrim(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[5];
                System.arraycopy(modelData, 81 + offset, rawVal, 0, 5);
                ktovagRow.setObKuzova(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[5];
                System.arraycopy(modelData, 86 + offset, rawVal, 0, 5);
                ktovagRow.setDlRama(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 91 + offset, rawVal, 0, 2);
                ktovagRow.setVesTarBrus(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 93 + offset, rawVal, 0, 2);
                ktovagRow.setVesTarProv(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 95 + offset, rawVal, 0, 2);
                ktovagRow.setVesGrRasch(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 97 + offset, rawVal, 0, 4);
                ktovagRow.setMasGrPereg(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 101 + offset, rawVal, 0, 2);
                ktovagRow.setVzliv(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 103 + offset, rawVal, 0, 2);
                ktovagRow.setPlPol(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 105 + offset, rawVal, 0, 6);
                ktovagRow.setMnkDorSob(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 111 + offset, rawVal, 0, 2);
                ktovagRow.setSlPriz(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 113 + offset, rawVal, 0, 2);
                ktovagRow.setPrKorVmd(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 115 + offset, rawVal, 0, 2);
                ktovagRow.setPrKor406(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 117 + offset, rawVal, 0, 1);
                ktovagRow.setPrOtc(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            omd.addKtovagRow(ktovagRow);

            offset += 118;
        }

        for (int i = 0; i < omd.getKtokont(); i++) {

            PfmxOmdKtokontRow ktokontRow = new PfmxOmdKtokontRow();

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 0 + offset, rawVal, 0, 12);
                ktokontRow.setIdOtprk(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[11];
                System.arraycopy(modelData, 12 + offset, rawVal, 0, 11);
                ktokontRow.setNomKon(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 23 + offset, rawVal, 0, 2);
                ktokontRow.setDorRasch(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 25 + offset, rawVal, 0, 2);
                ktokontRow.setNppKon(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 27 + offset, rawVal, 0, 2);
                ktokontRow.setGrpKon(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 29 + offset, rawVal, 0, 2);
                ktokontRow.setTexNormZagr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 31 + offset, rawVal, 0, 4);
                ktokontRow.setMasGr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 35 + offset, rawVal, 0, 4);
                ktokontRow.setVesTar(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 39 + offset, rawVal, 0, 4);
                ktokontRow.setMasBr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[13];
                System.arraycopy(modelData, 43 + offset, rawVal, 0, 13);
                ktokontRow.setTarifKon(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 56 + offset, rawVal, 0, 2);
                ktokontRow.setKodStrSob(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 58 + offset, rawVal, 0, 2);
                ktokontRow.setKodTipKon(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 60 + offset, rawVal, 0, 2);
                ktokontRow.setKodRazKon(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[5];
                System.arraycopy(modelData, 62 + offset, rawVal, 0, 5);
                ktokontRow.setKolMest(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 67 + offset, rawVal, 0, 6);
                ktokontRow.setMnkDorSob(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 73 + offset, rawVal, 0, 1);
                ktokontRow.setPrSob(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 74 + offset, rawVal, 0, 1);
                ktokontRow.setPrOxr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 75 + offset, rawVal, 0, 2);
                ktokontRow.setPrKor402(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 77 + offset, rawVal, 0, 2);
                ktokontRow.setPrKor405(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            omd.addKtokontRow(ktokontRow);

            offset += 79;
        }

        for (int i = 0; i < omd.getKtooper(); i++) {

            PfmxOmdKtooperRow ktooperRow = new PfmxOmdKtooperRow();

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 0 + offset, rawVal, 0, 12);
                ktooperRow.setIdOtprk(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[19];
                System.arraycopy(modelData, 12 + offset, rawVal, 0, 19);
                ktooperRow.setDateOp(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 31 + offset, rawVal, 0, 2);
                ktooperRow.setKopOmd(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 33 + offset, rawVal, 0, 2);
                ktooperRow.setDorRasch(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 35 + offset, rawVal, 0, 4);
                ktooperRow.setStOp(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 39 + offset, rawVal, 0, 1);
                ktooperRow.setPrPoslOp(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 40 + offset, rawVal, 0, 6);
                ktooperRow.setKpp(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[3];
                System.arraycopy(modelData, 46 + offset, rawVal, 0, 3);
                ktooperRow.setKoper(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 49 + offset, rawVal, 0, 4);
                ktooperRow.setKvs(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 53 + offset, rawVal, 0, 2);
                ktooperRow.setKopVs(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[19];
                System.arraycopy(modelData, 55 + offset, rawVal, 0, 19);
                ktooperRow.setDatePs(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[15];
                System.arraycopy(modelData, 74 + offset, rawVal, 0, 15);
                ktooperRow.setIndexPoezd(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 89 + offset, rawVal, 0, 12);
                ktooperRow.setNomVag(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 101 + offset, rawVal, 0, 2);
                ktooperRow.setPrichOtc(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[7];
                System.arraycopy(modelData, 103 + offset, rawVal, 0, 7);
                ktooperRow.setNomAkt(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[32];
                System.arraycopy(modelData, 110 + offset, rawVal, 0, 32);
                ktooperRow.setNaimStDor(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 142 + offset, rawVal, 0, 1);
                ktooperRow.setTipAkta(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[16];
                System.arraycopy(modelData, 143 + offset, rawVal, 0, 16);
                ktooperRow.setShOperOt(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[16];
                System.arraycopy(modelData, 159 + offset, rawVal, 0, 16);
                ktooperRow.setShPosPodt(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            omd.addKtooperRow(ktooperRow);

            offset += 175;
        }

        for (int i = 0; i < omd.getKttkoor(); i++) {

            PfmxOmdKttkoorRow kttkoorRow = new PfmxOmdKttkoorRow();

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 0 + offset, rawVal, 0, 12);
                kttkoorRow.setIdOtprk(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 12 + offset, rawVal, 0, 2);
                kttkoorRow.setNppKoord(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 14 + offset, rawVal, 0, 2);
                kttkoorRow.setDorRasch(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 16 + offset, rawVal, 0, 6);
                kttkoorRow.setKodKoord(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[20];
                System.arraycopy(modelData, 22 + offset, rawVal, 0, 20);
                kttkoorRow.setZnKoord(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 42 + offset, rawVal, 0, 4);
                kttkoorRow.setKodSoob(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            omd.addKttkoorRow(kttkoorRow);

            offset += 46;
        }

        for (int i = 0; i < omd.getKtootm(); i++) {

            PfmxOmdKtootmRow ktootmRow = new PfmxOmdKtootmRow();

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 0 + offset, rawVal, 0, 12);
                ktootmRow.setIdOtprk(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 12 + offset, rawVal, 0, 2);
                ktootmRow.setNppOtm(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 14 + offset, rawVal, 0, 2);
                ktootmRow.setDorRasch(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 16 + offset, rawVal, 0, 2);
                ktootmRow.setPrPechOtm(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[35];
                System.arraycopy(modelData, 18 + offset, rawVal, 0, 35);
                ktootmRow.setTextOtm(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 53 + offset, rawVal, 0, 4);
                ktootmRow.setKodSoob(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            omd.addKtootmRow(ktootmRow);

            offset += 57;
        }

        for (int i = 0; i < omd.getKtperead(); i++) {

            PfmxOmdKtpereadRow ktpereadRow = new PfmxOmdKtpereadRow();

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 0 + offset, rawVal, 0, 12);
                ktpereadRow.setIdOtprk(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[19];
                System.arraycopy(modelData, 12 + offset, rawVal, 0, 19);
                ktpereadRow.setDatePeread(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 31 + offset, rawVal, 0, 2);
                ktpereadRow.setDorRasch(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[10];
                System.arraycopy(modelData, 33 + offset, rawVal, 0, 10);
                ktpereadRow.setNomRasp(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[15];
                System.arraycopy(modelData, 43 + offset, rawVal, 0, 15);
                ktpereadRow.setDolgOtv(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[15];
                System.arraycopy(modelData, 58 + offset, rawVal, 0, 15);
                ktpereadRow.setFamOtv(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 73 + offset, rawVal, 0, 6);
                ktpereadRow.setTelgKod(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[15];
                System.arraycopy(modelData, 79 + offset, rawVal, 0, 15);
                ktpereadRow.setFamTvk(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 94 + offset, rawVal, 0, 4);
                ktpereadRow.setStPeread(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[25];
                System.arraycopy(modelData, 98 + offset, rawVal, 0, 25);
                ktpereadRow.setNaimStPeread(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[25];
                System.arraycopy(modelData, 123 + offset, rawVal, 0, 25);
                ktpereadRow.setNaimDorPeread(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[19];
                System.arraycopy(modelData, 148 + offset, rawVal, 0, 19);
                ktpereadRow.setDateIzdPrikaza(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 167 + offset, rawVal, 0, 2);
                ktpereadRow.setKodDok(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[8];
                System.arraycopy(modelData, 169 + offset, rawVal, 0, 8);
                ktpereadRow.setSerNomDok(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 177 + offset, rawVal, 0, 4);
                ktpereadRow.setStNaznDp(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[25];
                System.arraycopy(modelData, 181 + offset, rawVal, 0, 25);
                ktpereadRow.setNaimStDp(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[25];
                System.arraycopy(modelData, 206 + offset, rawVal, 0, 25);
                ktpereadRow.setNaimDorDp(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 231 + offset, rawVal, 0, 2);
                ktpereadRow.setKodGruzopolDp(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 233 + offset, rawVal, 0, 12);
                ktpereadRow.setKodGruzopolInd(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[90];
                System.arraycopy(modelData, 245 + offset, rawVal, 0, 90);
                ktpereadRow.setNaimGrpolDp(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[9];
                System.arraycopy(modelData, 335 + offset, rawVal, 0, 9);
                ktpereadRow.setPochIndexPol(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[35];
                System.arraycopy(modelData, 344 + offset, rawVal, 0, 35);
                ktpereadRow.setNpochAdGrpolDp(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[35];
                System.arraycopy(modelData, 379 + offset, rawVal, 0, 35);
                ktpereadRow.setOpochAdGrpolDp(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 414 + offset, rawVal, 0, 2);
                ktpereadRow.setKodStrNaznDp(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 416 + offset, rawVal, 0, 2);
                ktpereadRow.setPriznakOperacii(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[24];
                System.arraycopy(modelData, 418 + offset, rawVal, 0, 24);
                ktpereadRow.setSrDost(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            omd.addKtpereadRow(ktpereadRow);

            offset += 442;
        }

        for (int i = 0; i < omd.getKtplat(); i++) {

            PfmxOmdKtplatRow ktplatRow = new PfmxOmdKtplatRow();

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 0 + offset, rawVal, 0, 12);
                ktplatRow.setIdOtprk(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 12 + offset, rawVal, 0, 2);
                ktplatRow.setNppUch(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 14 + offset, rawVal, 0, 2);
                ktplatRow.setDorRasch(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 16 + offset, rawVal, 0, 2);
                ktplatRow.setNppUt(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 18 + offset, rawVal, 0, 4);
                ktplatRow.setStNut(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 22 + offset, rawVal, 0, 4);
                ktplatRow.setStKut(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 26 + offset, rawVal, 0, 1);
                ktplatRow.setPrSpecUt(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 27 + offset, rawVal, 0, 2);
                ktplatRow.setTarifRast(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 29 + offset, rawVal, 0, 2);
                ktplatRow.setTarifSh(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 31 + offset, rawVal, 0, 1);
                ktplatRow.setPrTarif(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 32 + offset, rawVal, 0, 4);
                ktplatRow.setMasGrRasch(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 36 + offset, rawVal, 0, 4);
                ktplatRow.setStavka(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 40 + offset, rawVal, 0, 1);
                ktplatRow.setPrOplPlat(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[8];
                System.arraycopy(modelData, 41 + offset, rawVal, 0, 8);
                ktplatRow.setTarifKoeff(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[8];
                System.arraycopy(modelData, 49 + offset, rawVal, 0, 8);
                ktplatRow.setKodDogExp(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 57 + offset, rawVal, 0, 6);
                ktplatRow.setKodDogOxr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 63 + offset, rawVal, 0, 4);
                ktplatRow.setParol(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 67 + offset, rawVal, 0, 6);
                ktplatRow.setKodExp(new BigInteger(rawVal));
            }

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 73 + offset, rawVal, 0, 12);
                ktplatRow.setPodkodExp(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[90];
                System.arraycopy(modelData, 85 + offset, rawVal, 0, 90);
                ktplatRow.setNaimExp(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[15];
                System.arraycopy(modelData, 175 + offset, rawVal, 0, 15);
                ktplatRow.setTelexExp(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 190 + offset, rawVal, 0, 2);
                ktplatRow.setNomGrafBl(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 192 + offset, rawVal, 0, 2);
                ktplatRow.setKodAdmOpl(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[25];
                System.arraycopy(modelData, 194 + offset, rawVal, 0, 25);
                ktplatRow.setNaimStNut(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[25];
                System.arraycopy(modelData, 219 + offset, rawVal, 0, 25);
                ktplatRow.setNaimStKut(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 244 + offset, rawVal, 0, 2);
                ktplatRow.setKodValPl(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 246 + offset, rawVal, 0, 2);
                ktplatRow.setKodStrPl(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 248 + offset, rawVal, 0, 4);
                ktplatRow.setKursVal(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            omd.addKtplatRow(ktplatRow);

            offset += 252;
        }

        for (int i = 0; i < omd.getKtoakt(); i++) {

            PfmxOmdKtoaktRow ktoaktRow = new PfmxOmdKtoaktRow();

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 0 + offset, rawVal, 0, 12);
                ktoaktRow.setIdOtprk(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 12 + offset, rawVal, 0, 2);
                ktoaktRow.setKodAkt(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 14 + offset, rawVal, 0, 4);
                ktoaktRow.setStObnBrak(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[19];
                System.arraycopy(modelData, 18 + offset, rawVal, 0, 19);
                ktoaktRow.setDateObnBrak(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 37 + offset, rawVal, 0, 2);
                ktoaktRow.setDorRasch(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 39 + offset, rawVal, 0, 2);
                ktoaktRow.setNomAkt(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 41 + offset, rawVal, 0, 6);
                ktoaktRow.setKpp(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[3];
                System.arraycopy(modelData, 47 + offset, rawVal, 0, 3);
                ktoaktRow.setKoper(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 50 + offset, rawVal, 0, 6);
                ktoaktRow.setKps(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[32];
                System.arraycopy(modelData, 56 + offset, rawVal, 0, 32);
                ktoaktRow.setNomAktKom(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[7];
                System.arraycopy(modelData, 88 + offset, rawVal, 0, 7);
                ktoaktRow.setKodBrak(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 95 + offset, rawVal, 0, 2);
                ktoaktRow.setKodAktPsd(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            omd.addKtoaktRow(ktoaktRow);

            offset += 97;
        }

        for (int i = 0; i < omd.getKtvpereg(); i++) {

            PfmxOmdKtvperegRow ktvperegRow = new PfmxOmdKtvperegRow();

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 0 + offset, rawVal, 0, 12);
                ktvperegRow.setIdOtprk(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 12 + offset, rawVal, 0, 12);
                ktvperegRow.setNomVagPr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 24 + offset, rawVal, 0, 2);
                ktvperegRow.setDorRasch(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 26 + offset, rawVal, 0, 4);
                ktvperegRow.setNomVagPrInt(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 30 + offset, rawVal, 0, 2);
                ktvperegRow.setKodSobPr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 32 + offset, rawVal, 0, 2);
                ktvperegRow.setOtmRolPr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 34 + offset, rawVal, 0, 2);
                ktvperegRow.setRodVagPr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 36 + offset, rawVal, 0, 2);
                ktvperegRow.setKolOseyPr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 38 + offset, rawVal, 0, 2);
                ktvperegRow.setGrpVagPr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 40 + offset, rawVal, 0, 4);
                ktvperegRow.setMasGrPr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 44 + offset, rawVal, 0, 4);
                ktvperegRow.setMasGrTarPr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 48 + offset, rawVal, 0, 4);
                ktvperegRow.setMasGrBrPr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[13];
                System.arraycopy(modelData, 52 + offset, rawVal, 0, 13);
                ktvperegRow.setTarifVagPr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[5];
                System.arraycopy(modelData, 65 + offset, rawVal, 0, 5);
                ktvperegRow.setKolMestPr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[3];
                System.arraycopy(modelData, 70 + offset, rawVal, 0, 3);
                ktvperegRow.setTipCistPr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[5];
                System.arraycopy(modelData, 73 + offset, rawVal, 0, 5);
                ktvperegRow.setObKuzPr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 78 + offset, rawVal, 0, 12);
                ktvperegRow.setPrimPr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 90 + offset, rawVal, 0, 4);
                ktvperegRow.setNegabPr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 94 + offset, rawVal, 0, 2);
                ktvperegRow.setKolProvPr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 96 + offset, rawVal, 0, 1);
                ktvperegRow.setKodScepPr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[7];
                System.arraycopy(modelData, 97 + offset, rawVal, 0, 7);
                ktvperegRow.setTempRegimPr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 104 + offset, rawVal, 0, 2);
                ktvperegRow.setVsNalPr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 106 + offset, rawVal, 0, 2);
                ktvperegRow.setKvmdPr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 108 + offset, rawVal, 0, 2);
                ktvperegRow.setPrVagOtpPr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 110 + offset, rawVal, 0, 4);
                ktvperegRow.setStanPeregPr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[19];
                System.arraycopy(modelData, 114 + offset, rawVal, 0, 19);
                ktvperegRow.setDatePr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 133 + offset, rawVal, 0, 12);
                ktvperegRow.setNomVagVgr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 145 + offset, rawVal, 0, 4);
                ktvperegRow.setNomVagVgrInt(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 149 + offset, rawVal, 0, 2);
                ktvperegRow.setPrKor406(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 151 + offset, rawVal, 0, 4);
                ktvperegRow.setProbegVag(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            omd.addKtvperegRow(ktvperegRow);

            offset += 155;
        }

        for (int i = 0; i < omd.getKtkpereg(); i++) {

            PfmxOmdKtkperegRow ktkperegRow = new PfmxOmdKtkperegRow();

            {
                byte[] rawVal = new byte[12];
                System.arraycopy(modelData, 0 + offset, rawVal, 0, 12);
                ktkperegRow.setIdOtprk(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[11];
                System.arraycopy(modelData, 12 + offset, rawVal, 0, 11);
                ktkperegRow.setNomKonPr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 23 + offset, rawVal, 0, 2);
                ktkperegRow.setDorRasch(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 25 + offset, rawVal, 0, 2);
                ktkperegRow.setGrpKonPr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 27 + offset, rawVal, 0, 2);
                ktkperegRow.setTexNormZagrPr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 29 + offset, rawVal, 0, 4);
                ktkperegRow.setMasGrPr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 33 + offset, rawVal, 0, 4);
                ktkperegRow.setMasTarPr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 37 + offset, rawVal, 0, 4);
                ktkperegRow.setMasBrPr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 41 + offset, rawVal, 0, 2);
                ktkperegRow.setKodStrSobPr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 43 + offset, rawVal, 0, 2);
                ktkperegRow.setKodTipKonPr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 45 + offset, rawVal, 0, 2);
                ktkperegRow.setKodRazKonPr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[5];
                System.arraycopy(modelData, 47 + offset, rawVal, 0, 5);
                ktkperegRow.setKolMestPr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[6];
                System.arraycopy(modelData, 52 + offset, rawVal, 0, 6);
                ktkperegRow.setMnkDorSobPr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 58 + offset, rawVal, 0, 1);
                ktkperegRow.setPrSobPr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[1];
                System.arraycopy(modelData, 59 + offset, rawVal, 0, 1);
                ktkperegRow.setPrOxrPr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 60 + offset, rawVal, 0, 2);
                ktkperegRow.setPrKor402Pr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 62 + offset, rawVal, 0, 2);
                ktkperegRow.setPrKonOtpPr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[4];
                System.arraycopy(modelData, 64 + offset, rawVal, 0, 4);
                ktkperegRow.setStanPeregPr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
            }

            {
                byte[] rawVal = new byte[19];
                System.arraycopy(modelData, 68 + offset, rawVal, 0, 19);
                ktkperegRow.setDatePr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[11];
                System.arraycopy(modelData, 87 + offset, rawVal, 0, 11);
                ktkperegRow.setNomKonVgrPr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[2];
                System.arraycopy(modelData, 98 + offset, rawVal, 0, 2);
                ktkperegRow.setPrKor405Pr(new String(rawVal, Charset.forName(PfmxParser.CHARSET)).trim());
            }

            {
                byte[] rawVal = new byte[100];
                System.arraycopy(modelData, 100 + offset, rawVal, 0, 100);
                ktkperegRow.setDopForSluOmd(rawVal);
            }

            omd.addKtkperegRow(ktkperegRow);

            offset += 200;
        }

        pfmx.addOmdRow(omd);

    }
}
