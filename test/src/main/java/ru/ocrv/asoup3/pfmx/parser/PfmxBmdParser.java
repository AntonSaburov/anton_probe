package ru.ocrv.asoup3.pfmx.parser;

import static ru.ocrv.asoup3.pfmx.PfmxParser.CHARSET;

import java.nio.charset.Charset;

import ru.ocrv.asoup3.pfmx.model.PfmxBmdRow;
import ru.ocrv.asoup3.pfmx.model.PfmxMessage;
import ru.ocrv.asoup3.pfmx.util.ClassUtil;

public class PfmxBmdParser implements PfmxModelParser {

    public void processRow(PfmxMessage pfmx, byte[] modelData, int localOffset, int modelLength) {

        PfmxBmdRow bmd = new PfmxBmdRow();
        bmd.setRowLength(modelLength);

        int offset = 4 + localOffset;

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 0 + offset, rawVal, 0, 2);
            bmd.setPrTfz1(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 2 + offset, rawVal, 0, 10);
            bmd.setPrTfz2(rawVal);
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 12 + offset, rawVal, 0, 2);
            bmd.setDorPrip(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 14 + offset, rawVal, 0, 2);
            bmd.setDepoPrip(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[5];
            System.arraycopy(modelData, 16 + offset, rawVal, 0, 5);
            bmd.setTnRab(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 21 + offset, rawVal, 0, 2);
            bmd.setDorRasch(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 23 + offset, rawVal, 0, 2);
            bmd.setKopBmd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 25 + offset, rawVal, 0, 19);
            bmd.setDateOp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 44 + offset, rawVal, 0, 1);
            bmd.setPrObOp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 45 + offset, rawVal, 0, 4);
            bmd.setStanOp(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 49 + offset, rawVal, 0, 2);
            bmd.setDorOp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 51 + offset, rawVal, 0, 2);
            bmd.setDepoOp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 53 + offset, rawVal, 0, 1);
            bmd.setPrKom(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 54 + offset, rawVal, 0, 1);
            bmd.setPrZb(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 55 + offset, rawVal, 0, 1);
            bmd.setVidZak(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 56 + offset, rawVal, 0, 2);
            bmd.setDolp(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 58 + offset, rawVal, 0, 19);
            bmd.setDateDolp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 77 + offset, rawVal, 0, 2);
            bmd.setKopBeg(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 79 + offset, rawVal, 0, 19);
            bmd.setDateBeg(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[3];
            System.arraycopy(modelData, 98 + offset, rawVal, 0, 3);
            bmd.setVrabBeg(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 101 + offset, rawVal, 0, 1);
            bmd.setPrMes(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 102 + offset, rawVal, 0, 4);
            bmd.setMes1Beg(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 106 + offset, rawVal, 0, 4);
            bmd.setMes2Beg(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 110 + offset, rawVal, 0, 2);
            bmd.setMes3Beg(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 112 + offset, rawVal, 0, 2);
            bmd.setMes4Beg(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 114 + offset, rawVal, 0, 2);
            bmd.setRgnDis(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 116 + offset, rawVal, 0, 2);
            bmd.setDorDis(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 118 + offset, rawVal, 0, 2);
            bmd.setNodDis(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 120 + offset, rawVal, 0, 2);
            bmd.setOcDis(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 122 + offset, rawVal, 0, 4);
            bmd.setNbe(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 126 + offset, rawVal, 0, 4);
            bmd.setStanDis(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 130 + offset, rawVal, 0, 4);
            bmd.setKodUob(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[15];
            System.arraycopy(modelData, 134 + offset, rawVal, 0, 15);
            bmd.setIndexPoezd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 149 + offset, rawVal, 0, 2);
            bmd.setNomPoezd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[3];
            System.arraycopy(modelData, 151 + offset, rawVal, 0, 3);
            bmd.setSerLoc(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[8];
            System.arraycopy(modelData, 154 + offset, rawVal, 0, 8);
            bmd.setZnsLoc(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 162 + offset, rawVal, 0, 2);
            bmd.setPrsLoc(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 164 + offset, rawVal, 0, 1);
            bmd.setPrzLoc(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 165 + offset, rawVal, 0, 1);
            bmd.setPssLoc(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 166 + offset, rawVal, 0, 2);
            bmd.setPrrl(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 168 + offset, rawVal, 0, 2);
            bmd.setPsp(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 170 + offset, rawVal, 0, 1);
            bmd.setPsl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 171 + offset, rawVal, 0, 1);
            bmd.setPrBTpe(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 172 + offset, rawVal, 0, 2);
            bmd.setKodSost(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 174 + offset, rawVal, 0, 2);
            bmd.setVidDv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 176 + offset, rawVal, 0, 2);
            bmd.setVidParka(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 178 + offset, rawVal, 0, 1);
            bmd.setPrPas(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 179 + offset, rawVal, 0, 2);
            bmd.setNomPoez1(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 181 + offset, rawVal, 0, 4);
            bmd.setKodStPas(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 185 + offset, rawVal, 0, 2);
            bmd.setKopPmd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 187 + offset, rawVal, 0, 1);
            bmd.setPrStykPosl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 188 + offset, rawVal, 0, 2);
            bmd.setDornodPosl(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 190 + offset, rawVal, 0, 4);
            bmd.setNaprPosl(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 194 + offset, rawVal, 0, 2);
            bmd.setKopLmd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 196 + offset, rawVal, 0, 2);
            bmd.setKopPrib202(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 198 + offset, rawVal, 0, 1);
            bmd.setPrStykPrib202(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 199 + offset, rawVal, 0, 2);
            bmd.setDornodPrib202(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 201 + offset, rawVal, 0, 4);
            bmd.setNaprPrib202(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 205 + offset, rawVal, 0, 1);
            bmd.setPrPoezdki(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 206 + offset, rawVal, 0, 1);
            bmd.setPrObor(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 207 + offset, rawVal, 0, 2);
            bmd.setRrFakt(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 209 + offset, rawVal, 0, 2);
            bmd.setRrNorm(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 211 + offset, rawVal, 0, 2);
            bmd.setKodZb(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[26];
            System.arraycopy(modelData, 213 + offset, rawVal, 0, 26);
            bmd.setDateKodZb(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 239 + offset, rawVal, 0, 4);
            bmd.setKds(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[26];
            System.arraycopy(modelData, 243 + offset, rawVal, 0, 26);
            bmd.setDvs(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 269 + offset, rawVal, 0, 9);
            bmd.setKpp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 278 + offset, rawVal, 0, 4);
            bmd.setKdsT(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[26];
            System.arraycopy(modelData, 282 + offset, rawVal, 0, 26);
            bmd.setDvsT(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 308 + offset, rawVal, 0, 9);
            bmd.setKppT(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 317 + offset, rawVal, 0, 1);
            bmd.setOtmNeskSost(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 318 + offset, rawVal, 0, 10);
            bmd.setSl1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 328 + offset, rawVal, 0, 10);
            bmd.setSl2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 338 + offset, rawVal, 0, 10);
            bmd.setSl3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 348 + offset, rawVal, 0, 19);
            bmd.setDateBegD(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 367 + offset, rawVal, 0, 2);
            bmd.setRrRab(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 369 + offset, rawVal, 0, 1);
            bmd.setPrTura(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 370 + offset, rawVal, 0, 4);
            bmd.setKodPoezdki(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 374 + offset, rawVal, 0, 2);
            bmd.setNomPark(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 376 + offset, rawVal, 0, 2);
            bmd.setNomPut(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 378 + offset, rawVal, 0, 2);
            bmd.setKop1(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 380 + offset, rawVal, 0, 19);
            bmd.setDateOp1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 399 + offset, rawVal, 0, 2);
            bmd.setKop2(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 401 + offset, rawVal, 0, 19);
            bmd.setDateOp2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 420 + offset, rawVal, 0, 2);
            bmd.setKop3(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 422 + offset, rawVal, 0, 19);
            bmd.setDateOp3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 441 + offset, rawVal, 0, 2);
            bmd.setKop4(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 443 + offset, rawVal, 0, 19);
            bmd.setDateOp4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 462 + offset, rawVal, 0, 2);
            bmd.setKop5(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 464 + offset, rawVal, 0, 19);
            bmd.setDateOp5(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 483 + offset, rawVal, 0, 4);
            bmd.setUns(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 487 + offset, rawVal, 0, 4);
            bmd.setUnsT(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 491 + offset, rawVal, 0, 2);
            bmd.setNullDateDolp(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateDolp().intValue() == -1) {
                bmd.setDateDolp(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 493 + offset, rawVal, 0, 2);
            bmd.setNullDateBeg(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateBeg().intValue() == -1) {
                bmd.setDateBeg(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 495 + offset, rawVal, 0, 2);
            bmd.setNullDateKodZb(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateKodZb().intValue() == -1) {
                bmd.setDateKodZb(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 497 + offset, rawVal, 0, 2);
            bmd.setNullDvs(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDvs().intValue() == -1) {
                bmd.setDvs(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 499 + offset, rawVal, 0, 2);
            bmd.setNullDvsT(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDvsT().intValue() == -1) {
                bmd.setDvsT(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 501 + offset, rawVal, 0, 2);
            bmd.setNullDateBegD(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateBegD().intValue() == -1) {
                bmd.setDateBegD(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 503 + offset, rawVal, 0, 2);
            bmd.setNullDateOp1(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateOp1().intValue() == -1) {
                bmd.setDateOp1(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 505 + offset, rawVal, 0, 2);
            bmd.setNullDateOp2(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateOp2().intValue() == -1) {
                bmd.setDateOp2(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 507 + offset, rawVal, 0, 2);
            bmd.setNullDateOp3(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateOp3().intValue() == -1) {
                bmd.setDateOp3(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 509 + offset, rawVal, 0, 2);
            bmd.setNullDateOp4(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateOp4().intValue() == -1) {
                bmd.setDateOp4(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 511 + offset, rawVal, 0, 2);
            bmd.setNullDateOp5(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateOp5().intValue() == -1) {
                bmd.setDateOp5(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 513 + offset, rawVal, 0, 2);
            bmd.setKodOper(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 515 + offset, rawVal, 0, 10);
            bmd.setDateOper(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[15];
            System.arraycopy(modelData, 525 + offset, rawVal, 0, 15);
            bmd.setName1Rab(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[15];
            System.arraycopy(modelData, 540 + offset, rawVal, 0, 15);
            bmd.setName2Rab(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[15];
            System.arraycopy(modelData, 555 + offset, rawVal, 0, 15);
            bmd.setName3Rab(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 570 + offset, rawVal, 0, 10);
            bmd.setDateBorn(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 580 + offset, rawVal, 0, 4);
            bmd.setStanM(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 584 + offset, rawVal, 0, 1);
            bmd.setPrKomPasp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 585 + offset, rawVal, 0, 1);
            bmd.setPzim(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 586 + offset, rawVal, 0, 2);
            bmd.setnColon(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 588 + offset, rawVal, 0, 10);
            bmd.setDateColon(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 598 + offset, rawVal, 0, 2);
            bmd.setClassId(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 600 + offset, rawVal, 0, 10);
            bmd.setDateClass(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 610 + offset, rawVal, 0, 2);
            bmd.setProf(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 612 + offset, rawVal, 0, 10);
            bmd.setDateProf(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 622 + offset, rawVal, 0, 2);
            bmd.setDolpPasp(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 624 + offset, rawVal, 0, 19);
            bmd.setDateDolpPasp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 643 + offset, rawVal, 0, 2);
            bmd.setVidDv1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 645 + offset, rawVal, 0, 2);
            bmd.setVidDv2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 647 + offset, rawVal, 0, 2);
            bmd.setVidDv3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 649 + offset, rawVal, 0, 2);
            bmd.setVidDv4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 651 + offset, rawVal, 0, 2);
            bmd.setVidDv5(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 653 + offset, rawVal, 0, 2);
            bmd.setVidDv6(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 655 + offset, rawVal, 0, 1);
            bmd.setOrgt(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 656 + offset, rawVal, 0, 9);
            bmd.setKppPasp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[26];
            System.arraycopy(modelData, 665 + offset, rawVal, 0, 26);
            bmd.setDvsPasp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 691 + offset, rawVal, 0, 2);
            bmd.setNullDateOper(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateOper().intValue() == -1) {
                bmd.setDateOper(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 693 + offset, rawVal, 0, 2);
            bmd.setNullDateBorn(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateBorn().intValue() == -1) {
                bmd.setDateBorn(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 695 + offset, rawVal, 0, 2);
            bmd.setNullDateColon(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateColon().intValue() == -1) {
                bmd.setDateColon(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 697 + offset, rawVal, 0, 2);
            bmd.setNullDateClass(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateClass().intValue() == -1) {
                bmd.setDateClass(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 699 + offset, rawVal, 0, 2);
            bmd.setNullDateProf(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateProf().intValue() == -1) {
                bmd.setDateProf(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 701 + offset, rawVal, 0, 2);
            bmd.setNullDateDolpPasp(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateDolpPasp().intValue() == -1) {
                bmd.setDateDolpPasp(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 703 + offset, rawVal, 0, 2);
            bmd.setNullDvsPasp(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDvsPasp().intValue() == -1) {
                bmd.setDvsPasp(null);
            }
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 705 + offset, rawVal, 0, 1);
            bmd.setPrKodKip(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 706 + offset, rawVal, 0, 4);
            bmd.setKodUobKip(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 710 + offset, rawVal, 0, 10);
            bmd.setDateTest1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 720 + offset, rawVal, 0, 1);
            bmd.setPrOnePers1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[5];
            System.arraycopy(modelData, 721 + offset, rawVal, 0, 5);
            bmd.setTnMi1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 726 + offset, rawVal, 0, 2);
            bmd.setDorPripMi1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 728 + offset, rawVal, 0, 2);
            bmd.setDepoPripMi1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 730 + offset, rawVal, 0, 9);
            bmd.setKppKip(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[26];
            System.arraycopy(modelData, 739 + offset, rawVal, 0, 26);
            bmd.setDvsKip(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 765 + offset, rawVal, 0, 2);
            bmd.setNullDateTest1(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateTest1().intValue() == -1) {
                bmd.setDateTest1(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 767 + offset, rawVal, 0, 2);
            bmd.setNullDvsKip(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDvsKip().intValue() == -1) {
                bmd.setDvsKip(null);
            }
        }

        {
            byte[] rawVal = new byte[3];
            System.arraycopy(modelData, 769 + offset, rawVal, 0, 3);
            bmd.setSerLoc1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 772 + offset, rawVal, 0, 1);
            bmd.setPrRz1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 773 + offset, rawVal, 0, 10);
            bmd.setDateRaz1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 783 + offset, rawVal, 0, 10);
            bmd.setDateZap1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[3];
            System.arraycopy(modelData, 793 + offset, rawVal, 0, 3);
            bmd.setSerLoc2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 796 + offset, rawVal, 0, 1);
            bmd.setPrRz2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 797 + offset, rawVal, 0, 10);
            bmd.setDateRaz2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 807 + offset, rawVal, 0, 10);
            bmd.setDateZap2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[3];
            System.arraycopy(modelData, 817 + offset, rawVal, 0, 3);
            bmd.setSerLoc3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 820 + offset, rawVal, 0, 1);
            bmd.setPrRz3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 821 + offset, rawVal, 0, 10);
            bmd.setDateRaz3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 831 + offset, rawVal, 0, 10);
            bmd.setDateZap3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[3];
            System.arraycopy(modelData, 841 + offset, rawVal, 0, 3);
            bmd.setSerLoc4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 844 + offset, rawVal, 0, 1);
            bmd.setPrRz4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 845 + offset, rawVal, 0, 10);
            bmd.setDateRaz4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 855 + offset, rawVal, 0, 10);
            bmd.setDateZap4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[3];
            System.arraycopy(modelData, 865 + offset, rawVal, 0, 3);
            bmd.setSerLoc5(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 868 + offset, rawVal, 0, 1);
            bmd.setPrRz5(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 869 + offset, rawVal, 0, 10);
            bmd.setDateRaz5(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 879 + offset, rawVal, 0, 10);
            bmd.setDateZap5(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[3];
            System.arraycopy(modelData, 889 + offset, rawVal, 0, 3);
            bmd.setSerLoc6(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 892 + offset, rawVal, 0, 1);
            bmd.setPrRz6(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 893 + offset, rawVal, 0, 10);
            bmd.setDateRaz6(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 903 + offset, rawVal, 0, 10);
            bmd.setDateZap6(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[3];
            System.arraycopy(modelData, 913 + offset, rawVal, 0, 3);
            bmd.setSerLoc7(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 916 + offset, rawVal, 0, 1);
            bmd.setPrRz7(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 917 + offset, rawVal, 0, 10);
            bmd.setDateRaz7(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 927 + offset, rawVal, 0, 10);
            bmd.setDateZap7(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 937 + offset, rawVal, 0, 9);
            bmd.setKppSl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[26];
            System.arraycopy(modelData, 946 + offset, rawVal, 0, 26);
            bmd.setDvsSl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 972 + offset, rawVal, 0, 2);
            bmd.setNullDateRaz1(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateRaz1().intValue() == -1) {
                bmd.setDateRaz1(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 974 + offset, rawVal, 0, 2);
            bmd.setNullDateZap1(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateZap1().intValue() == -1) {
                bmd.setDateZap1(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 976 + offset, rawVal, 0, 2);
            bmd.setNullDateRaz2(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateRaz2().intValue() == -1) {
                bmd.setDateRaz2(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 978 + offset, rawVal, 0, 2);
            bmd.setNullDateZap2(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateZap2().intValue() == -1) {
                bmd.setDateZap2(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 980 + offset, rawVal, 0, 2);
            bmd.setNullDateRaz3(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateRaz3().intValue() == -1) {
                bmd.setDateRaz3(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 982 + offset, rawVal, 0, 2);
            bmd.setNullDateZap3(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateZap3().intValue() == -1) {
                bmd.setDateZap3(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 984 + offset, rawVal, 0, 2);
            bmd.setNullDateRaz4(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateRaz4().intValue() == -1) {
                bmd.setDateRaz4(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 986 + offset, rawVal, 0, 2);
            bmd.setNullDateZap4(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateZap4().intValue() == -1) {
                bmd.setDateZap4(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 988 + offset, rawVal, 0, 2);
            bmd.setNullDateRaz5(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateRaz5().intValue() == -1) {
                bmd.setDateRaz5(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 990 + offset, rawVal, 0, 2);
            bmd.setNullDateZap5(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateZap5().intValue() == -1) {
                bmd.setDateZap5(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 992 + offset, rawVal, 0, 2);
            bmd.setNullDateRaz6(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateRaz6().intValue() == -1) {
                bmd.setDateRaz6(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 994 + offset, rawVal, 0, 2);
            bmd.setNullDateZap6(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateZap6().intValue() == -1) {
                bmd.setDateZap6(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 996 + offset, rawVal, 0, 2);
            bmd.setNullDateRaz7(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateRaz7().intValue() == -1) {
                bmd.setDateRaz7(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 998 + offset, rawVal, 0, 2);
            bmd.setNullDateZap7(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateZap7().intValue() == -1) {
                bmd.setDateZap7(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1000 + offset, rawVal, 0, 2);
            bmd.setNullDvsSl(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDvsSl().intValue() == -1) {
                bmd.setDvsSl(null);
            }
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 1002 + offset, rawVal, 0, 10);
            bmd.setDateNK(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 1012 + offset, rawVal, 0, 10);
            bmd.setDateKK(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1022 + offset, rawVal, 0, 2);
            bmd.setDorPripK(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1024 + offset, rawVal, 0, 2);
            bmd.setDepoPripK(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[5];
            System.arraycopy(modelData, 1026 + offset, rawVal, 0, 5);
            bmd.setTnRabK(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 1031 + offset, rawVal, 0, 9);
            bmd.setKppKom(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[26];
            System.arraycopy(modelData, 1040 + offset, rawVal, 0, 26);
            bmd.setDvsKom(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1066 + offset, rawVal, 0, 2);
            bmd.setNullDateNK(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateNK().intValue() == -1) {
                bmd.setDateNK(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1068 + offset, rawVal, 0, 2);
            bmd.setNullDateKK(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateKK().intValue() == -1) {
                bmd.setDateKK(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1070 + offset, rawVal, 0, 2);
            bmd.setNullDvsKom(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDvsKom().intValue() == -1) {
                bmd.setDvsKom(null);
            }
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1072 + offset, rawVal, 0, 1);
            bmd.setPrLb(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1073 + offset, rawVal, 0, 2);
            bmd.setKodOperZb(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1075 + offset, rawVal, 0, 19);
            bmd.setDateOperZb(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1094 + offset, rawVal, 0, 2);
            bmd.setDolpZb(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[30];
            System.arraycopy(modelData, 1096 + offset, rawVal, 0, 30);
            bmd.setInfPrik(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[3];
            System.arraycopy(modelData, 1126 + offset, rawVal, 0, 3);
            bmd.setKodPrich(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[5];
            System.arraycopy(modelData, 1129 + offset, rawVal, 0, 5);
            bmd.setTnLb(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1134 + offset, rawVal, 0, 2);
            bmd.setDorPripLb(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1136 + offset, rawVal, 0, 2);
            bmd.setDepoPripLb(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1138 + offset, rawVal, 0, 1);
            bmd.setPrLb2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1139 + offset, rawVal, 0, 2);
            bmd.setKodOper2(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1141 + offset, rawVal, 0, 19);
            bmd.setDateOper2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1160 + offset, rawVal, 0, 2);
            bmd.setDolp2(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[30];
            System.arraycopy(modelData, 1162 + offset, rawVal, 0, 30);
            bmd.setInfPrik2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[3];
            System.arraycopy(modelData, 1192 + offset, rawVal, 0, 3);
            bmd.setKodPrich2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[5];
            System.arraycopy(modelData, 1195 + offset, rawVal, 0, 5);
            bmd.setTnLb2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1200 + offset, rawVal, 0, 2);
            bmd.setDorPripLb2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1202 + offset, rawVal, 0, 2);
            bmd.setDepoPripLb2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1204 + offset, rawVal, 0, 1);
            bmd.setPrLb3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1205 + offset, rawVal, 0, 2);
            bmd.setKodOper3(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1207 + offset, rawVal, 0, 19);
            bmd.setDateOper3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1226 + offset, rawVal, 0, 2);
            bmd.setDolp3(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[30];
            System.arraycopy(modelData, 1228 + offset, rawVal, 0, 30);
            bmd.setInfPrik3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[3];
            System.arraycopy(modelData, 1258 + offset, rawVal, 0, 3);
            bmd.setKodPrich3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[5];
            System.arraycopy(modelData, 1261 + offset, rawVal, 0, 5);
            bmd.setTnLb3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1266 + offset, rawVal, 0, 2);
            bmd.setDorPripLb3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1268 + offset, rawVal, 0, 2);
            bmd.setDepoPripLb3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 1270 + offset, rawVal, 0, 9);
            bmd.setKppZb(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[26];
            System.arraycopy(modelData, 1279 + offset, rawVal, 0, 26);
            bmd.setDvsZb(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1305 + offset, rawVal, 0, 2);
            bmd.setNullDateOperZb(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateOperZb().intValue() == -1) {
                bmd.setDateOperZb(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1307 + offset, rawVal, 0, 2);
            bmd.setNullDateOper2(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateOper2().intValue() == -1) {
                bmd.setDateOper2(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1309 + offset, rawVal, 0, 2);
            bmd.setNullDateOper3(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateOper3().intValue() == -1) {
                bmd.setDateOper3(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1311 + offset, rawVal, 0, 2);
            bmd.setNullDvsZb(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDvsZb().intValue() == -1) {
                bmd.setDvsZb(null);
            }
        }

        {
            byte[] rawVal = new byte[8];
            System.arraycopy(modelData, 1313 + offset, rawVal, 0, 8);
            bmd.setnPrik(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1321 + offset, rawVal, 0, 19);
            bmd.setDateDPrik(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1340 + offset, rawVal, 0, 19);
            bmd.setDateKPrik(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1359 + offset, rawVal, 0, 1);
            bmd.setPrPrik(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1360 + offset, rawVal, 0, 19);
            bmd.setDatePPrik(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1379 + offset, rawVal, 0, 1);
            bmd.setTipPrik(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 1380 + offset, rawVal, 0, 10);
            bmd.setDolIzPrik(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[20];
            System.arraycopy(modelData, 1390 + offset, rawVal, 0, 20);
            bmd.setFam(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[3];
            System.arraycopy(modelData, 1410 + offset, rawVal, 0, 3);
            bmd.setKodVpr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1413 + offset, rawVal, 0, 2);
            bmd.setKodPr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1415 + offset, rawVal, 0, 4);
            bmd.setVsl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1419 + offset, rawVal, 0, 4);
            bmd.setNaprUob(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1423 + offset, rawVal, 0, 2);
            bmd.setNomPoezdPrik(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1425 + offset, rawVal, 0, 4);
            bmd.setKodUobPrik(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1429 + offset, rawVal, 0, 4);
            bmd.setKodStan(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1433 + offset, rawVal, 0, 2);
            bmd.setIzRr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1435 + offset, rawVal, 0, 2);
            bmd.setDorPripKP(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1437 + offset, rawVal, 0, 2);
            bmd.setDepoPripKP(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 1439 + offset, rawVal, 0, 9);
            bmd.setKppPrik(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1448 + offset, rawVal, 0, 4);
            bmd.setKdsPrik(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[26];
            System.arraycopy(modelData, 1452 + offset, rawVal, 0, 26);
            bmd.setDvsPrik(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1478 + offset, rawVal, 0, 2);
            bmd.setNullDateDPrik(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateDPrik().intValue() == -1) {
                bmd.setDateDPrik(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1480 + offset, rawVal, 0, 2);
            bmd.setNullDateKPrik(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateKPrik().intValue() == -1) {
                bmd.setDateKPrik(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1482 + offset, rawVal, 0, 2);
            bmd.setNullDatePPrik(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDatePPrik().intValue() == -1) {
                bmd.setDatePPrik(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1484 + offset, rawVal, 0, 2);
            bmd.setNullDvsPrik(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDvsPrik().intValue() == -1) {
                bmd.setDvsPrik(null);
            }
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1486 + offset, rawVal, 0, 4);
            bmd.setKs(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 1490 + offset, rawVal, 0, 10);
            bmd.setDateBegN(new String(rawVal, Charset.forName(CHARSET)));
        }

        {
            byte[] rawVal = new byte[8];
            System.arraycopy(modelData, 1500 + offset, rawVal, 0, 8);
            bmd.setVremBegN(new String(rawVal, Charset.forName(CHARSET)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1508 + offset, rawVal, 0, 1);
            bmd.setPrBegN(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[3];
            System.arraycopy(modelData, 1509 + offset, rawVal, 0, 3);
            bmd.setVrabN(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1512 + offset, rawVal, 0, 1);
            bmd.setPrMesN(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1513 + offset, rawVal, 0, 4);
            bmd.setMes1BegN(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1517 + offset, rawVal, 0, 4);
            bmd.setMes2BegN(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1521 + offset, rawVal, 0, 2);
            bmd.setMes3BegN(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1523 + offset, rawVal, 0, 2);
            bmd.setMes4BegN(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1525 + offset, rawVal, 0, 2);
            bmd.setNomPoezdN(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 1527 + offset, rawVal, 0, 10);
            bmd.setDateBegF(new String(rawVal, Charset.forName(CHARSET)));
        }

        {
            byte[] rawVal = new byte[8];
            System.arraycopy(modelData, 1537 + offset, rawVal, 0, 8);
            bmd.setVremBegF(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1545 + offset, rawVal, 0, 1);
            bmd.setPrBegF(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[3];
            System.arraycopy(modelData, 1546 + offset, rawVal, 0, 3);
            bmd.setVrabBegN(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1549 + offset, rawVal, 0, 1);
            bmd.setPrMesF(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1550 + offset, rawVal, 0, 4);
            bmd.setMes1BegF(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1554 + offset, rawVal, 0, 4);
            bmd.setMes2BegF(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1558 + offset, rawVal, 0, 2);
            bmd.setMes3BegF(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1560 + offset, rawVal, 0, 2);
            bmd.setMes4BegF(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1562 + offset, rawVal, 0, 2);
            bmd.setNomPoezdF(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 1564 + offset, rawVal, 0, 9);
            bmd.setKppNar(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1573 + offset, rawVal, 0, 4);
            bmd.setKdsNar(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[26];
            System.arraycopy(modelData, 1577 + offset, rawVal, 0, 26);
            bmd.setDvsNar(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 1603 + offset, rawVal, 0, 9);
            bmd.setKpp267Nar(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1612 + offset, rawVal, 0, 4);
            bmd.setKds267Nar(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[26];
            System.arraycopy(modelData, 1616 + offset, rawVal, 0, 26);
            bmd.setDvs267Nar(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1642 + offset, rawVal, 0, 2);
            bmd.setNullDateBegN(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateBegN().intValue() == -1) {
                bmd.setDateBegN(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1644 + offset, rawVal, 0, 2);
            bmd.setNullVremBegN(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullVremBegN().intValue() == -1) {
                bmd.setVremBegN(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1646 + offset, rawVal, 0, 2);
            bmd.setNullDateBegF(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateBegF().intValue() == -1) {
                bmd.setDateBegF(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1648 + offset, rawVal, 0, 2);
            bmd.setNullVremBegF(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullVremBegF().intValue() == -1) {
                bmd.setVremBegF(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1650 + offset, rawVal, 0, 2);
            bmd.setNullDvsNar(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDvsNar().intValue() == -1) {
                bmd.setDvsNar(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1652 + offset, rawVal, 0, 2);
            bmd.setNullDvs267Nar(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDvs267Nar().intValue() == -1) {
                bmd.setDvs267Nar(null);
            }
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1654 + offset, rawVal, 0, 19);
            bmd.setDateBegNr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[3];
            System.arraycopy(modelData, 1673 + offset, rawVal, 0, 3);
            bmd.setKodVprNr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1676 + offset, rawVal, 0, 2);
            bmd.setPrichN(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1678 + offset, rawVal, 0, 4);
            bmd.setMkodSlu(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1682 + offset, rawVal, 0, 2);
            bmd.setDorNr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1684 + offset, rawVal, 0, 2);
            bmd.setKopBegNr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1686 + offset, rawVal, 0, 2);
            bmd.setKopBegS(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1688 + offset, rawVal, 0, 1);
            bmd.setPrObOpNr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1689 + offset, rawVal, 0, 4);
            bmd.setStanOpNr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1693 + offset, rawVal, 0, 2);
            bmd.setDorOpNr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1695 + offset, rawVal, 0, 2);
            bmd.setDepoOpNr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1697 + offset, rawVal, 0, 4);
            bmd.setStanOpS(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1701 + offset, rawVal, 0, 2);
            bmd.setDorOpS(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1703 + offset, rawVal, 0, 2);
            bmd.setDepoOpS(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1705 + offset, rawVal, 0, 1);
            bmd.setPrNyv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1706 + offset, rawVal, 0, 4);
            bmd.setStNUob(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1710 + offset, rawVal, 0, 4);
            bmd.setStPUob(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1714 + offset, rawVal, 0, 4);
            bmd.setStKUob(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1718 + offset, rawVal, 0, 4);
            bmd.setKodUobNr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1722 + offset, rawVal, 0, 2);
            bmd.setRrNormNr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1724 + offset, rawVal, 0, 2);
            bmd.setRrFaktNr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1726 + offset, rawVal, 0, 4);
            bmd.setEsrPeres(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1730 + offset, rawVal, 0, 19);
            bmd.setDateOPeres(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1749 + offset, rawVal, 0, 2);
            bmd.setNormPeresNr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1751 + offset, rawVal, 0, 2);
            bmd.setFaktPeres(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1753 + offset, rawVal, 0, 2);
            bmd.setVrPeres(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1755 + offset, rawVal, 0, 4);
            bmd.setEsrPereodh(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1759 + offset, rawVal, 0, 19);
            bmd.setDateOOtd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1778 + offset, rawVal, 0, 2);
            bmd.setNormOtdhNr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1780 + offset, rawVal, 0, 2);
            bmd.setFaktOtdhNr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1782 + offset, rawVal, 0, 2);
            bmd.setVrPereodh(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1784 + offset, rawVal, 0, 4);
            bmd.setStOPass(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1788 + offset, rawVal, 0, 19);
            bmd.setDoPass(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1807 + offset, rawVal, 0, 4);
            bmd.setStPPass(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1811 + offset, rawVal, 0, 19);
            bmd.setDpPass(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1830 + offset, rawVal, 0, 2);
            bmd.setNomPoezdNr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1832 + offset, rawVal, 0, 2);
            bmd.setVrPass(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1834 + offset, rawVal, 0, 1);
            bmd.setPrOPass(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1835 + offset, rawVal, 0, 1);
            bmd.setPrPrPass(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1836 + offset, rawVal, 0, 2);
            bmd.setNomRasl(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1838 + offset, rawVal, 0, 2);
            bmd.setPrichNR(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1840 + offset, rawVal, 0, 4);
            bmd.setMkodSluR(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1844 + offset, rawVal, 0, 2);
            bmd.setDorNrR(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1846 + offset, rawVal, 0, 4);
            bmd.setPredprNr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1850 + offset, rawVal, 0, 19);
            bmd.setDateNrR(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 1869 + offset, rawVal, 0, 10);
            bmd.setDolpR(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[20];
            System.arraycopy(modelData, 1879 + offset, rawVal, 0, 20);
            bmd.setFamR(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1899 + offset, rawVal, 0, 1);
            bmd.setPrNalPrik(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[8];
            System.arraycopy(modelData, 1900 + offset, rawVal, 0, 8);
            bmd.setnPrikNr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1908 + offset, rawVal, 0, 19);
            bmd.setDateDPrikNr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1927 + offset, rawVal, 0, 4);
            bmd.setDolIzPrikNr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[20];
            System.arraycopy(modelData, 1931 + offset, rawVal, 0, 20);
            bmd.setFamNr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1951 + offset, rawVal, 0, 2);
            bmd.setIzRrNr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1953 + offset, rawVal, 0, 2);
            bmd.setKodPrNr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1955 + offset, rawVal, 0, 4);
            bmd.setVslNr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[8];
            System.arraycopy(modelData, 1959 + offset, rawVal, 0, 8);
            bmd.setnPrikS(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1967 + offset, rawVal, 0, 19);
            bmd.setDatePrikS(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1986 + offset, rawVal, 0, 4);
            bmd.setDolIzPrikS(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[20];
            System.arraycopy(modelData, 1990 + offset, rawVal, 0, 20);
            bmd.setFamS(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 2010 + offset, rawVal, 0, 4);
            bmd.setKdsNr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[26];
            System.arraycopy(modelData, 2014 + offset, rawVal, 0, 26);
            bmd.setDvsNr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[26];
            System.arraycopy(modelData, 2040 + offset, rawVal, 0, 26);
            bmd.setDvsKNr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 2066 + offset, rawVal, 0, 9);
            bmd.setKppNr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2075 + offset, rawVal, 0, 2);
            bmd.setRez1Nr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 2077 + offset, rawVal, 0, 9);
            bmd.setRez2Nr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2086 + offset, rawVal, 0, 2);
            bmd.setRez3Nr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2088 + offset, rawVal, 0, 2);
            bmd.setNullDateBegNr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateBegNr().intValue() == -1) {
                bmd.setDateBegNr(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2090 + offset, rawVal, 0, 2);
            bmd.setNullDateOPeres(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateOPeres().intValue() == -1) {
                bmd.setDateOPeres(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2092 + offset, rawVal, 0, 2);
            bmd.setNullDateOOtd(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateOOtd().intValue() == -1) {
                bmd.setDateOOtd(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2094 + offset, rawVal, 0, 2);
            bmd.setNullDoPass(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDoPass().intValue() == -1) {
                bmd.setDoPass(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2096 + offset, rawVal, 0, 2);
            bmd.setNullDpPass(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDpPass().intValue() == -1) {
                bmd.setDpPass(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2098 + offset, rawVal, 0, 2);
            bmd.setNullDateNrR(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateNrR().intValue() == -1) {
                bmd.setDateNrR(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2100 + offset, rawVal, 0, 2);
            bmd.setNullDateDPrikNr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateDPrikNr().intValue() == -1) {
                bmd.setDateDPrikNr(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2102 + offset, rawVal, 0, 2);
            bmd.setNullDatePrikS(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDatePrikS().intValue() == -1) {
                bmd.setDatePrikS(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2104 + offset, rawVal, 0, 2);
            bmd.setNullDvsNr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDvsNr().intValue() == -1) {
                bmd.setDvsNr(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2106 + offset, rawVal, 0, 2);
            bmd.setNullDvsKNr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDvsKNr().intValue() == -1) {
                bmd.setDvsKNr(null);
            }
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 2108 + offset, rawVal, 0, 19);
            bmd.setDateOpOtvl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2127 + offset, rawVal, 0, 2);
            bmd.setKopBmdOtvl(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 2129 + offset, rawVal, 0, 19);
            bmd.setDateKOtvl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 2148 + offset, rawVal, 0, 19);
            bmd.setDateFOtvl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 2167 + offset, rawVal, 0, 4);
            bmd.setDnKlPl(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 2171 + offset, rawVal, 0, 4);
            bmd.setDnKlFakt(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2175 + offset, rawVal, 0, 2);
            bmd.setDnSl1(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2177 + offset, rawVal, 0, 2);
            bmd.setDnRabFakt(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 2179 + offset, rawVal, 0, 4);
            bmd.setVrSl1(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 2183 + offset, rawVal, 0, 4);
            bmd.setVrRabFakt(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 2187 + offset, rawVal, 0, 1);
            bmd.setPrZbOtvl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 2188 + offset, rawVal, 0, 1);
            bmd.setPrObOpOtvl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 2189 + offset, rawVal, 0, 4);
            bmd.setStanOpOtvl(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2193 + offset, rawVal, 0, 2);
            bmd.setDorOpOtvl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2195 + offset, rawVal, 0, 2);
            bmd.setDepoOpOtvl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2197 + offset, rawVal, 0, 2);
            bmd.setVidDvOtvl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2199 + offset, rawVal, 0, 2);
            bmd.setVidDv1Otvl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2201 + offset, rawVal, 0, 2);
            bmd.setDorDisOtvl(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2203 + offset, rawVal, 0, 2);
            bmd.setNodDisOtvl(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[26];
            System.arraycopy(modelData, 2205 + offset, rawVal, 0, 26);
            bmd.setDvsTOtvl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 2231 + offset, rawVal, 0, 9);
            bmd.setKppTOtvl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[26];
            System.arraycopy(modelData, 2240 + offset, rawVal, 0, 26);
            bmd.setDvsZ(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 2266 + offset, rawVal, 0, 9);
            bmd.setKppZ(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2275 + offset, rawVal, 0, 2);
            bmd.setRez1(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2277 + offset, rawVal, 0, 2);
            bmd.setRez2(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2279 + offset, rawVal, 0, 2);
            bmd.setRez3(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2281 + offset, rawVal, 0, 2);
            bmd.setNullDateOpOtvl(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateOpOtvl().intValue() == -1) {
                bmd.setDateOpOtvl(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2283 + offset, rawVal, 0, 2);
            bmd.setNullDateKOtvl(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateKOtvl().intValue() == -1) {
                bmd.setDateKOtvl(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2285 + offset, rawVal, 0, 2);
            bmd.setNullDateFOtvl(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateFOtvl().intValue() == -1) {
                bmd.setDateFOtvl(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2287 + offset, rawVal, 0, 2);
            bmd.setNullDvsTOtvl(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDvsTOtvl().intValue() == -1) {
                bmd.setDvsTOtvl(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2289 + offset, rawVal, 0, 2);
            bmd.setNullDvsZ(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDvsZ().intValue() == -1) {
                bmd.setDvsZ(null);
            }
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 2291 + offset, rawVal, 0, 4);
            bmd.setKdsTek(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[26];
            System.arraycopy(modelData, 2295 + offset, rawVal, 0, 26);
            bmd.setDvsTek(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 2321 + offset, rawVal, 0, 9);
            bmd.setKppTek(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 2330 + offset, rawVal, 0, 1);
            bmd.setPrZamen(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 2331 + offset, rawVal, 0, 19);
            bmd.setDateBegZamen(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 2350 + offset, rawVal, 0, 2);
            bmd.setNullDateBegZamen(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (bmd.getNullDateBegZamen().intValue() == -1) {
                bmd.setDateBegZamen(null);
            }
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 2352 + offset, rawVal, 0, 4);
            bmd.setTnRabAsutr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 2356 + offset, rawVal, 0, 4);
            bmd.setUchUob(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 2360 + offset, rawVal, 0, 4);
            bmd.setPoligon01(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 2364 + offset, rawVal, 0, 4);
            bmd.setPoligon02(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 2368 + offset, rawVal, 0, 4);
            bmd.setPoligon03(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 2372 + offset, rawVal, 0, 4);
            bmd.setPoligon04(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 2376 + offset, rawVal, 0, 4);
            bmd.setPoligon05(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 2380 + offset, rawVal, 0, 4);
            bmd.setPoligon06(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 2384 + offset, rawVal, 0, 4);
            bmd.setPoligon07(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 2388 + offset, rawVal, 0, 4);
            bmd.setPoligon08(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 2392 + offset, rawVal, 0, 4);
            bmd.setPoligon09(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 2396 + offset, rawVal, 0, 4);
            bmd.setPoligon10(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[30];
            System.arraycopy(modelData, 2400 + offset, rawVal, 0, 30);
            bmd.setRezBmd(rawVal);
        }

        pfmx.addBmdRow(bmd);

    }

}
