package ru.ocrv.asoup3.pfmx.parser;

import static ru.ocrv.asoup3.pfmx.PfmxParser.CHARSET;

import java.math.BigInteger;
import java.nio.charset.Charset;

import ru.ocrv.asoup3.pfmx.model.PfmxSpdPricRow;
import ru.ocrv.asoup3.pfmx.util.ClassUtil;

public class PfmxSpdPricParser {

    public static PfmxSpdPricRow processSpdPricRow(byte[] modelData, int localOffset) {

        PfmxSpdPricRow spdPric = new PfmxSpdPricRow();
        //        spdPric.setRowLength(modelLength);

        int offset = localOffset + 4;

        {
            byte[] rawVal = new byte[15];
            System.arraycopy(modelData, 0 + offset, rawVal, 0, 15);
            spdPric.setIndexPoezd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 15 + offset, rawVal, 0, 19);
            spdPric.setDateForm(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 34 + offset, rawVal, 0, 2);
            spdPric.setDorRasch(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 36 + offset, rawVal, 0, 2);
            spdPric.setKopPmd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 38 + offset, rawVal, 0, 19);
            spdPric.setDateOp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 57 + offset, rawVal, 0, 4);
            spdPric.setStanOp(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 61 + offset, rawVal, 0, 4);
            spdPric.setIdPoezd(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 65 + offset, rawVal, 0, 4);
            spdPric.setKsnmPoezd(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 69 + offset, rawVal, 0, 4);
            spdPric.setKskmPoezd(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 73 + offset, rawVal, 0, 2);
            spdPric.setNomPoezd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 75 + offset, rawVal, 0, 2);
            spdPric.setRodPoezd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 77 + offset, rawVal, 0, 1);
            spdPric.setPrPoslSost(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 78 + offset, rawVal, 0, 19);
            spdPric.setDateKonSost(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 97 + offset, rawVal, 0, 2);
            spdPric.setKopPmdKon(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[12];
            System.arraycopy(modelData, 99 + offset, rawVal, 0, 12);
            spdPric.setNomVag(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 111 + offset, rawVal, 0, 4);
            spdPric.setNomVagon(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 115 + offset, rawVal, 0, 2);
            spdPric.setKodSob(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 117 + offset, rawVal, 0, 1);
            spdPric.setPrNkz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 118 + offset, rawVal, 0, 1);
            spdPric.setPrSysNum(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 119 + offset, rawVal, 0, 1);
            spdPric.setPrDvNum(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 120 + offset, rawVal, 0, 1);
            spdPric.setPrDvoin(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 121 + offset, rawVal, 0, 1);
            spdPric.setPrSnUch(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 122 + offset, rawVal, 0, 1);
            spdPric.setPrZapKur(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 123 + offset, rawVal, 0, 1);
            spdPric.setPrNalTexp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 124 + offset, rawVal, 0, 2);
            spdPric.setPrKach(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 126 + offset, rawVal, 0, 2);
            spdPric.setVesTarCen(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 128 + offset, rawVal, 0, 2);
            spdPric.setRodVagUch(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 130 + offset, rawVal, 0, 2);
            spdPric.setUslTip4(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 132 + offset, rawVal, 0, 1);
            spdPric.setOtmRol(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 133 + offset, rawVal, 0, 2);
            spdPric.setDlVag(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 135 + offset, rawVal, 0, 2);
            spdPric.setKolOsey(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 137 + offset, rawVal, 0, 1);
            spdPric.setPrAr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 138 + offset, rawVal, 0, 1);
            spdPric.setPrSubar(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 139 + offset, rawVal, 0, 1);
            spdPric.setPrSob(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 140 + offset, rawVal, 0, 1);
            spdPric.setPrMps(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 141 + offset, rawVal, 0, 1);
            spdPric.setPrKomp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 142 + offset, rawVal, 0, 4);
            spdPric.setOkpoSob(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 146 + offset, rawVal, 0, 4);
            spdPric.setOkpoSubar(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 150 + offset, rawVal, 0, 1);
            spdPric.setPpvMest(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 151 + offset, rawVal, 0, 1);
            spdPric.setPpvTranz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 152 + offset, rawVal, 0, 1);
            spdPric.setPpvMestNod(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 153 + offset, rawVal, 0, 1);
            spdPric.setPpvTrNod(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 154 + offset, rawVal, 0, 1);
            spdPric.setKodVidaSled(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 155 + offset, rawVal, 0, 1);
            spdPric.setPpvPor(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 156 + offset, rawVal, 0, 1);
            spdPric.setPpvGruj(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 157 + offset, rawVal, 0, 1);
            spdPric.setPpvNrp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 158 + offset, rawVal, 0, 1);
            spdPric.setPpvRp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 159 + offset, rawVal, 0, 1);
            spdPric.setPpvGruzOs(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 160 + offset, rawVal, 0, 1);
            spdPric.setPpvRd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 161 + offset, rawVal, 0, 1);
            spdPric.setPpvKon(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 162 + offset, rawVal, 0, 1);
            spdPric.setPpvMo(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 163 + offset, rawVal, 0, 1);
            spdPric.setPpvKkb(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 164 + offset, rawVal, 0, 1);
            spdPric.setPpvSvrf(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 165 + offset, rawVal, 0, 1);
            spdPric.setKodGrupVag(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 166 + offset, rawVal, 0, 4);
            spdPric.setStanPogr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 170 + offset, rawVal, 0, 2);
            spdPric.setGruzpol(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 172 + offset, rawVal, 0, 2);
            spdPric.setGruzotpr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 174 + offset, rawVal, 0, 10);
            spdPric.setDateDostav(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 184 + offset, rawVal, 0, 4);
            spdPric.setKodGrzTgnl(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 188 + offset, rawVal, 0, 2);
            spdPric.setRodGrzOsn(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 190 + offset, rawVal, 0, 4);
            spdPric.setVesGrz(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 194 + offset, rawVal, 0, 2);
            spdPric.setKolGrjKtk(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 196 + offset, rawVal, 0, 2);
            spdPric.setKolGrjStk(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 198 + offset, rawVal, 0, 2);
            spdPric.setKolPorKtk(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 200 + offset, rawVal, 0, 2);
            spdPric.setKolPorStk(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 202 + offset, rawVal, 0, 4);
            spdPric.setStanNazn(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 206 + offset, rawVal, 0, 4);
            spdPric.setStanNaznNak(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 210 + offset, rawVal, 0, 4);
            spdPric.setStanSdach(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 214 + offset, rawVal, 0, 2);
            spdPric.setNodNazn(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 216 + offset, rawVal, 0, 2);
            spdPric.setDorNazn(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 218 + offset, rawVal, 0, 4);
            spdPric.setStanVyxPogran(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 222 + offset, rawVal, 0, 4);
            spdPric.setStanPerer(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 226 + offset, rawVal, 0, 1);
            spdPric.setOsOtm1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 227 + offset, rawVal, 0, 1);
            spdPric.setOsOtm2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 228 + offset, rawVal, 0, 1);
            spdPric.setOsOtm3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[6];
            System.arraycopy(modelData, 229 + offset, rawVal, 0, 6);
            spdPric.setPrim1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[6];
            System.arraycopy(modelData, 235 + offset, rawVal, 0, 6);
            spdPric.setPrim2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 241 + offset, rawVal, 0, 2);
            spdPric.setKolZpu(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 243 + offset, rawVal, 0, 2);
            spdPric.setNppVag(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 245 + offset, rawVal, 0, 2);
            spdPric.setNomVagShem(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 247 + offset, rawVal, 0, 4);
            spdPric.setStanNaznPf(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 251 + offset, rawVal, 0, 4);
            spdPric.setStanKonSl(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 255 + offset, rawVal, 0, 1);
            spdPric.setGvMarshOv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 256 + offset, rawVal, 0, 1);
            spdPric.setPrinMarshOv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 257 + offset, rawVal, 0, 1);
            spdPric.setPrNarushPf(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 258 + offset, rawVal, 0, 1);
            spdPric.setVagMarsh(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 259 + offset, rawVal, 0, 1);
            spdPric.setVagFgp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 260 + offset, rawVal, 0, 1);
            spdPric.setSledNeNazn(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 261 + offset, rawVal, 0, 1);
            spdPric.setPrSkoropGrz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 262 + offset, rawVal, 0, 1);
            spdPric.setPrSpecGrz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 263 + offset, rawVal, 0, 1);
            spdPric.setPrOpasGrz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 264 + offset, rawVal, 0, 4);
            spdPric.setSobPassVag(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 268 + offset, rawVal, 0, 4);
            spdPric.setStanOtc(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 272 + offset, rawVal, 0, 4);
            spdPric.setKdsT(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 276 + offset, rawVal, 0, 19);
            spdPric.setDvsT(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 295 + offset, rawVal, 0, 9);
            spdPric.setKppT(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 304 + offset, rawVal, 0, 4);
            spdPric.setUnsT(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 308 + offset, rawVal, 0, 2);
            spdPric.setKolMest(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 310 + offset, rawVal, 0, 4);
            spdPric.setKodGrzUch(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[7];
            System.arraycopy(modelData, 314 + offset, rawVal, 0, 7);
            spdPric.setKodGrzGng(new BigInteger(rawVal));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 321 + offset, rawVal, 0, 2);
            spdPric.setRodGrzDet(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 323 + offset, rawVal, 0, 2);
            spdPric.setTipVag(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 325 + offset, rawVal, 0, 1);
            spdPric.setTipEdv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 326 + offset, rawVal, 0, 2);
            spdPric.setKolPoleyTgnl(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 328 + offset, rawVal, 0, 2);
            spdPric.setPrTarTgnl(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 330 + offset, rawVal, 0, 2);
            spdPric.setNullDateKonSost(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (spdPric.getNullDateKonSost().intValue() == -1) {
                spdPric.setDateKonSost(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 332 + offset, rawVal, 0, 2);
            spdPric.setNullDateDostav(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (spdPric.getNullDateDostav().intValue() == -1) {
                spdPric.setDateDostav(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 334 + offset, rawVal, 0, 2);
            spdPric.setNullDvsT(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (spdPric.getNullDvsT().intValue() == -1) {
                spdPric.setDvsT(null);
            }

            return spdPric;

        }
    }
}
