package ru.ocrv.asoup3.pfmx.parser;

import static ru.ocrv.asoup3.pfmx.PfmxParser.CHARSET;

import java.nio.charset.Charset;

import ru.ocrv.asoup3.pfmx.model.PfmxKmdRow;
import ru.ocrv.asoup3.pfmx.model.PfmxMessage;
import ru.ocrv.asoup3.pfmx.util.ClassUtil;

public class PfmxKmdParser implements PfmxModelParser {

    @Override
    public void processRow(PfmxMessage pfmx, byte[] modelData, int localOffset, int modelLength) {

        PfmxKmdRow kmd = new PfmxKmdRow();
        kmd.setRowLength(modelLength);

        int offset = 4 + localOffset;

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 0 + offset, rawVal, 0, 2);
            kmd.setPrTfz1(new Short((ClassUtil.byteArrayToShort(rawVal))));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 2 + offset, rawVal, 0, 10);
            kmd.setPrTfz2(rawVal);
        }

        {
            byte[] rawVal = new byte[11];
            System.arraycopy(modelData, 12 + offset, rawVal, 0, 11);
            kmd.setNomKon(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 23 + offset, rawVal, 0, 2);
            kmd.setDorRasch(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 25 + offset, rawVal, 0, 2);
            kmd.setKopKmd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 27 + offset, rawVal, 0, 19);
            kmd.setDateOp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 46 + offset, rawVal, 0, 4);
            kmd.setStanOp(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 50 + offset, rawVal, 0, 2);
            kmd.setKodSob(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[3];
            System.arraycopy(modelData, 52 + offset, rawVal, 0, 3);
            kmd.setStrVl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 55 + offset, rawVal, 0, 2);
            kmd.setTipKon(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 57 + offset, rawVal, 0, 2);
            kmd.setRazmKon(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 59 + offset, rawVal, 0, 1);
            kmd.setPrKachGvnk(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 60 + offset, rawVal, 0, 1);
            kmd.setPrKachVnnn(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 61 + offset, rawVal, 0, 1);
            kmd.setPrKachNkz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 62 + offset, rawVal, 0, 1);
            kmd.setPrKachNsn(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 63 + offset, rawVal, 0, 1);
            kmd.setPrKachDvan(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 64 + offset, rawVal, 0, 1);
            kmd.setPrKachDvoi(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 65 + offset, rawVal, 0, 1);
            kmd.setPrKachIsper(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 66 + offset, rawVal, 0, 1);
            kmd.setPrKachIsakt(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 67 + offset, rawVal, 0, 1);
            kmd.setPrKachTexp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 68 + offset, rawVal, 0, 4);
            kmd.setPrKach(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 72 + offset, rawVal, 0, 2);
            kmd.setTiporazmKon(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 74 + offset, rawVal, 0, 1);
            kmd.setVidKon(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 75 + offset, rawVal, 0, 1);
            kmd.setVidPrinadl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 76 + offset, rawVal, 0, 4);
            kmd.setGrpKonKg(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 80 + offset, rawVal, 0, 2);
            kmd.setVesTarKg(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 82 + offset, rawVal, 0, 2);
            kmd.setNormZagrCen(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 84 + offset, rawVal, 0, 10);
            kmd.setDatePostr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 94 + offset, rawVal, 0, 10);
            kmd.setDatePlRem(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 104 + offset, rawVal, 0, 2);
            kmd.setPrRabKon(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 106 + offset, rawVal, 0, 1);
            kmd.setPrPripis(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 107 + offset, rawVal, 0, 4);
            kmd.setDorstanPripis(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 111 + offset, rawVal, 0, 4);
            kmd.setStykPriemGos(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 115 + offset, rawVal, 0, 19);
            kmd.setDatePriemGos(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 134 + offset, rawVal, 0, 2);
            kmd.setDorPriemGos(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 136 + offset, rawVal, 0, 2);
            kmd.setDorSdachGos(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 138 + offset, rawVal, 0, 4);
            kmd.setStykPriemDor(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 142 + offset, rawVal, 0, 19);
            kmd.setDatePriemDor(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 161 + offset, rawVal, 0, 2);
            kmd.setDorSdach(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 163 + offset, rawVal, 0, 1);
            kmd.setPrDvoiDor(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 164 + offset, rawVal, 0, 1);
            kmd.setPrNkzPriv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 165 + offset, rawVal, 0, 2);
            kmd.setRgnDis(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 167 + offset, rawVal, 0, 2);
            kmd.setDorDis(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 169 + offset, rawVal, 0, 2);
            kmd.setOcDis(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 171 + offset, rawVal, 0, 2);
            kmd.setNodDis(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 173 + offset, rawVal, 0, 4);
            kmd.setStanDis(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 177 + offset, rawVal, 0, 4);
            kmd.setNbe(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 181 + offset, rawVal, 0, 1);
            kmd.setPrOp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 182 + offset, rawVal, 0, 2);
            kmd.setNomPark(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 184 + offset, rawVal, 0, 2);
            kmd.setNomPut(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 186 + offset, rawVal, 0, 1);
            kmd.setVidDisStan(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 187 + offset, rawVal, 0, 1);
            kmd.setVidDisDor(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 188 + offset, rawVal, 0, 1);
            kmd.setPr402(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 189 + offset, rawVal, 0, 1);
            kmd.setTipEdv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 190 + offset, rawVal, 0, 1);
            kmd.setPpkMest(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 191 + offset, rawVal, 0, 1);
            kmd.setPpkTran(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 192 + offset, rawVal, 0, 1);
            kmd.setPpkPor(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 193 + offset, rawVal, 0, 1);
            kmd.setPpkGruj(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 194 + offset, rawVal, 0, 1);
            kmd.setPpkNrp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 195 + offset, rawVal, 0, 1);
            kmd.setPpkRp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 196 + offset, rawVal, 0, 1);
            kmd.setPpkParkrd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 197 + offset, rawVal, 0, 1);
            kmd.setVnrpNeisp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 198 + offset, rawVal, 0, 1);
            kmd.setVnrpRezerv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 199 + offset, rawVal, 0, 1);
            kmd.setVnrpZapas(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 200 + offset, rawVal, 0, 1);
            kmd.setVnrpPodIskl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 201 + offset, rawVal, 0, 1);
            kmd.setVnrpIskl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[3];
            System.arraycopy(modelData, 202 + offset, rawVal, 0, 3);
            kmd.setKodSostUch(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 205 + offset, rawVal, 0, 1);
            kmd.setPrKonVag(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 206 + offset, rawVal, 0, 1);
            kmd.setPrKonPoezd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 207 + offset, rawVal, 0, 2);
            kmd.setKopPmd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 209 + offset, rawVal, 0, 1);
            kmd.setPrStykPosl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 210 + offset, rawVal, 0, 2);
            kmd.setDornodPosl(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 212 + offset, rawVal, 0, 4);
            kmd.setNaprPosl(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 216 + offset, rawVal, 0, 2);
            kmd.setKopPrib202(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 218 + offset, rawVal, 0, 1);
            kmd.setPrStykPrib202(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 219 + offset, rawVal, 0, 2);
            kmd.setDornodPrib202(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 221 + offset, rawVal, 0, 4);
            kmd.setNaprPrib202(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 225 + offset, rawVal, 0, 2);
            kmd.setKodNod(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 227 + offset, rawVal, 0, 1);
            kmd.setPr425(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 228 + offset, rawVal, 0, 1);
            kmd.setPrCh1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 229 + offset, rawVal, 0, 1);
            kmd.setPrCh2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 230 + offset, rawVal, 0, 1);
            kmd.setPrCh3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 231 + offset, rawVal, 0, 1);
            kmd.setPrCh4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 232 + offset, rawVal, 0, 1);
            kmd.setPrCh5(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 233 + offset, rawVal, 0, 4);
            kmd.setStanIzmSost(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 237 + offset, rawVal, 0, 2);
            kmd.setKopIzmSost(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 239 + offset, rawVal, 0, 19);
            kmd.setDateIzmSost(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[12];
            System.arraycopy(modelData, 258 + offset, rawVal, 0, 12);
            kmd.setNomOtprk(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 270 + offset, rawVal, 0, 4);
            kmd.setStanPogrOtprk(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 274 + offset, rawVal, 0, 19);
            kmd.setDatePogrOtprk(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 293 + offset, rawVal, 0, 2);
            kmd.setDorPogrOtprk(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 295 + offset, rawVal, 0, 2);
            kmd.setStrOtprv(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 297 + offset, rawVal, 0, 4);
            kmd.setStanNaznOtprk(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 301 + offset, rawVal, 0, 2);
            kmd.setNodNazn(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 303 + offset, rawVal, 0, 2);
            kmd.setDorNazn(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 305 + offset, rawVal, 0, 2);
            kmd.setStrNazn(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 307 + offset, rawVal, 0, 4);
            kmd.setMasGrz(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 311 + offset, rawVal, 0, 4);
            kmd.setVesBr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 315 + offset, rawVal, 0, 4);
            kmd.setKodGrzEtsng(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[7];
            System.arraycopy(modelData, 319 + offset, rawVal, 0, 7);
            kmd.setKodGrzGng(ClassUtil.byteArrayToBigInt(rawVal));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 326 + offset, rawVal, 0, 2);
            kmd.setRodGrz(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 328 + offset, rawVal, 0, 4);
            kmd.setGruzotpr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 332 + offset, rawVal, 0, 4);
            kmd.setGruzpol(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 336 + offset, rawVal, 0, 4);
            kmd.setOkpoGruzotpr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 340 + offset, rawVal, 0, 4);
            kmd.setOkpoGruzpol(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[15];
            System.arraycopy(modelData, 344 + offset, rawVal, 0, 15);
            kmd.setNaimGruzpol(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[12];
            System.arraycopy(modelData, 359 + offset, rawVal, 0, 12);
            kmd.setPrim1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 371 + offset, rawVal, 0, 2);
            kmd.setKolKon(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[20];
            System.arraycopy(modelData, 373 + offset, rawVal, 0, 20);
            kmd.setNaimEksp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[6];
            System.arraycopy(modelData, 393 + offset, rawVal, 0, 6);
            kmd.setKodEksp(ClassUtil.byteArrayToBigInt(rawVal));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 399 + offset, rawVal, 0, 2);
            kmd.setAdmEksp(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 401 + offset, rawVal, 0, 2);
            kmd.setKodUpak(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 403 + offset, rawVal, 0, 2);
            kmd.setKolMest(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 405 + offset, rawVal, 0, 10);
            kmd.setDateDostGruz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[13];
            System.arraycopy(modelData, 415 + offset, rawVal, 0, 13);
            kmd.setTarif(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 428 + offset, rawVal, 0, 2);
            kmd.setKolZpu(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 430 + offset, rawVal, 0, 2);
            kmd.setTipZpu1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[8];
            System.arraycopy(modelData, 432 + offset, rawVal, 0, 8);
            kmd.setKzZpu1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 440 + offset, rawVal, 0, 1);
            kmd.setPrZpu1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 441 + offset, rawVal, 0, 2);
            kmd.setKodAdm1(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 443 + offset, rawVal, 0, 4);
            kmd.setStanNalZpu1(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 447 + offset, rawVal, 0, 19);
            kmd.setDateZpu1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 466 + offset, rawVal, 0, 2);
            kmd.setTipZpu2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[8];
            System.arraycopy(modelData, 468 + offset, rawVal, 0, 8);
            kmd.setKzZpu2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 476 + offset, rawVal, 0, 1);
            kmd.setPrZpu2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 477 + offset, rawVal, 0, 2);
            kmd.setKodAdm2(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 479 + offset, rawVal, 0, 4);
            kmd.setStanNalZpu2(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 483 + offset, rawVal, 0, 19);
            kmd.setDateZpu2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 502 + offset, rawVal, 0, 19);
            kmd.setDatePerNrp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 521 + offset, rawVal, 0, 4);
            kmd.setStanPerNrp(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 525 + offset, rawVal, 0, 2);
            kmd.setKopPerNrp(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 527 + offset, rawVal, 0, 2);
            kmd.setDorPerNrp(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 529 + offset, rawVal, 0, 4);
            kmd.setOkpoRempred(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[15];
            System.arraycopy(modelData, 533 + offset, rawVal, 0, 15);
            kmd.setOsnovanPerNrp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[8];
            System.arraycopy(modelData, 548 + offset, rawVal, 0, 8);
            kmd.setNomAvtoNrp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 556 + offset, rawVal, 0, 1);
            kmd.setVidRem(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[11];
            System.arraycopy(modelData, 557 + offset, rawVal, 0, 11);
            kmd.setNomKonSt(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 568 + offset, rawVal, 0, 19);
            kmd.setDateIzmNom(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 587 + offset, rawVal, 0, 19);
            kmd.setDatePogrVag(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 606 + offset, rawVal, 0, 4);
            kmd.setStanPogrVag(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 610 + offset, rawVal, 0, 2);
            kmd.setKopPogrVag(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 612 + offset, rawVal, 0, 4);
            kmd.setStanNaznVag(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 616 + offset, rawVal, 0, 4);
            kmd.setStanVyhPogran(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 620 + offset, rawVal, 0, 1);
            kmd.setPrSort(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[12];
            System.arraycopy(modelData, 621 + offset, rawVal, 0, 12);
            kmd.setNomVag(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 633 + offset, rawVal, 0, 4);
            kmd.setNomVagon(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 637 + offset, rawVal, 0, 19);
            kmd.setDateVklPoezd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 656 + offset, rawVal, 0, 4);
            kmd.setStanVklPoezd(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 660 + offset, rawVal, 0, 2);
            kmd.setKopVklPoezd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[15];
            System.arraycopy(modelData, 662 + offset, rawVal, 0, 15);
            kmd.setIndexPoezd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 677 + offset, rawVal, 0, 4);
            kmd.setNomPoezd(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 681 + offset, rawVal, 0, 2);
            kmd.setPrichOtc(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 683 + offset, rawVal, 0, 19);
            kmd.setDateZav(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 702 + offset, rawVal, 0, 4);
            kmd.setStanZav(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 706 + offset, rawVal, 0, 2);
            kmd.setKopZav(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 708 + offset, rawVal, 0, 2);
            kmd.setDorZav(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 710 + offset, rawVal, 0, 2);
            kmd.setNodZav(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 712 + offset, rawVal, 0, 1);
            kmd.setSostZav(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 713 + offset, rawVal, 0, 1);
            kmd.setKudaOtkuda(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[6];
            System.arraycopy(modelData, 714 + offset, rawVal, 0, 6);
            kmd.setNomNarZav(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 720 + offset, rawVal, 0, 4);
            kmd.setKodPolZav(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[15];
            System.arraycopy(modelData, 724 + offset, rawVal, 0, 15);
            kmd.setNaimPolZav(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[8];
            System.arraycopy(modelData, 739 + offset, rawVal, 0, 8);
            kmd.setNomAvtoZav(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 747 + offset, rawVal, 0, 4);
            kmd.setOkpoPlatZav(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 751 + offset, rawVal, 0, 1);
            kmd.setDopriem(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 752 + offset, rawVal, 0, 1);
            kmd.setNepriem(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 753 + offset, rawVal, 0, 1);
            kmd.setSoglasov(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 754 + offset, rawVal, 0, 1);
            kmd.setVozvrat(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 755 + offset, rawVal, 0, 1);
            kmd.setPrZadSpv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 756 + offset, rawVal, 0, 4);
            kmd.setNomPpv(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 760 + offset, rawVal, 0, 4);
            kmd.setStanPpv(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 764 + offset, rawVal, 0, 1);
            kmd.setTipPpv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 765 + offset, rawVal, 0, 19);
            kmd.setDatePpv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 784 + offset, rawVal, 0, 2);
            kmd.setKopSpv(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 786 + offset, rawVal, 0, 4);
            kmd.setStykPpv(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 790 + offset, rawVal, 0, 1);
            kmd.setPriemNepr1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 791 + offset, rawVal, 0, 2);
            kmd.setKodOrg1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 793 + offset, rawVal, 0, 2);
            kmd.setNomAkt1(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[3];
            System.arraycopy(modelData, 795 + offset, rawVal, 0, 3);
            kmd.setNeispr1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 798 + offset, rawVal, 0, 1);
            kmd.setPriemNepr2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 799 + offset, rawVal, 0, 2);
            kmd.setKodOrg2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 801 + offset, rawVal, 0, 2);
            kmd.setNomAkt2(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[3];
            System.arraycopy(modelData, 803 + offset, rawVal, 0, 3);
            kmd.setNeispr2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 806 + offset, rawVal, 0, 1);
            kmd.setPriemNepr3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 807 + offset, rawVal, 0, 2);
            kmd.setKodOrg3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 809 + offset, rawVal, 0, 2);
            kmd.setNomAkt3(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[3];
            System.arraycopy(modelData, 811 + offset, rawVal, 0, 3);
            kmd.setNeispr3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 814 + offset, rawVal, 0, 1);
            kmd.setPriemNepr4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 815 + offset, rawVal, 0, 2);
            kmd.setKodOrg4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 817 + offset, rawVal, 0, 2);
            kmd.setNomAkt4(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[3];
            System.arraycopy(modelData, 819 + offset, rawVal, 0, 3);
            kmd.setNeispr4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 822 + offset, rawVal, 0, 2);
            kmd.setKopVklKmd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 824 + offset, rawVal, 0, 19);
            kmd.setDateVklKmd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 843 + offset, rawVal, 0, 4);
            kmd.setStanVklKmd(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 847 + offset, rawVal, 0, 4);
            kmd.setKds(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 851 + offset, rawVal, 0, 19);
            kmd.setDvs(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 870 + offset, rawVal, 0, 9);
            kmd.setKpp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 879 + offset, rawVal, 0, 4);
            kmd.setKdsT(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 883 + offset, rawVal, 0, 19);
            kmd.setDvsT(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 902 + offset, rawVal, 0, 9);
            kmd.setKppT(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 911 + offset, rawVal, 0, 1);
            kmd.setOtmNeskSost(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 912 + offset, rawVal, 0, 2);
            kmd.setKop1(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 914 + offset, rawVal, 0, 19);
            kmd.setDateOp1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 933 + offset, rawVal, 0, 2);
            kmd.setKop2(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 935 + offset, rawVal, 0, 19);
            kmd.setDateOp2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 954 + offset, rawVal, 0, 2);
            kmd.setKop3(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 956 + offset, rawVal, 0, 19);
            kmd.setDateOp3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 975 + offset, rawVal, 0, 2);
            kmd.setKop4(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 977 + offset, rawVal, 0, 19);
            kmd.setDateOp4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 996 + offset, rawVal, 0, 2);
            kmd.setKop5(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 998 + offset, rawVal, 0, 19);
            kmd.setDateOp5(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 1017 + offset, rawVal, 0, 10);
            kmd.setSl4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 1027 + offset, rawVal, 0, 10);
            kmd.setSl5(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 1037 + offset, rawVal, 0, 10);
            kmd.setSl6(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1047 + offset, rawVal, 0, 4);
            kmd.setUns(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1051 + offset, rawVal, 0, 4);
            kmd.setUnsT(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1055 + offset, rawVal, 0, 2);
            kmd.setNullDatePostr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (kmd.getNullDatePostr().intValue() == -1) {
                kmd.setDatePostr(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1057 + offset, rawVal, 0, 2);
            kmd.setNullDatePlRem(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (kmd.getNullDatePlRem().intValue() == -1) {
                kmd.setDatePlRem(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1059 + offset, rawVal, 0, 2);
            kmd.setNullDatePriemGos(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (kmd.getNullDatePriemGos().intValue() == -1) {
                kmd.setDatePriemGos(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1061 + offset, rawVal, 0, 2);
            kmd.setNullDatePriemDor(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (kmd.getNullDatePriemDor().intValue() == -1) {
                kmd.setDatePriemDor(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1063 + offset, rawVal, 0, 2);
            kmd.setNullDateIzmSost(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (kmd.getNullDateIzmSost().intValue() == -1) {
                kmd.setDateIzmSost(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1065 + offset, rawVal, 0, 2);
            kmd.setNullDatePogrOtprk(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (kmd.getNullDatePogrOtprk().intValue() == -1) {
                kmd.setDatePogrOtprk(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1067 + offset, rawVal, 0, 2);
            kmd.setNullDateDostGruz(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (kmd.getNullDateDostGruz().intValue() == -1) {
                kmd.setDateDostGruz(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1069 + offset, rawVal, 0, 2);
            kmd.setNullDateZpu1(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (kmd.getNullDateZpu1().intValue() == -1) {
                kmd.setDateZpu1(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1071 + offset, rawVal, 0, 2);
            kmd.setNullDateZpu2(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (kmd.getNullDateZpu2().intValue() == -1) {
                kmd.setDateZpu2(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1073 + offset, rawVal, 0, 2);
            kmd.setNullDatePerNrp(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (kmd.getNullDatePerNrp().intValue() == -1) {
                kmd.setDatePerNrp(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1075 + offset, rawVal, 0, 2);
            kmd.setNullDateIzmNom(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (kmd.getNullDateIzmNom().intValue() == -1) {
                kmd.setDateIzmNom(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1077 + offset, rawVal, 0, 2);
            kmd.setNullDatePogrVag(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (kmd.getNullDatePogrVag().intValue() == -1) {
                kmd.setDatePogrVag(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1079 + offset, rawVal, 0, 2);
            kmd.setNullDateVklPoezd(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (kmd.getNullDateVklPoezd().intValue() == -1) {
                kmd.setDateVklPoezd(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1081 + offset, rawVal, 0, 2);
            kmd.setNullDateZav(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (kmd.getNullDateZav().intValue() == -1) {
                kmd.setDateZav(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1083 + offset, rawVal, 0, 2);
            kmd.setNullDatePpv(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (kmd.getNullDatePpv().intValue() == -1) {
                kmd.setDatePpv(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1085 + offset, rawVal, 0, 2);
            kmd.setNullDateVklKmd(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (kmd.getNullDateVklKmd().intValue() == -1) {
                kmd.setDateVklKmd(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1087 + offset, rawVal, 0, 2);
            kmd.setNullDvs(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (kmd.getNullDvs().intValue() == -1) {
                kmd.setDvs(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1089 + offset, rawVal, 0, 2);
            kmd.setNullDvsT(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (kmd.getNullDvsT().intValue() == -1) {
                kmd.setDvsT(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1091 + offset, rawVal, 0, 2);
            kmd.setNullDateOp1(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (kmd.getNullDateOp1().intValue() == -1) {
                kmd.setDateOp1(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1093 + offset, rawVal, 0, 2);
            kmd.setNullDateOp2(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (kmd.getNullDateOp2().intValue() == -1) {
                kmd.setDateOp2(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1095 + offset, rawVal, 0, 2);
            kmd.setNullDateOp3(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (kmd.getNullDateOp3().intValue() == -1) {
                kmd.setDateOp3(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1097 + offset, rawVal, 0, 2);
            kmd.setNullDateOp4(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (kmd.getNullDateOp4().intValue() == -1) {
                kmd.setDateOp4(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1099 + offset, rawVal, 0, 2);
            kmd.setNullDateOp5(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (kmd.getNullDateOp5().intValue() == -1) {
                kmd.setDateOp5(null);
            }
        }

        {
            byte[] rawVal = new byte[100];
            System.arraycopy(modelData, 1101 + offset, rawVal, 0, 100);
            kmd.setDopForSluKmd(rawVal);
        }

        pfmx.addKmdRow(kmd);
    }

}
