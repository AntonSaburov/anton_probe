package ru.ocrv.asoup3.pfmx.parser;

import static ru.ocrv.asoup3.pfmx.PfmxParser.CHARSET;

import java.nio.charset.Charset;

import ru.ocrv.asoup3.pfmx.model.PfmxLmdRow;
import ru.ocrv.asoup3.pfmx.model.PfmxMessage;
import ru.ocrv.asoup3.pfmx.util.ClassUtil;

public class PfmxLmdParser implements PfmxModelParser {

    public void processRow(PfmxMessage pfmx, byte[] modelData, int localOffset, int modelLength) {

        PfmxLmdRow lmd = new PfmxLmdRow();
        lmd.setRowLength(modelLength);

        int offset = 4 + localOffset;

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 0 + offset, rawVal, 0, 2);
            lmd.setPrTfz1(new Short((ClassUtil.byteArrayToShort(rawVal))));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 2 + offset, rawVal, 0, 10);
            lmd.setPrTfz2(rawVal);
        }

        {
            byte[] rawVal = new byte[3];
            System.arraycopy(modelData, 12 + offset, rawVal, 0, 3);
            lmd.setSerLoc(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[8];
            System.arraycopy(modelData, 15 + offset, rawVal, 0, 8);
            lmd.setZnsLoc(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 23 + offset, rawVal, 0, 2);
            lmd.setPrsLoc(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 25 + offset, rawVal, 0, 1);
            lmd.setPrzLoc(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 26 + offset, rawVal, 0, 2);
            lmd.setDorRasch(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 28 + offset, rawVal, 0, 2);
            lmd.setKopLmd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 30 + offset, rawVal, 0, 19);
            lmd.setDateOp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 49 + offset, rawVal, 0, 1);
            lmd.setPssLoc(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[15];
            System.arraycopy(modelData, 50 + offset, rawVal, 0, 15);
            lmd.setIndexPoezd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 65 + offset, rawVal, 0, 2);
            lmd.setNomPoezd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 67 + offset, rawVal, 0, 2);
            lmd.setVesBr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 69 + offset, rawVal, 0, 2);
            lmd.setVesNet(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 71 + offset, rawVal, 0, 2);
            lmd.setPsp(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 73 + offset, rawVal, 0, 2);
            lmd.setPrrl(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 75 + offset, rawVal, 0, 4);
            lmd.setProbTo2(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 79 + offset, rawVal, 0, 4);
            lmd.setProbLin(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 83 + offset, rawVal, 0, 4);
            lmd.setProbUsl(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 87 + offset, rawVal, 0, 1);
            lmd.setPrPrVv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 88 + offset, rawVal, 0, 2);
            lmd.setKodSost(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 90 + offset, rawVal, 0, 2);
            lmd.setKopS(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 92 + offset, rawVal, 0, 19);
            lmd.setDateOpS(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 111 + offset, rawVal, 0, 1);
            lmd.setPrOted(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 112 + offset, rawVal, 0, 4);
            lmd.setKodOb(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 116 + offset, rawVal, 0, 4);
            lmd.setStanOp(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[6];
            System.arraycopy(modelData, 120 + offset, rawVal, 0, 6);
            lmd.setDepoOp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 126 + offset, rawVal, 0, 4);
            lmd.setNaprOtpr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 130 + offset, rawVal, 0, 4);
            lmd.setNaprPrib(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 134 + offset, rawVal, 0, 4);
            lmd.setNbe(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 138 + offset, rawVal, 0, 4);
            lmd.setUobdDis(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 142 + offset, rawVal, 0, 2);
            lmd.setOcDis(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 144 + offset, rawVal, 0, 2);
            lmd.setOtdDis(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 146 + offset, rawVal, 0, 2);
            lmd.setDorDis(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 148 + offset, rawVal, 0, 2);
            lmd.setRgnDis(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 150 + offset, rawVal, 0, 1);
            lmd.setPrNezUch(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 151 + offset, rawVal, 0, 2);
            lmd.setKopD(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 153 + offset, rawVal, 0, 19);
            lmd.setDateOpD(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 172 + offset, rawVal, 0, 4);
            lmd.setStykPriemDor(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 176 + offset, rawVal, 0, 2);
            lmd.setDorSdach(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 178 + offset, rawVal, 0, 19);
            lmd.setDatePriemDor(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 197 + offset, rawVal, 0, 2);
            lmd.setVidDv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 199 + offset, rawVal, 0, 2);
            lmd.setKopR(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 201 + offset, rawVal, 0, 19);
            lmd.setDateOpR(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 220 + offset, rawVal, 0, 2);
            lmd.setVidParka(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 222 + offset, rawVal, 0, 2);
            lmd.setKopU(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 224 + offset, rawVal, 0, 19);
            lmd.setDateOpU(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 243 + offset, rawVal, 0, 2);
            lmd.setKopC(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 245 + offset, rawVal, 0, 19);
            lmd.setDateOpC(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 264 + offset, rawVal, 0, 2);
            lmd.setDorPrip(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 266 + offset, rawVal, 0, 2);
            lmd.setDepoPrip(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 268 + offset, rawVal, 0, 2);
            lmd.setVidDvPr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 270 + offset, rawVal, 0, 2);
            lmd.setVidDvVsp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 272 + offset, rawVal, 0, 4);
            lmd.setUchObr1(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 276 + offset, rawVal, 0, 4);
            lmd.setUchObr2(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 280 + offset, rawVal, 0, 4);
            lmd.setUchObr3(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 284 + offset, rawVal, 0, 4);
            lmd.setUchObr4(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 288 + offset, rawVal, 0, 4);
            lmd.setUchObr5(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 292 + offset, rawVal, 0, 1);
            lmd.setPriznAren(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 293 + offset, rawVal, 0, 1);
            lmd.setPriznSob(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[8];
            System.arraycopy(modelData, 294 + offset, rawVal, 0, 8);
            lmd.setOkpoSob(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 302 + offset, rawVal, 0, 2);
            lmd.setKopSz(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 304 + offset, rawVal, 0, 19);
            lmd.setDateOpSz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[8];
            System.arraycopy(modelData, 323 + offset, rawVal, 0, 8);
            lmd.setZns8zn1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 331 + offset, rawVal, 0, 2);
            lmd.setKopVkl1(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 333 + offset, rawVal, 0, 19);
            lmd.setDateVkl1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 352 + offset, rawVal, 0, 10);
            lmd.setDatePostr1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 362 + offset, rawVal, 0, 4);
            lmd.setProbPostr1(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 366 + offset, rawVal, 0, 10);
            lmd.setDateKrp1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 376 + offset, rawVal, 0, 4);
            lmd.setProbKrp1(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 380 + offset, rawVal, 0, 10);
            lmd.setDateKr21(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 390 + offset, rawVal, 0, 4);
            lmd.setProbKr21(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 394 + offset, rawVal, 0, 4);
            lmd.setNepKr21(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 398 + offset, rawVal, 0, 1);
            lmd.setPrFKr21(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 399 + offset, rawVal, 0, 10);
            lmd.setDateKr11(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 409 + offset, rawVal, 0, 4);
            lmd.setProbKr11(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 413 + offset, rawVal, 0, 4);
            lmd.setNepKr11(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 417 + offset, rawVal, 0, 1);
            lmd.setPrFKr11(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 418 + offset, rawVal, 0, 10);
            lmd.setDateTr31(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 428 + offset, rawVal, 0, 4);
            lmd.setProbTr31(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 432 + offset, rawVal, 0, 4);
            lmd.setNepTr31(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 436 + offset, rawVal, 0, 1);
            lmd.setNppTr31(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 437 + offset, rawVal, 0, 1);
            lmd.setPrFTr31(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 438 + offset, rawVal, 0, 10);
            lmd.setDateTr21(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 448 + offset, rawVal, 0, 4);
            lmd.setProbTr21(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 452 + offset, rawVal, 0, 4);
            lmd.setNepTr21(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 456 + offset, rawVal, 0, 1);
            lmd.setNppTr21(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 457 + offset, rawVal, 0, 1);
            lmd.setPrFTr21(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 458 + offset, rawVal, 0, 10);
            lmd.setDateTr11(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 468 + offset, rawVal, 0, 4);
            lmd.setProbTr11(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 472 + offset, rawVal, 0, 4);
            lmd.setNepTr11(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 476 + offset, rawVal, 0, 1);
            lmd.setNppTr11(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 477 + offset, rawVal, 0, 1);
            lmd.setPrFTr11(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 478 + offset, rawVal, 0, 10);
            lmd.setDateTo31(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 488 + offset, rawVal, 0, 4);
            lmd.setProbTo31(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 492 + offset, rawVal, 0, 4);
            lmd.setNepTo31(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 496 + offset, rawVal, 0, 1);
            lmd.setNppTo31(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 497 + offset, rawVal, 0, 1);
            lmd.setPrFTo31(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 498 + offset, rawVal, 0, 2);
            lmd.setKodPRem1(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 500 + offset, rawVal, 0, 19);
            lmd.setDateNach1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 519 + offset, rawVal, 0, 1);
            lmd.setPriznOkon1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 520 + offset, rawVal, 0, 4);
            lmd.setMestoRem1(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 524 + offset, rawVal, 0, 4);
            lmd.setProdRem1(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 528 + offset, rawVal, 0, 19);
            lmd.setDateOkon1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 547 + offset, rawVal, 0, 4);
            lmd.setProbUsl1(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 551 + offset, rawVal, 0, 4);
            lmd.setProbLin1(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[8];
            System.arraycopy(modelData, 555 + offset, rawVal, 0, 8);
            lmd.setZnsLoc2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 563 + offset, rawVal, 0, 2);
            lmd.setPrsLoc2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[8];
            System.arraycopy(modelData, 565 + offset, rawVal, 0, 8);
            lmd.setZns8zn2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 573 + offset, rawVal, 0, 2);
            lmd.setKopVkl2(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 575 + offset, rawVal, 0, 19);
            lmd.setDateVkl2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 594 + offset, rawVal, 0, 10);
            lmd.setDatePostr2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 604 + offset, rawVal, 0, 4);
            lmd.setProbPostr2(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 608 + offset, rawVal, 0, 10);
            lmd.setDateKrp2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 618 + offset, rawVal, 0, 4);
            lmd.setProbKrp2(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 622 + offset, rawVal, 0, 10);
            lmd.setDateKr22(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 632 + offset, rawVal, 0, 4);
            lmd.setProbKr22(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 636 + offset, rawVal, 0, 4);
            lmd.setNepKr22(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 640 + offset, rawVal, 0, 1);
            lmd.setPrFKr22(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 641 + offset, rawVal, 0, 10);
            lmd.setDateKr12(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 651 + offset, rawVal, 0, 4);
            lmd.setProbKr12(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 655 + offset, rawVal, 0, 4);
            lmd.setNepKr12(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 659 + offset, rawVal, 0, 1);
            lmd.setPrFKr12(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 660 + offset, rawVal, 0, 10);
            lmd.setDateTr32(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 670 + offset, rawVal, 0, 4);
            lmd.setProbTr32(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 674 + offset, rawVal, 0, 4);
            lmd.setNepTr32(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 678 + offset, rawVal, 0, 1);
            lmd.setNppTr32(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 679 + offset, rawVal, 0, 1);
            lmd.setPrFTr32(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 680 + offset, rawVal, 0, 10);
            lmd.setDateTr22(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 690 + offset, rawVal, 0, 4);
            lmd.setProbTr22(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 694 + offset, rawVal, 0, 4);
            lmd.setNepTr22(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 698 + offset, rawVal, 0, 1);
            lmd.setNppTr22(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 699 + offset, rawVal, 0, 1);
            lmd.setPrFTr22(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 700 + offset, rawVal, 0, 10);
            lmd.setDateTr12(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 710 + offset, rawVal, 0, 4);
            lmd.setProbTr12(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 714 + offset, rawVal, 0, 4);
            lmd.setNepTr12(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 718 + offset, rawVal, 0, 1);
            lmd.setNppTr12(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 719 + offset, rawVal, 0, 1);
            lmd.setPrFTr12(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 720 + offset, rawVal, 0, 10);
            lmd.setDateTo32(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 730 + offset, rawVal, 0, 4);
            lmd.setProbTo32(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 734 + offset, rawVal, 0, 4);
            lmd.setNepTo32(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 738 + offset, rawVal, 0, 1);
            lmd.setNppTo32(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 739 + offset, rawVal, 0, 1);
            lmd.setPrFTo32(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 740 + offset, rawVal, 0, 2);
            lmd.setKodPRem2(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 742 + offset, rawVal, 0, 19);
            lmd.setDateNach2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 761 + offset, rawVal, 0, 1);
            lmd.setPriznOkon2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 762 + offset, rawVal, 0, 4);
            lmd.setMestoRem2(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 766 + offset, rawVal, 0, 4);
            lmd.setProdRem2(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 770 + offset, rawVal, 0, 19);
            lmd.setDateOkon2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 789 + offset, rawVal, 0, 4);
            lmd.setProbUsl2(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 793 + offset, rawVal, 0, 4);
            lmd.setProbLin2(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[8];
            System.arraycopy(modelData, 797 + offset, rawVal, 0, 8);
            lmd.setZnsLoc3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 805 + offset, rawVal, 0, 2);
            lmd.setPrsLoc3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[8];
            System.arraycopy(modelData, 807 + offset, rawVal, 0, 8);
            lmd.setZns8zn3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 815 + offset, rawVal, 0, 2);
            lmd.setKopVkl3(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 817 + offset, rawVal, 0, 19);
            lmd.setDateVkl3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 836 + offset, rawVal, 0, 10);
            lmd.setDatePostr3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 846 + offset, rawVal, 0, 4);
            lmd.setProbPostr3(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 850 + offset, rawVal, 0, 10);
            lmd.setDateKrp3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 860 + offset, rawVal, 0, 4);
            lmd.setProbKrp3(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 864 + offset, rawVal, 0, 10);
            lmd.setDateKr23(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 874 + offset, rawVal, 0, 4);
            lmd.setProbKr23(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 878 + offset, rawVal, 0, 4);
            lmd.setNepKr23(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 882 + offset, rawVal, 0, 1);
            lmd.setPrFKr23(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 883 + offset, rawVal, 0, 10);
            lmd.setDateKr13(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 893 + offset, rawVal, 0, 4);
            lmd.setProbKr13(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 897 + offset, rawVal, 0, 4);
            lmd.setNepKr13(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 901 + offset, rawVal, 0, 1);
            lmd.setPrFKr13(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 902 + offset, rawVal, 0, 10);
            lmd.setDateTr33(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 912 + offset, rawVal, 0, 4);
            lmd.setProbTr33(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 916 + offset, rawVal, 0, 4);
            lmd.setNepTr33(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 920 + offset, rawVal, 0, 1);
            lmd.setNppTr33(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 921 + offset, rawVal, 0, 1);
            lmd.setPrFTr33(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 922 + offset, rawVal, 0, 10);
            lmd.setDateTr23(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 932 + offset, rawVal, 0, 4);
            lmd.setProbTr23(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 936 + offset, rawVal, 0, 4);
            lmd.setNepTr23(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 940 + offset, rawVal, 0, 1);
            lmd.setNppTr23(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 941 + offset, rawVal, 0, 1);
            lmd.setPrFTr23(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 942 + offset, rawVal, 0, 10);
            lmd.setDateTr13(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 952 + offset, rawVal, 0, 4);
            lmd.setProbTr13(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 956 + offset, rawVal, 0, 4);
            lmd.setNepTr13(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 960 + offset, rawVal, 0, 1);
            lmd.setNppTr13(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 961 + offset, rawVal, 0, 1);
            lmd.setPrFTr13(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 962 + offset, rawVal, 0, 10);
            lmd.setDateTo33(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 972 + offset, rawVal, 0, 4);
            lmd.setProbTo33(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 976 + offset, rawVal, 0, 4);
            lmd.setNepTo33(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 980 + offset, rawVal, 0, 1);
            lmd.setNppTo33(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 981 + offset, rawVal, 0, 1);
            lmd.setPrFTo33(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 982 + offset, rawVal, 0, 2);
            lmd.setKodPRem3(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 984 + offset, rawVal, 0, 19);
            lmd.setDateNach3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1003 + offset, rawVal, 0, 1);
            lmd.setPriznOkon3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1004 + offset, rawVal, 0, 4);
            lmd.setMestoRem3(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1008 + offset, rawVal, 0, 4);
            lmd.setProdRem3(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1012 + offset, rawVal, 0, 19);
            lmd.setDateOkon3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1031 + offset, rawVal, 0, 4);
            lmd.setProbUsl3(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1035 + offset, rawVal, 0, 4);
            lmd.setProbLin3(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[8];
            System.arraycopy(modelData, 1039 + offset, rawVal, 0, 8);
            lmd.setZnsLoc4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1047 + offset, rawVal, 0, 2);
            lmd.setPrsLoc4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[8];
            System.arraycopy(modelData, 1049 + offset, rawVal, 0, 8);
            lmd.setZns8zn4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1057 + offset, rawVal, 0, 2);
            lmd.setKopVkl4(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1059 + offset, rawVal, 0, 19);
            lmd.setDateVkl4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 1078 + offset, rawVal, 0, 10);
            lmd.setDatePostr4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1088 + offset, rawVal, 0, 4);
            lmd.setProbPostr4(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 1092 + offset, rawVal, 0, 10);
            lmd.setDateKrp4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1102 + offset, rawVal, 0, 4);
            lmd.setProbKrp4(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 1106 + offset, rawVal, 0, 10);
            lmd.setDateKr24(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1116 + offset, rawVal, 0, 4);
            lmd.setProbKr24(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1120 + offset, rawVal, 0, 4);
            lmd.setNepKr24(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1124 + offset, rawVal, 0, 1);
            lmd.setPrFKr24(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 1125 + offset, rawVal, 0, 10);
            lmd.setDateKr14(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1135 + offset, rawVal, 0, 4);
            lmd.setProbKr14(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1139 + offset, rawVal, 0, 4);
            lmd.setNepKr14(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1143 + offset, rawVal, 0, 1);
            lmd.setPrFKr14(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 1144 + offset, rawVal, 0, 10);
            lmd.setDateTr34(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1154 + offset, rawVal, 0, 4);
            lmd.setProbTr34(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1158 + offset, rawVal, 0, 4);
            lmd.setNepTr34(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1162 + offset, rawVal, 0, 1);
            lmd.setNppTr34(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1163 + offset, rawVal, 0, 1);
            lmd.setPrFTr34(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 1164 + offset, rawVal, 0, 10);
            lmd.setDateTr24(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1174 + offset, rawVal, 0, 4);
            lmd.setProbTr24(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1178 + offset, rawVal, 0, 4);
            lmd.setNepTr24(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1182 + offset, rawVal, 0, 1);
            lmd.setNppTr24(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1183 + offset, rawVal, 0, 1);
            lmd.setPrFTr24(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 1184 + offset, rawVal, 0, 10);
            lmd.setDateTr14(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1194 + offset, rawVal, 0, 4);
            lmd.setProbTr14(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1198 + offset, rawVal, 0, 4);
            lmd.setNepTr14(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1202 + offset, rawVal, 0, 1);
            lmd.setNppTr14(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1203 + offset, rawVal, 0, 1);
            lmd.setPrFTr14(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 1204 + offset, rawVal, 0, 10);
            lmd.setDateTo34(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1214 + offset, rawVal, 0, 4);
            lmd.setProbTo34(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1218 + offset, rawVal, 0, 4);
            lmd.setNepTo34(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1222 + offset, rawVal, 0, 1);
            lmd.setNppTo34(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1223 + offset, rawVal, 0, 1);
            lmd.setPrFTo34(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1224 + offset, rawVal, 0, 2);
            lmd.setKodPRem4(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1226 + offset, rawVal, 0, 19);
            lmd.setDateNach4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1245 + offset, rawVal, 0, 1);
            lmd.setPriznOkon4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1246 + offset, rawVal, 0, 4);
            lmd.setMestoRem4(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1250 + offset, rawVal, 0, 4);
            lmd.setProdRem4(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1254 + offset, rawVal, 0, 19);
            lmd.setDateOkon4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1273 + offset, rawVal, 0, 4);
            lmd.setProbUsl4(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1277 + offset, rawVal, 0, 4);
            lmd.setProbLin4(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 1281 + offset, rawVal, 0, 9);
            lmd.setKpp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1290 + offset, rawVal, 0, 4);
            lmd.setKds(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1294 + offset, rawVal, 0, 19);
            lmd.setDvs(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1313 + offset, rawVal, 0, 1);
            lmd.setOtmNeskSost(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1314 + offset, rawVal, 0, 2);
            lmd.setKop1(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1316 + offset, rawVal, 0, 19);
            lmd.setDateOp1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1335 + offset, rawVal, 0, 2);
            lmd.setKop2(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1337 + offset, rawVal, 0, 19);
            lmd.setDateOp2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1356 + offset, rawVal, 0, 2);
            lmd.setKop3(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1358 + offset, rawVal, 0, 19);
            lmd.setDateOp3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1377 + offset, rawVal, 0, 2);
            lmd.setKop4(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1379 + offset, rawVal, 0, 19);
            lmd.setDateOp4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1398 + offset, rawVal, 0, 2);
            lmd.setKop5(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1400 + offset, rawVal, 0, 19);
            lmd.setDateOp5(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1419 + offset, rawVal, 0, 2);
            lmd.setUslDlPoezd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1421 + offset, rawVal, 0, 1);
            lmd.setKodPrikr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1422 + offset, rawVal, 0, 4);
            lmd.setIndNegab(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1426 + offset, rawVal, 0, 1);
            lmd.setOtmGivn(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1427 + offset, rawVal, 0, 1);
            lmd.setOtmMarsh(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1428 + offset, rawVal, 0, 2);
            lmd.setOgrSkor(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1430 + offset, rawVal, 0, 1);
            lmd.setPrOxr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1431 + offset, rawVal, 0, 2);
            lmd.setKolVag(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1433 + offset, rawVal, 0, 2);
            lmd.setVidOtklNorm(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1435 + offset, rawVal, 0, 2);
            lmd.setKodDor(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1437 + offset, rawVal, 0, 2);
            lmd.setKodPredp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[5];
            System.arraycopy(modelData, 1439 + offset, rawVal, 0, 5);
            lmd.setTnRab(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[15];
            System.arraycopy(modelData, 1444 + offset, rawVal, 0, 15);
            lmd.setName1Rab(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1459 + offset, rawVal, 0, 19);
            lmd.setDateBeg(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1478 + offset, rawVal, 0, 2);
            lmd.setRrFakt(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1480 + offset, rawVal, 0, 2);
            lmd.setRrNorm(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1482 + offset, rawVal, 0, 2);
            lmd.setPsb(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[8];
            System.arraycopy(modelData, 1484 + offset, rawVal, 0, 8);
            lmd.setOkpoSobBr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1492 + offset, rawVal, 0, 19);
            lmd.setDateTo2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1511 + offset, rawVal, 0, 4);
            lmd.setStanNazn(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1515 + offset, rawVal, 0, 4);
            lmd.setRazrKurs(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1519 + offset, rawVal, 0, 1);
            lmd.setPrKbd1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1520 + offset, rawVal, 0, 1);
            lmd.setPrKbd2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1521 + offset, rawVal, 0, 1);
            lmd.setPrKbd3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1522 + offset, rawVal, 0, 1);
            lmd.setPrKbd4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1523 + offset, rawVal, 0, 2);
            lmd.setPr1(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1525 + offset, rawVal, 0, 2);
            lmd.setPr2(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1527 + offset, rawVal, 0, 2);
            lmd.setPr3(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1529 + offset, rawVal, 0, 2);
            lmd.setPr4(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1531 + offset, rawVal, 0, 2);
            lmd.setNullDateOpS(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateOpS().intValue() == -1) {
                lmd.setDateOpS(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1533 + offset, rawVal, 0, 2);
            lmd.setNullDateOpD(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateOpD().intValue() == -1) {
                lmd.setDateOpD(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1535 + offset, rawVal, 0, 2);
            lmd.setNullDatePriemDor(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDatePriemDor().intValue() == -1) {
                lmd.setDatePriemDor(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1537 + offset, rawVal, 0, 2);
            lmd.setNullDateOpR(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateOpR().intValue() == -1) {
                lmd.setDateOpR(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1539 + offset, rawVal, 0, 2);
            lmd.setNullDateOpU(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateOpU().intValue() == -1) {
                lmd.setDateOpU(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1541 + offset, rawVal, 0, 2);
            lmd.setNullDateOpC(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateOpC().intValue() == -1) {
                lmd.setDateOpC(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1543 + offset, rawVal, 0, 2);
            lmd.setNullDateOpSz(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateOpSz().intValue() == -1) {
                lmd.setDateOpSz(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1545 + offset, rawVal, 0, 2);
            lmd.setNullDateVkl1(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateVkl1().intValue() == -1) {
                lmd.setDateVkl1(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1547 + offset, rawVal, 0, 2);
            lmd.setNullDatePostr1(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDatePostr1().intValue() == -1) {
                lmd.setDatePostr1(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1549 + offset, rawVal, 0, 2);
            lmd.setNullDateKrp1(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateKrp1().intValue() == -1) {
                lmd.setDateKrp1(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1551 + offset, rawVal, 0, 2);
            lmd.setNullDateKr21(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateKr21().intValue() == -1) {
                lmd.setDateKr21(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1553 + offset, rawVal, 0, 2);
            lmd.setNullDateKr11(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateKr11().intValue() == -1) {
                lmd.setDateKr11(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1555 + offset, rawVal, 0, 2);
            lmd.setNullDateTr31(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateTr31().intValue() == -1) {
                lmd.setDateTr31(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1557 + offset, rawVal, 0, 2);
            lmd.setNullDateTr21(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateTr21().intValue() == -1) {
                lmd.setDateTr21(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1559 + offset, rawVal, 0, 2);
            lmd.setNullDateTr11(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateTr11().intValue() == -1) {
                lmd.setDateTr11(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1561 + offset, rawVal, 0, 2);
            lmd.setNullDateTo31(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateTo31().intValue() == -1) {
                lmd.setDateTo31(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1563 + offset, rawVal, 0, 2);
            lmd.setNullDateNach1(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateNach1().intValue() == -1) {
                lmd.setDateNach1(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1565 + offset, rawVal, 0, 2);
            lmd.setNullDateOkon1(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateOkon1().intValue() == -1) {
                lmd.setDateOkon1(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1567 + offset, rawVal, 0, 2);
            lmd.setNullDateVkl2(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateVkl2().intValue() == -1) {
                lmd.setDateVkl2(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1569 + offset, rawVal, 0, 2);
            lmd.setNullDatePostr2(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDatePostr2().intValue() == -1) {
                lmd.setDatePostr2(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1571 + offset, rawVal, 0, 2);
            lmd.setNullDateKrp2(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateKrp2().intValue() == -1) {
                lmd.setDateKrp2(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1573 + offset, rawVal, 0, 2);
            lmd.setNullDateKr22(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateKr22().intValue() == -1) {
                lmd.setDateKr22(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1575 + offset, rawVal, 0, 2);
            lmd.setNullDateKr12(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateKr12().intValue() == -1) {
                lmd.setDateKr12(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1577 + offset, rawVal, 0, 2);
            lmd.setNullDateTr32(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateTr32().intValue() == -1) {
                lmd.setDateTr32(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1579 + offset, rawVal, 0, 2);
            lmd.setNullDateTr22(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateTr22().intValue() == -1) {
                lmd.setDateTr22(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1581 + offset, rawVal, 0, 2);
            lmd.setNullDateTr12(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateTr12().intValue() == -1) {
                lmd.setDateTr12(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1583 + offset, rawVal, 0, 2);
            lmd.setNullDateTo32(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateTo32().intValue() == -1) {
                lmd.setDateTo32(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1585 + offset, rawVal, 0, 2);
            lmd.setNullDateNach2(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateNach2().intValue() == -1) {
                lmd.setDateNach2(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1587 + offset, rawVal, 0, 2);
            lmd.setNullDateOkon2(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateOkon2().intValue() == -1) {
                lmd.setDateOkon2(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1589 + offset, rawVal, 0, 2);
            lmd.setNullDateVkl3(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateVkl3().intValue() == -1) {
                lmd.setDateVkl3(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1591 + offset, rawVal, 0, 2);
            lmd.setNullDatePostr3(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDatePostr3().intValue() == -1) {
                lmd.setDatePostr3(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1593 + offset, rawVal, 0, 2);
            lmd.setNullDateKrp3(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateKrp3().intValue() == -1) {
                lmd.setDateKrp3(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1595 + offset, rawVal, 0, 2);
            lmd.setNullDateKr23(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateKr23().intValue() == -1) {
                lmd.setDateKr23(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1597 + offset, rawVal, 0, 2);
            lmd.setNullDateKr13(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateKr13().intValue() == -1) {
                lmd.setDateKr13(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1599 + offset, rawVal, 0, 2);
            lmd.setNullDateTr33(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateTr33().intValue() == -1) {
                lmd.setDateTr33(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1601 + offset, rawVal, 0, 2);
            lmd.setNullDateTr23(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateTr23().intValue() == -1) {
                lmd.setDateTr23(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1603 + offset, rawVal, 0, 2);
            lmd.setNullDateTr13(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateTr13().intValue() == -1) {
                lmd.setDateTr13(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1605 + offset, rawVal, 0, 2);
            lmd.setNullDateTo33(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateTo33().intValue() == -1) {
                lmd.setDateTo33(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1607 + offset, rawVal, 0, 2);
            lmd.setNullDateNach3(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateNach3().intValue() == -1) {
                lmd.setDateNach3(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1609 + offset, rawVal, 0, 2);
            lmd.setNullDateOkon3(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateOkon3().intValue() == -1) {
                lmd.setDateOkon3(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1611 + offset, rawVal, 0, 2);
            lmd.setNullDateVkl4(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateVkl4().intValue() == -1) {
                lmd.setDateVkl4(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1613 + offset, rawVal, 0, 2);
            lmd.setNullDatePostr4(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDatePostr4().intValue() == -1) {
                lmd.setDatePostr4(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1615 + offset, rawVal, 0, 2);
            lmd.setNullDateKrp4(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateKrp4().intValue() == -1) {
                lmd.setDateKrp4(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1617 + offset, rawVal, 0, 2);
            lmd.setNullDateKr24(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateKr24().intValue() == -1) {
                lmd.setDateKr24(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1619 + offset, rawVal, 0, 2);
            lmd.setNullDateKr14(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateKr14().intValue() == -1) {
                lmd.setDateKr14(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1621 + offset, rawVal, 0, 2);
            lmd.setNullDateTr34(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateTr34().intValue() == -1) {
                lmd.setDateTr34(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1623 + offset, rawVal, 0, 2);
            lmd.setNullDateTr24(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateTr24().intValue() == -1) {
                lmd.setDateTr24(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1625 + offset, rawVal, 0, 2);
            lmd.setNullDateTr14(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateTr14().intValue() == -1) {
                lmd.setDateTr14(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1627 + offset, rawVal, 0, 2);
            lmd.setNullDateTo34(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateTo34().intValue() == -1) {
                lmd.setDateTo34(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1629 + offset, rawVal, 0, 2);
            lmd.setNullDateNach4(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateNach4().intValue() == -1) {
                lmd.setDateNach4(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1631 + offset, rawVal, 0, 2);
            lmd.setNullDateOkon4(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateOkon4().intValue() == -1) {
                lmd.setDateOkon4(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1633 + offset, rawVal, 0, 2);
            lmd.setNullDvs(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDvs().intValue() == -1) {
                lmd.setDvs(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1635 + offset, rawVal, 0, 2);
            lmd.setNullDateOp1(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateOp1().intValue() == -1) {
                lmd.setDateOp1(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1637 + offset, rawVal, 0, 2);
            lmd.setNullDateOp2(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateOp2().intValue() == -1) {
                lmd.setDateOp2(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1639 + offset, rawVal, 0, 2);
            lmd.setNullDateOp3(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateOp3().intValue() == -1) {
                lmd.setDateOp3(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1641 + offset, rawVal, 0, 2);
            lmd.setNullDateOp4(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateOp4().intValue() == -1) {
                lmd.setDateOp4(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1643 + offset, rawVal, 0, 2);
            lmd.setNullDateOp5(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateOp5().intValue() == -1) {
                lmd.setDateOp5(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1645 + offset, rawVal, 0, 2);
            lmd.setNullDateBeg(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateBeg().intValue() == -1) {
                lmd.setDateBeg(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1647 + offset, rawVal, 0, 2);
            lmd.setNullDateTo2(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (lmd.getNullDateTo2().intValue() == -1) {
                lmd.setDateTo2(null);
            }
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1649 + offset, rawVal, 0, 4);
            lmd.setCutrPrip(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1653 + offset, rawVal, 0, 4);
            lmd.setUchUob(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1657 + offset, rawVal, 0, 4);
            lmd.setPoligon01(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1661 + offset, rawVal, 0, 4);
            lmd.setPoligon02(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1665 + offset, rawVal, 0, 4);
            lmd.setPoligon03(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1669 + offset, rawVal, 0, 4);
            lmd.setPoligon04(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1673 + offset, rawVal, 0, 4);
            lmd.setPoligon05(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1677 + offset, rawVal, 0, 4);
            lmd.setPoligon06(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1681 + offset, rawVal, 0, 4);
            lmd.setPoligon07(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1685 + offset, rawVal, 0, 4);
            lmd.setPoligon08(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1689 + offset, rawVal, 0, 4);
            lmd.setPoligon09(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1693 + offset, rawVal, 0, 4);
            lmd.setPoligon10(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[52];
            System.arraycopy(modelData, 1697 + offset, rawVal, 0, 52);
            lmd.setRezLmd2(rawVal);
        }

        pfmx.addLmdRow(lmd);

    }

}
