package ru.ocrv.asoup3.pfmx.parser;

import static ru.ocrv.asoup3.pfmx.PfmxParser.CHARSET;

import java.math.BigInteger;
import java.nio.charset.Charset;

import ru.ocrv.asoup3.pfmx.model.PfmxMessage;
import ru.ocrv.asoup3.pfmx.model.PfmxPmdRow;
import ru.ocrv.asoup3.pfmx.util.ClassUtil;

public class PfmxPmdParser implements PfmxModelParser {

    public void processRow(PfmxMessage pfmx, byte[] modelData, int localOffset, int modelLength) {

        PfmxPmdRow pmd = new PfmxPmdRow();
        pmd.setRowLength(modelLength);

        int offset = 4 + localOffset;

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 0 + offset, rawVal, 0, 2);
            pmd.setPrTfz1(new Short((ClassUtil.byteArrayToShort(rawVal))));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 2 + offset, rawVal, 0, 10);
            pmd.setPrTfz2(rawVal);
        }

        {
            byte[] rawVal = new byte[15];
            System.arraycopy(modelData, 12 + offset, rawVal, 0, 15);
            pmd.setIndexPoezd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 27 + offset, rawVal, 0, 2);
            pmd.setDorRasch(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 29 + offset, rawVal, 0, 2);
            pmd.setKopPmd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 31 + offset, rawVal, 0, 19);
            pmd.setDateOp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 50 + offset, rawVal, 0, 4);
            pmd.setStanOp(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 54 + offset, rawVal, 0, 1);
            pmd.setPrStykPosl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 55 + offset, rawVal, 0, 2);
            pmd.setDornodPosl(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 57 + offset, rawVal, 0, 4);
            pmd.setNaprPosl(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 61 + offset, rawVal, 0, 2);
            pmd.setKopPrib202(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 63 + offset, rawVal, 0, 1);
            pmd.setPrStykPrib202(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 64 + offset, rawVal, 0, 2);
            pmd.setDornodPrib202(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 66 + offset, rawVal, 0, 4);
            pmd.setNaprPrib202(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 70 + offset, rawVal, 0, 2);
            pmd.setNomPoezd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[12];
            System.arraycopy(modelData, 72 + offset, rawVal, 0, 12);
            pmd.setNomGolVag(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[12];
            System.arraycopy(modelData, 84 + offset, rawVal, 0, 12);
            pmd.setNomXvVag(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 96 + offset, rawVal, 0, 2);
            pmd.setUslDlPoezd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 98 + offset, rawVal, 0, 2);
            pmd.setVesBr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 100 + offset, rawVal, 0, 2);
            pmd.setVesNet(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 102 + offset, rawVal, 0, 2);
            pmd.setKolVag(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 104 + offset, rawVal, 0, 2);
            pmd.setKolVagUch(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 106 + offset, rawVal, 0, 2);
            pmd.setKolVagGruz(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 108 + offset, rawVal, 0, 2);
            pmd.setKolOsey(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 110 + offset, rawVal, 0, 2);
            pmd.setKolOseyRol(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 112 + offset, rawVal, 0, 1);
            pmd.setKodPrikr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 113 + offset, rawVal, 0, 4);
            pmd.setIndNegab(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 117 + offset, rawVal, 0, 1);
            pmd.setOtmGivn(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 118 + offset, rawVal, 0, 1);
            pmd.setOtmMarsh(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 119 + offset, rawVal, 0, 2);
            pmd.setOgrSkor(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 121 + offset, rawVal, 0, 2);
            pmd.setRgnDis(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 123 + offset, rawVal, 0, 2);
            pmd.setDorDis(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 125 + offset, rawVal, 0, 2);
            pmd.setOcDis(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 127 + offset, rawVal, 0, 2);
            pmd.setNodDis(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 129 + offset, rawVal, 0, 4);
            pmd.setStanDis(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 133 + offset, rawVal, 0, 4);
            pmd.setNbe(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 137 + offset, rawVal, 0, 2);
            pmd.setNomPark(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 139 + offset, rawVal, 0, 2);
            pmd.setNomPut(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 141 + offset, rawVal, 0, 4);
            pmd.setPrognStykSdach(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 145 + offset, rawVal, 0, 4);
            pmd.setStanNaznRegul(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 149 + offset, rawVal, 0, 2);
            pmd.setRodPoezd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 151 + offset, rawVal, 0, 2);
            pmd.setOtklNormVag(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 153 + offset, rawVal, 0, 2);
            pmd.setOtklNormTn(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 155 + offset, rawVal, 0, 1);
            pmd.setPrRf(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 156 + offset, rawVal, 0, 1);
            pmd.setPrOxr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 157 + offset, rawVal, 0, 1);
            pmd.setPrSpecGrz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 158 + offset, rawVal, 0, 1);
            pmd.setPrOoSpecGrz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 159 + offset, rawVal, 0, 1);
            pmd.setPrKommGrz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 160 + offset, rawVal, 0, 1);
            pmd.setPrOpasGrz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 161 + offset, rawVal, 0, 1);
            pmd.setPrSkoropGrz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 162 + offset, rawVal, 0, 1);
            pmd.setPrVagEdv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 163 + offset, rawVal, 0, 1);
            pmd.setPrOtcep(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 164 + offset, rawVal, 0, 1);
            pmd.setPrStk(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 165 + offset, rawVal, 0, 1);
            pmd.setPrKtk(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 166 + offset, rawVal, 0, 1);
            pmd.setPrVagFgp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 167 + offset, rawVal, 0, 1);
            pmd.setPrVagPz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 168 + offset, rawVal, 0, 1);
            pmd.setPrVagNkachnom(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 169 + offset, rawVal, 0, 1);
            pmd.setPrVagZagran(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 170 + offset, rawVal, 0, 1);
            pmd.setPrIzmIp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 171 + offset, rawVal, 0, 1);
            pmd.setPrSoed(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 172 + offset, rawVal, 0, 1);
            pmd.setPrFirm(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 173 + offset, rawVal, 0, 1);
            pmd.setPrVagKonSled(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 174 + offset, rawVal, 0, 1);
            pmd.setPrRazv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 175 + offset, rawVal, 0, 1);
            pmd.setPrSp5(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 176 + offset, rawVal, 0, 1);
            pmd.setPrKorTgnl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 177 + offset, rawVal, 0, 1);
            pmd.setPrMmo(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 178 + offset, rawVal, 0, 1);
            pmd.setPrNpfTek(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 179 + offset, rawVal, 0, 1);
            pmd.setPrNpfIst(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 180 + offset, rawVal, 0, 1);
            pmd.setPrNarSxp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 181 + offset, rawVal, 0, 1);
            pmd.setPrSdachDor(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 182 + offset, rawVal, 0, 1);
            pmd.setPrSdachZagran(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 183 + offset, rawVal, 0, 1);
            pmd.setPrSoglPpv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 184 + offset, rawVal, 0, 1);
            pmd.setPrMarshOv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 185 + offset, rawVal, 0, 2);
            pmd.setVidOtklNorm(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 187 + offset, rawVal, 0, 2);
            pmd.setKodPrichBros(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 189 + offset, rawVal, 0, 2);
            pmd.setKolSutOpozd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 191 + offset, rawVal, 0, 1);
            pmd.setPrBros(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 192 + offset, rawVal, 0, 1);
            pmd.setPrPorvag(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 193 + offset, rawVal, 0, 1);
            pmd.setPrPorvagKr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 194 + offset, rawVal, 0, 1);
            pmd.setPrPorvagPl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 195 + offset, rawVal, 0, 1);
            pmd.setPrPorvagPv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 196 + offset, rawVal, 0, 1);
            pmd.setPrPorvagCs(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 197 + offset, rawVal, 0, 1);
            pmd.setPrPorvagRf(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 198 + offset, rawVal, 0, 1);
            pmd.setPrPorvagPr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 199 + offset, rawVal, 0, 4);
            pmd.setNomPpv(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 203 + offset, rawVal, 0, 4);
            pmd.setStanIppv(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 207 + offset, rawVal, 0, 19);
            pmd.setDateIppv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 226 + offset, rawVal, 0, 4);
            pmd.setStanSppv(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 230 + offset, rawVal, 0, 19);
            pmd.setDateSppv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 249 + offset, rawVal, 0, 1);
            pmd.setTipPpv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 250 + offset, rawVal, 0, 4);
            pmd.setStanSdach(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 254 + offset, rawVal, 0, 4);
            pmd.setStanSdachPogran(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 258 + offset, rawVal, 0, 4);
            pmd.setStanPriem(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 262 + offset, rawVal, 0, 4);
            pmd.setStanPriemPogran(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 266 + offset, rawVal, 0, 4);
            pmd.setStykPpv(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 270 + offset, rawVal, 0, 19);
            pmd.setDatePsPoezd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[14];
            System.arraycopy(modelData, 289 + offset, rawVal, 0, 14);
            pmd.setFamagentSdach(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[14];
            System.arraycopy(modelData, 303 + offset, rawVal, 0, 14);
            pmd.setFamagentPriem(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 317 + offset, rawVal, 0, 1);
            pmd.setPrObmenaPpv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[15];
            System.arraycopy(modelData, 318 + offset, rawVal, 0, 15);
            pmd.setIndexPoezdPred(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 333 + offset, rawVal, 0, 19);
            pmd.setDateIzmIp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[15];
            System.arraycopy(modelData, 352 + offset, rawVal, 0, 15);
            pmd.setIndexPoezdS1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[15];
            System.arraycopy(modelData, 367 + offset, rawVal, 0, 15);
            pmd.setIndexPoezdS2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[15];
            System.arraycopy(modelData, 382 + offset, rawVal, 0, 15);
            pmd.setIndexPoezdS3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[15];
            System.arraycopy(modelData, 397 + offset, rawVal, 0, 15);
            pmd.setIndexPoezdS4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 412 + offset, rawVal, 0, 4);
            pmd.setStanNpf(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 416 + offset, rawVal, 0, 2);
            pmd.setKopNpf(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 418 + offset, rawVal, 0, 19);
            pmd.setDateOpNpf(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 437 + offset, rawVal, 0, 2);
            pmd.setKodNar(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 439 + offset, rawVal, 0, 2);
            pmd.setKolVagNpf(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 441 + offset, rawVal, 0, 4);
            pmd.setKds(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 445 + offset, rawVal, 0, 19);
            pmd.setDvs(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 464 + offset, rawVal, 0, 9);
            pmd.setKpp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 473 + offset, rawVal, 0, 1);
            pmd.setTipInfPoezd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 474 + offset, rawVal, 0, 2);
            pmd.setDorKuda02(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 476 + offset, rawVal, 0, 4);
            pmd.setKdsT(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 480 + offset, rawVal, 0, 19);
            pmd.setDvsT(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 499 + offset, rawVal, 0, 9);
            pmd.setKppT(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 508 + offset, rawVal, 0, 4);
            pmd.setIdPoezd(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 512 + offset, rawVal, 0, 4);
            pmd.setKsnmPoezd(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 516 + offset, rawVal, 0, 4);
            pmd.setKskmPoezd(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 520 + offset, rawVal, 0, 19);
            pmd.setDateForm(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 539 + offset, rawVal, 0, 19);
            pmd.setDateOpPoyavDor(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 558 + offset, rawVal, 0, 2);
            pmd.setKopPoyavDor(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 560 + offset, rawVal, 0, 4);
            pmd.setStykPriemDor(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 564 + offset, rawVal, 0, 2);
            pmd.setDorSdach(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[15];
            System.arraycopy(modelData, 566 + offset, rawVal, 0, 15);
            pmd.setIndexPoezdSdach(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 581 + offset, rawVal, 0, 1);
            pmd.setOtmNeskSost(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 582 + offset, rawVal, 0, 2);
            pmd.setKop1(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 584 + offset, rawVal, 0, 19);
            pmd.setDateOp1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 603 + offset, rawVal, 0, 2);
            pmd.setKop2(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 605 + offset, rawVal, 0, 19);
            pmd.setDateOp2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 624 + offset, rawVal, 0, 2);
            pmd.setKop3(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 626 + offset, rawVal, 0, 19);
            pmd.setDateOp3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 645 + offset, rawVal, 0, 2);
            pmd.setKop4(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 647 + offset, rawVal, 0, 19);
            pmd.setDateOp4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 666 + offset, rawVal, 0, 2);
            pmd.setKop5(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 668 + offset, rawVal, 0, 19);
            pmd.setDateOp5(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 687 + offset, rawVal, 0, 4);
            pmd.setStanGarObsl(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 691 + offset, rawVal, 0, 1);
            pmd.setPrSnyatGar(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[15];
            System.arraycopy(modelData, 692 + offset, rawVal, 0, 15);
            pmd.setIndexPoezdRasch(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 707 + offset, rawVal, 0, 19);
            pmd.setDatePriemDor(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 726 + offset, rawVal, 0, 19);
            pmd.setDatePriemGos(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 745 + offset, rawVal, 0, 4);
            pmd.setStykPriemGos(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 749 + offset, rawVal, 0, 2);
            pmd.setDorPriemGos(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 751 + offset, rawVal, 0, 2);
            pmd.setDorSdachGos(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 753 + offset, rawVal, 0, 4);
            pmd.setStanGarObsln(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 757 + offset, rawVal, 0, 19);
            pmd.setDatePerevGar(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 776 + offset, rawVal, 0, 4);
            pmd.setStansGarObsln(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 780 + offset, rawVal, 0, 19);
            pmd.setDateSnyatGar(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 799 + offset, rawVal, 0, 1);
            pmd.setPrEcp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 800 + offset, rawVal, 0, 19);
            pmd.setDateOpGdp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 819 + offset, rawVal, 0, 1);
            pmd.setPrOtkl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 820 + offset, rawVal, 0, 4);
            pmd.setRaznVrem(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[5];
            System.arraycopy(modelData, 824 + offset, rawVal, 0, 5);
            pmd.setNomPoezdExp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 829 + offset, rawVal, 0, 19);
            pmd.setVremOtprNach(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 848 + offset, rawVal, 0, 4);
            pmd.setRasstPredStan(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 852 + offset, rawVal, 0, 1);
            pmd.setPrSng(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[6];
            System.arraycopy(modelData, 853 + offset, rawVal, 0, 6);
            pmd.setPerevozchik(new BigInteger(rawVal));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 859 + offset, rawVal, 0, 2);
            pmd.setSlp1(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 861 + offset, rawVal, 0, 2);
            pmd.setSlp2(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 863 + offset, rawVal, 0, 1);
            pmd.setPrFormRasp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 864 + offset, rawVal, 0, 4);
            pmd.setUnsc(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 868 + offset, rawVal, 0, 4);
            pmd.setUnscT(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 872 + offset, rawVal, 0, 2);
            pmd.setNullDateIppv(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullDateIppv().intValue() == -1) {
                pmd.setDateIppv(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 874 + offset, rawVal, 0, 2);
            pmd.setNullDateSppv(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullDateSppv().intValue() == -1) {
                pmd.setDateSppv(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 876 + offset, rawVal, 0, 2);
            pmd.setNullDatePsPoezd(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullDatePsPoezd().intValue() == -1) {
                pmd.setDatePsPoezd(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 878 + offset, rawVal, 0, 2);
            pmd.setNullDateIzmIp(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullDateIzmIp().intValue() == -1) {
                pmd.setDateIzmIp(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 880 + offset, rawVal, 0, 2);
            pmd.setNullDateOpNpf(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullDateOpNpf().intValue() == -1) {
                pmd.setDateOpNpf(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 882 + offset, rawVal, 0, 2);
            pmd.setNullDvs(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullDvs().intValue() == -1) {
                pmd.setDvs(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 884 + offset, rawVal, 0, 2);
            pmd.setNullDvsT(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullDvsT().intValue() == -1) {
                pmd.setDvsT(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 886 + offset, rawVal, 0, 2);
            pmd.setNullDateOp1(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullDateOp1().intValue() == -1) {
                pmd.setDateOp1(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 888 + offset, rawVal, 0, 2);
            pmd.setNullDateOp2(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullDateOp2().intValue() == -1) {
                pmd.setDateOp2(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 890 + offset, rawVal, 0, 2);
            pmd.setNullDateOp3(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullDateOp3().intValue() == -1) {
                pmd.setDateOp3(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 892 + offset, rawVal, 0, 2);
            pmd.setNullDateOp4(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullDateOp4().intValue() == -1) {
                pmd.setDateOp4(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 894 + offset, rawVal, 0, 2);
            pmd.setNullDateOp5(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullDateOp5().intValue() == -1) {
                pmd.setDateOp5(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 896 + offset, rawVal, 0, 2);
            pmd.setNullDatePriemDor(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullDatePriemDor().intValue() == -1) {
                pmd.setDatePriemDor(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 898 + offset, rawVal, 0, 2);
            pmd.setNullDatePriemGos(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullDatePriemGos().intValue() == -1) {
                pmd.setDatePriemGos(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 900 + offset, rawVal, 0, 2);
            pmd.setNullDatePerevGar(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullDatePerevGar().intValue() == -1) {
                pmd.setDatePerevGar(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 902 + offset, rawVal, 0, 2);
            pmd.setNullDateSnyatGar(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullDateSnyatGar().intValue() == -1) {
                pmd.setDateSnyatGar(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 904 + offset, rawVal, 0, 2);
            pmd.setNullDateOpGdp(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullDateOpGdp().intValue() == -1) {
                pmd.setDateOpGdp(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 906 + offset, rawVal, 0, 2);
            pmd.setNullNomPoezdExp(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullNomPoezdExp().intValue() == -1) {
                pmd.setNomPoezdExp(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 908 + offset, rawVal, 0, 2);
            pmd.setNullVremOtprNach(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullVremOtprNach().intValue() == -1) {
                pmd.setVremOtprNach(null);
            }
        }

        if (pmd.getRowLength().intValue() == 1014) {
            pfmx.addPmdRow(pmd);
            return;
        }

        {
            byte[] rawVal = new byte[12];
            System.arraycopy(modelData, 910 + offset, rawVal, 0, 12);
            pmd.setNomPrikaz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 922 + offset, rawVal, 0, 19);
            pmd.setDateOpPrikaz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[8];
            System.arraycopy(modelData, 941 + offset, rawVal, 0, 8);
            pmd.setDolLicaPrikaz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[30];
            System.arraycopy(modelData, 949 + offset, rawVal, 0, 30);
            pmd.setFamlLicaPrikaz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[15];
            System.arraycopy(modelData, 979 + offset, rawVal, 0, 15);
            pmd.setIndexPoezdPrikaz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 994 + offset, rawVal, 0, 19);
            pmd.setDvsT1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[15];
            System.arraycopy(modelData, 1013 + offset, rawVal, 0, 15);
            pmd.setIndexPoezdBros(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1028 + offset, rawVal, 0, 19);
            pmd.setDateBrosPoezd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1047 + offset, rawVal, 0, 19);
            pmd.setDvsT2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1066 + offset, rawVal, 0, 19);
            pmd.setDateOpPodn(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1085 + offset, rawVal, 0, 4);
            pmd.setKdsPodn(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1089 + offset, rawVal, 0, 19);
            pmd.setDvsT3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 1108 + offset, rawVal, 0, 10);
            pmd.setIdElcp264(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1118 + offset, rawVal, 0, 2);
            pmd.setNomPoezd264(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1120 + offset, rawVal, 0, 2);
            pmd.setNomPoezd263(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[12];
            System.arraycopy(modelData, 1122 + offset, rawVal, 0, 12);
            pmd.setNomPrikaz263(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1134 + offset, rawVal, 0, 19);
            pmd.setDateOpPrikaz263(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[50];
            System.arraycopy(modelData, 1153 + offset, rawVal, 0, 50);
            pmd.setDolLicaPrikaz263(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[50];
            System.arraycopy(modelData, 1203 + offset, rawVal, 0, 50);
            pmd.setFamLicaPrikaz263(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1253 + offset, rawVal, 0, 19);
            pmd.setDvsT4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 1272 + offset, rawVal, 0, 10);
            pmd.setIdElcp263(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1282 + offset, rawVal, 0, 1);
            pmd.setPrTabPrikaz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1283 + offset, rawVal, 0, 2);
            pmd.setNullDateBrosPoezd(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullDateBrosPoezd().intValue() == -1) {
                pmd.setDateBrosPoezd(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1285 + offset, rawVal, 0, 2);
            pmd.setNullDvsT2(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullDvsT2().intValue() == -1) {
                pmd.setDvsT2(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1287 + offset, rawVal, 0, 2);
            pmd.setNullDateOpPodn(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullDateOpPodn().intValue() == -1) {
                pmd.setDateOpPodn(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1289 + offset, rawVal, 0, 2);
            pmd.setNullKdsPodn(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullKdsPodn().intValue() == -1) {
                pmd.setKdsPodn(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1291 + offset, rawVal, 0, 2);
            pmd.setNullDvsT3(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullDvsT3().intValue() == -1) {
                pmd.setDvsT3(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1293 + offset, rawVal, 0, 2);
            pmd.setNullIdElcp264(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullIdElcp264().intValue() == -1) {
                pmd.setIdElcp264(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1295 + offset, rawVal, 0, 2);
            pmd.setNullDateOpPrikaz263(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullDateOpPrikaz263().intValue() == -1) {
                pmd.setDateOpPrikaz263(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1297 + offset, rawVal, 0, 2);
            pmd.setNullDvsT4(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullDvsT4().intValue() == -1) {
                pmd.setDvsT4(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1299 + offset, rawVal, 0, 2);
            pmd.setNullIdElcp263(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (pmd.getNullIdElcp263().intValue() == -1) {
                pmd.setIdElcp263(null);
            }
        }

        {
            byte[] rawVal = new byte[100];
            System.arraycopy(modelData, 1301 + offset, rawVal, 0, 100);
            pmd.setDopForSluPmd(rawVal);
        }

        pfmx.addPmdRow(pmd);
    }

}
