package ru.ocrv.asoup3.pfmx.parser;

import static ru.ocrv.asoup3.pfmx.PfmxParser.CHARSET;

import java.math.BigInteger;
import java.nio.charset.Charset;

import ru.ocrv.asoup3.pfmx.model.PfmxSpdVagRow;
import ru.ocrv.asoup3.pfmx.util.ClassUtil;

public class PfmxSpdVagParser {

    public static PfmxSpdVagRow processSpdVagRow(byte[] modelData, int localOffset) {

        PfmxSpdVagRow spdVag = new PfmxSpdVagRow();

        int offset = localOffset + 4;

        {
            byte[] rawVal = new byte[15];
            System.arraycopy(modelData, 0 + offset, rawVal, 0, 15);
            spdVag.setIndexPoezd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 15 + offset, rawVal, 0, 19);
            spdVag.setDateForm(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 34 + offset, rawVal, 0, 2);
            spdVag.setDorRasch(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 36 + offset, rawVal, 0, 2);
            spdVag.setKopPmd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 38 + offset, rawVal, 0, 19);
            spdVag.setDateOp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 57 + offset, rawVal, 0, 4);
            spdVag.setStanOp(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 61 + offset, rawVal, 0, 4);
            spdVag.setIdPoezd(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 65 + offset, rawVal, 0, 4);
            spdVag.setKsnmPoezd(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 69 + offset, rawVal, 0, 4);
            spdVag.setKskmPoezd(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 73 + offset, rawVal, 0, 2);
            spdVag.setNomPoezd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 75 + offset, rawVal, 0, 2);
            spdVag.setRodPoezd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 77 + offset, rawVal, 0, 1);
            spdVag.setPrPoslSost(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 78 + offset, rawVal, 0, 19);
            spdVag.setDateKonSost(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 97 + offset, rawVal, 0, 2);
            spdVag.setKopPmdKon(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[12];
            System.arraycopy(modelData, 99 + offset, rawVal, 0, 12);
            spdVag.setNomVag(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 111 + offset, rawVal, 0, 4);
            spdVag.setNomVagon(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 115 + offset, rawVal, 0, 2);
            spdVag.setKodSob(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 117 + offset, rawVal, 0, 1);
            spdVag.setPrNkz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 118 + offset, rawVal, 0, 1);
            spdVag.setPrSysNum(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 119 + offset, rawVal, 0, 1);
            spdVag.setPrDvNum(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 120 + offset, rawVal, 0, 1);
            spdVag.setPrDvoin(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 121 + offset, rawVal, 0, 1);
            spdVag.setPrSnUch(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 122 + offset, rawVal, 0, 1);
            spdVag.setPrZapKur(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 123 + offset, rawVal, 0, 1);
            spdVag.setPrNalTexp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 124 + offset, rawVal, 0, 2);
            spdVag.setPrKach(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 126 + offset, rawVal, 0, 2);
            spdVag.setVesTarCen(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 128 + offset, rawVal, 0, 2);
            spdVag.setRodVagUch(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 130 + offset, rawVal, 0, 2);
            spdVag.setUslTip4(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 132 + offset, rawVal, 0, 1);
            spdVag.setOtmRol(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 133 + offset, rawVal, 0, 2);
            spdVag.setDlVag(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 135 + offset, rawVal, 0, 2);
            spdVag.setKolOsey(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 137 + offset, rawVal, 0, 1);
            spdVag.setPrAr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 138 + offset, rawVal, 0, 1);
            spdVag.setPrSubar(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 139 + offset, rawVal, 0, 1);
            spdVag.setPrSob(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 140 + offset, rawVal, 0, 1);
            spdVag.setPrMps(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 141 + offset, rawVal, 0, 1);
            spdVag.setPrKomp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 142 + offset, rawVal, 0, 4);
            spdVag.setOkpoSob(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 146 + offset, rawVal, 0, 4);
            spdVag.setOkpoSubar(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 150 + offset, rawVal, 0, 1);
            spdVag.setPpvMest(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 151 + offset, rawVal, 0, 1);
            spdVag.setPpvTranz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 152 + offset, rawVal, 0, 1);
            spdVag.setPpvMestNod(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 153 + offset, rawVal, 0, 1);
            spdVag.setPpvTrNod(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 154 + offset, rawVal, 0, 1);
            spdVag.setKodVidaSled(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 155 + offset, rawVal, 0, 1);
            spdVag.setPpvPor(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 156 + offset, rawVal, 0, 1);
            spdVag.setPpvGruj(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 157 + offset, rawVal, 0, 1);
            spdVag.setPpvNrp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 158 + offset, rawVal, 0, 1);
            spdVag.setPpvRp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 159 + offset, rawVal, 0, 1);
            spdVag.setPpvGruzOs(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 160 + offset, rawVal, 0, 1);
            spdVag.setPpvRd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 161 + offset, rawVal, 0, 1);
            spdVag.setPpvKon(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 162 + offset, rawVal, 0, 1);
            spdVag.setPpvMo(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 163 + offset, rawVal, 0, 1);
            spdVag.setPpvKkb(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 164 + offset, rawVal, 0, 1);
            spdVag.setPpvSvrf(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 165 + offset, rawVal, 0, 1);
            spdVag.setKodGrupVag(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 166 + offset, rawVal, 0, 4);
            spdVag.setStanPogr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 170 + offset, rawVal, 0, 2);
            spdVag.setGruzpol(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 172 + offset, rawVal, 0, 2);
            spdVag.setGruzotpr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 174 + offset, rawVal, 0, 10);
            spdVag.setDateDostav(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 184 + offset, rawVal, 0, 4);
            spdVag.setKodGrzTgnl(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 188 + offset, rawVal, 0, 2);
            spdVag.setRodGrzOsn(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 190 + offset, rawVal, 0, 4);
            spdVag.setVesGrz(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 194 + offset, rawVal, 0, 2);
            spdVag.setKolGrjKtk(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 196 + offset, rawVal, 0, 2);
            spdVag.setKolGrjStk(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 198 + offset, rawVal, 0, 2);
            spdVag.setKolPorKtk(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 200 + offset, rawVal, 0, 2);
            spdVag.setKolPorStk(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 202 + offset, rawVal, 0, 4);
            spdVag.setStanNazn(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 206 + offset, rawVal, 0, 4);
            spdVag.setStanNaznNak(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 210 + offset, rawVal, 0, 4);
            spdVag.setStanSdach(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 214 + offset, rawVal, 0, 2);
            spdVag.setNodNazn(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 216 + offset, rawVal, 0, 2);
            spdVag.setDorNazn(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 218 + offset, rawVal, 0, 4);
            spdVag.setStanVyxPogran(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 222 + offset, rawVal, 0, 4);
            spdVag.setStanPerer(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 226 + offset, rawVal, 0, 1);
            spdVag.setOsOtm1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 227 + offset, rawVal, 0, 1);
            spdVag.setOsOtm2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 228 + offset, rawVal, 0, 1);
            spdVag.setOsOtm3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[6];
            System.arraycopy(modelData, 229 + offset, rawVal, 0, 6);
            spdVag.setPrim1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[6];
            System.arraycopy(modelData, 235 + offset, rawVal, 0, 6);
            spdVag.setPrim2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 241 + offset, rawVal, 0, 2);
            spdVag.setKolZpu(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 243 + offset, rawVal, 0, 2);
            spdVag.setNppVag(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 245 + offset, rawVal, 0, 2);
            spdVag.setNomVagShem(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 247 + offset, rawVal, 0, 4);
            spdVag.setStanNaznPf(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 251 + offset, rawVal, 0, 4);
            spdVag.setStanKonSl(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 255 + offset, rawVal, 0, 1);
            spdVag.setGvMarshOv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 256 + offset, rawVal, 0, 1);
            spdVag.setPrinMarshOv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 257 + offset, rawVal, 0, 1);
            spdVag.setPrNarushPf(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 258 + offset, rawVal, 0, 1);
            spdVag.setVagMarsh(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 259 + offset, rawVal, 0, 1);
            spdVag.setVagFgp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 260 + offset, rawVal, 0, 1);
            spdVag.setSledNeNazn(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 261 + offset, rawVal, 0, 1);
            spdVag.setPrSkoropGrz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 262 + offset, rawVal, 0, 1);
            spdVag.setPrSpecGrz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 263 + offset, rawVal, 0, 1);
            spdVag.setPrOpasGrz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 264 + offset, rawVal, 0, 4);
            spdVag.setSobPassVag(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 268 + offset, rawVal, 0, 4);
            spdVag.setStanOtc(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 272 + offset, rawVal, 0, 4);
            spdVag.setKdsT(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 276 + offset, rawVal, 0, 19);
            spdVag.setDvsT(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 295 + offset, rawVal, 0, 9);
            spdVag.setKppT(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 304 + offset, rawVal, 0, 4);
            spdVag.setUnsT(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 308 + offset, rawVal, 0, 2);
            spdVag.setKolMest(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 310 + offset, rawVal, 0, 4);
            spdVag.setKodGrzUch(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[7];
            System.arraycopy(modelData, 314 + offset, rawVal, 0, 7);
            spdVag.setKodGrzGng(new BigInteger(rawVal));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 321 + offset, rawVal, 0, 2);
            spdVag.setRodGrzDet(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 323 + offset, rawVal, 0, 2);
            spdVag.setTipVag(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 325 + offset, rawVal, 0, 1);
            spdVag.setTipEdv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 326 + offset, rawVal, 0, 2);
            spdVag.setKolPoleyTgnl(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 328 + offset, rawVal, 0, 2);
            spdVag.setPrTarTgnl(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 330 + offset, rawVal, 0, 2);
            spdVag.setNullDateKonSost(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (spdVag.getNullDateKonSost().intValue() == -1) {
                spdVag.setDateKonSost(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 332 + offset, rawVal, 0, 2);
            spdVag.setNullDateDostav(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (spdVag.getNullDateDostav().intValue() == -1) {
                spdVag.setDateDostav(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 334 + offset, rawVal, 0, 2);
            spdVag.setNullDvsT(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (spdVag.getNullDvsT().intValue() == -1) {
                spdVag.setDvsT(null);
            }
        }
        return spdVag;
    }
}
