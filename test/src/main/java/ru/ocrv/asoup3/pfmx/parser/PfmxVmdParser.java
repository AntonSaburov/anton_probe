package ru.ocrv.asoup3.pfmx.parser;

import static ru.ocrv.asoup3.pfmx.PfmxParser.CHARSET;

import java.nio.charset.Charset;

import ru.ocrv.asoup3.pfmx.model.PfmxMessage;
import ru.ocrv.asoup3.pfmx.model.PfmxVmdRow;
import ru.ocrv.asoup3.pfmx.util.ClassUtil;

public class PfmxVmdParser implements PfmxModelParser {

    @Override
    public void processRow(PfmxMessage pfmx, byte[] modelData, int localOffset, int modelLength) {

        PfmxVmdRow vmd = new PfmxVmdRow();
        vmd.setRowLength(modelLength);

        int offset = 4 + localOffset;

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 0 + offset, rawVal, 0, 2);
            vmd.setPrTfz1(new Short((ClassUtil.byteArrayToShort(rawVal))));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 2 + offset, rawVal, 0, 10);
            vmd.setPrTfz2(rawVal);
        }

        {
            byte[] rawVal = new byte[12];
            System.arraycopy(modelData, 12 + offset, rawVal, 0, 12);
            vmd.setNomVag(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 24 + offset, rawVal, 0, 2);
            vmd.setDorRasch(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 26 + offset, rawVal, 0, 2);
            vmd.setKopVmd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 28 + offset, rawVal, 0, 19);
            vmd.setDateOp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 47 + offset, rawVal, 0, 4);
            vmd.setStanOp(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 51 + offset, rawVal, 0, 4);
            vmd.setNomVagon(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 55 + offset, rawVal, 0, 2);
            vmd.setKodSob(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 57 + offset, rawVal, 0, 1);
            vmd.setPrNkz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 58 + offset, rawVal, 0, 1);
            vmd.setPrSysNum(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 59 + offset, rawVal, 0, 1);
            vmd.setPrDvNum(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 60 + offset, rawVal, 0, 1);
            vmd.setPrDvoin(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 61 + offset, rawVal, 0, 1);
            vmd.setPrSnUch(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 62 + offset, rawVal, 0, 1);
            vmd.setPrZapKur(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 63 + offset, rawVal, 0, 1);
            vmd.setPrNalTexp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 64 + offset, rawVal, 0, 2);
            vmd.setPrKach(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 66 + offset, rawVal, 0, 10);
            vmd.setDatePost(new String(rawVal, Charset.forName(CHARSET)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 76 + offset, rawVal, 0, 2);
            vmd.setDorPripis(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 78 + offset, rawVal, 0, 2);
            vmd.setVchdPripis(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 80 + offset, rawVal, 0, 4);
            vmd.setNomSoglKurs(ClassUtil.byteArrayToBigInt(rawVal));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 84 + offset, rawVal, 0, 1);
            vmd.setOchPlanRem(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 85 + offset, rawVal, 0, 1);
            vmd.setSledPlanRem(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 86 + offset, rawVal, 0, 10);
            vmd.setDatePlanRem(new String(rawVal, Charset.forName(CHARSET)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 96 + offset, rawVal, 0, 1);
            vmd.setSprRemProb(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 97 + offset, rawVal, 0, 1);
            vmd.setPorogProb(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 98 + offset, rawVal, 0, 1);
            vmd.setSprProdSs(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 99 + offset, rawVal, 0, 2);
            vmd.setNormProb(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 101 + offset, rawVal, 0, 2);
            vmd.setGrpVagCen(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 103 + offset, rawVal, 0, 10);
            vmd.setDatePoslKr(new String(rawVal, Charset.forName(CHARSET)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 113 + offset, rawVal, 0, 2);
            vmd.setVchdPoslKr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 115 + offset, rawVal, 0, 10);
            vmd.setDatePoslDr(new String(rawVal, Charset.forName(CHARSET)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 125 + offset, rawVal, 0, 2);
            vmd.setVchdPoslDr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 127 + offset, rawVal, 0, 10);
            vmd.setDatePoslTr(new String(rawVal, Charset.forName(CHARSET)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 137 + offset, rawVal, 0, 2);
            vmd.setVchdPoslTr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 139 + offset, rawVal, 0, 2);
            vmd.setVesTarCen(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 141 + offset, rawVal, 0, 2);
            vmd.setRodVagOsn(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 143 + offset, rawVal, 0, 2);
            vmd.setRodVagUch(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 145 + offset, rawVal, 0, 2);
            vmd.setUslTip4(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 147 + offset, rawVal, 0, 2);
            vmd.setUslTip2(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 149 + offset, rawVal, 0, 1);
            vmd.setOtmRol(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 150 + offset, rawVal, 0, 2);
            vmd.setDlVag(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 152 + offset, rawVal, 0, 4);
            vmd.setModVag(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 156 + offset, rawVal, 0, 1);
            vmd.setSprNeVzz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 157 + offset, rawVal, 0, 1);
            vmd.setSprSdanAr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 158 + offset, rawVal, 0, 1);
            vmd.setSprFpasp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 159 + offset, rawVal, 0, 1);
            vmd.setSprBpDvoin(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 160 + offset, rawVal, 0, 1);
            vmd.setSprInvestSkid(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 161 + offset, rawVal, 0, 1);
            vmd.setSprDatch(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 162 + offset, rawVal, 0, 1);
            vmd.setSprAst(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 163 + offset, rawVal, 0, 2);
            vmd.setKolOborTo(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 165 + offset, rawVal, 0, 2);
            vmd.setKolOsey(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 167 + offset, rawVal, 0, 1);
            vmd.setPrAr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 168 + offset, rawVal, 0, 1);
            vmd.setPrSubar(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 169 + offset, rawVal, 0, 1);
            vmd.setPrSob(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 170 + offset, rawVal, 0, 1);
            vmd.setPrMps(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 171 + offset, rawVal, 0, 1);
            vmd.setPrKomp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 172 + offset, rawVal, 0, 4);
            vmd.setOkpoSob(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 176 + offset, rawVal, 0, 4);
            vmd.setOkpoSubar(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 180 + offset, rawVal, 0, 4);
            vmd.setStykPriemGos(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 184 + offset, rawVal, 0, 2);
            vmd.setDorPriemGos(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 186 + offset, rawVal, 0, 19);
            vmd.setDatePriemGos(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 205 + offset, rawVal, 0, 4);
            vmd.setStykPriemDor(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 209 + offset, rawVal, 0, 19);
            vmd.setDatePriemDor(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 228 + offset, rawVal, 0, 2);
            vmd.setDorSdach(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 230 + offset, rawVal, 0, 2);
            vmd.setKopVklVmd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 232 + offset, rawVal, 0, 19);
            vmd.setDateVklVmd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 251 + offset, rawVal, 0, 4);
            vmd.setStanVklVmd(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 255 + offset, rawVal, 0, 1);
            vmd.setPrNalPerep(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 256 + offset, rawVal, 0, 1);
            vmd.setPrRegPerep(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 257 + offset, rawVal, 0, 1);
            vmd.setPrVklPerep(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 258 + offset, rawVal, 0, 1);
            vmd.setPrVklSver(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 259 + offset, rawVal, 0, 2);
            vmd.setRgnDis(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 261 + offset, rawVal, 0, 2);
            vmd.setDorDis(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 263 + offset, rawVal, 0, 2);
            vmd.setOcDis(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 265 + offset, rawVal, 0, 2);
            vmd.setNodDis(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 267 + offset, rawVal, 0, 4);
            vmd.setStanDis(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 271 + offset, rawVal, 0, 4);
            vmd.setNbe(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 275 + offset, rawVal, 0, 2);
            vmd.setNomPark(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 277 + offset, rawVal, 0, 2);
            vmd.setNomPut(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 279 + offset, rawVal, 0, 4);
            vmd.setProbGrj(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 283 + offset, rawVal, 0, 4);
            vmd.setProbPor(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 287 + offset, rawVal, 0, 4);
            vmd.setProbStan(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 291 + offset, rawVal, 0, 1);
            vmd.setKorGrjProb(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 292 + offset, rawVal, 0, 1);
            vmd.setKorPorProb(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 293 + offset, rawVal, 0, 1);
            vmd.setKorGrjGvc(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 294 + offset, rawVal, 0, 1);
            vmd.setKorPorGvc(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 295 + offset, rawVal, 0, 1);
            vmd.setPr4624(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 296 + offset, rawVal, 0, 1);
            vmd.setPr4631(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 297 + offset, rawVal, 0, 1);
            vmd.setPr4634(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 298 + offset, rawVal, 0, 1);
            vmd.setVidDisStan(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 299 + offset, rawVal, 0, 1);
            vmd.setVidDisDor(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 300 + offset, rawVal, 0, 1);
            vmd.setPrVagPoezd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 301 + offset, rawVal, 0, 1);
            vmd.setPrProm(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 302 + offset, rawVal, 0, 1);
            vmd.setPpvMest(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 303 + offset, rawVal, 0, 1);
            vmd.setPpvTranz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 304 + offset, rawVal, 0, 1);
            vmd.setPpvMestNod(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 305 + offset, rawVal, 0, 1);
            vmd.setPpvTrNod(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 306 + offset, rawVal, 0, 1);
            vmd.setKodVidaSled(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 307 + offset, rawVal, 0, 1);
            vmd.setPpvPor(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 308 + offset, rawVal, 0, 1);
            vmd.setPpvGruj(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 309 + offset, rawVal, 0, 1);
            vmd.setPpvNrp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 310 + offset, rawVal, 0, 1);
            vmd.setPpvRp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 311 + offset, rawVal, 0, 1);
            vmd.setPpvGruzOs(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 312 + offset, rawVal, 0, 1);
            vmd.setPpvRd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 313 + offset, rawVal, 0, 1);
            vmd.setVnrpRezmps(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 314 + offset, rawVal, 0, 1);
            vmd.setVnrpNeisp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 315 + offset, rawVal, 0, 1);
            vmd.setVnrpSpecTex(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 316 + offset, rawVal, 0, 1);
            vmd.setVnrpOstal(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 317 + offset, rawVal, 0, 1);
            vmd.setVnrpZapmps(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 318 + offset, rawVal, 0, 1);
            vmd.setVnrpPeres(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 319 + offset, rawVal, 0, 1);
            vmd.setVnrpPodIskl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 320 + offset, rawVal, 0, 1);
            vmd.setVnrpIskl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[3];
            System.arraycopy(modelData, 321 + offset, rawVal, 0, 3);
            vmd.setKodSostUch(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 324 + offset, rawVal, 0, 1);
            vmd.setPpvKon(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 325 + offset, rawVal, 0, 1);
            vmd.setPpvMo(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 326 + offset, rawVal, 0, 1);
            vmd.setPpvXarPor(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 327 + offset, rawVal, 0, 1);
            vmd.setPpvKkb(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 328 + offset, rawVal, 0, 1);
            vmd.setPpvSvrf(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 329 + offset, rawVal, 0, 1);
            vmd.setTipEdv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 330 + offset, rawVal, 0, 1);
            vmd.setSlujTipEdv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 331 + offset, rawVal, 0, 1);
            vmd.setKodGrupVag(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 332 + offset, rawVal, 0, 4);
            vmd.setNomGrupVagj(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 336 + offset, rawVal, 0, 2);
            vmd.setKopPogr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 338 + offset, rawVal, 0, 2);
            vmd.setKopOkpv(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 340 + offset, rawVal, 0, 19);
            vmd.setDatePogr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 359 + offset, rawVal, 0, 1);
            vmd.setPrOper(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 360 + offset, rawVal, 0, 4);
            vmd.setStanPogrj(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 364 + offset, rawVal, 0, 2);
            vmd.setRgnPogr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 366 + offset, rawVal, 0, 2);
            vmd.setDorPogr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 368 + offset, rawVal, 0, 2);
            vmd.setOcPogr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 370 + offset, rawVal, 0, 2);
            vmd.setNodPogr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 372 + offset, rawVal, 0, 4);
            vmd.setNbePogr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 376 + offset, rawVal, 0, 2);
            vmd.setGruzpol(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 378 + offset, rawVal, 0, 4);
            vmd.setGruzpolOkpoj(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 382 + offset, rawVal, 0, 2);
            vmd.setGruzotpr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 384 + offset, rawVal, 0, 4);
            vmd.setGruzotprOkpoj(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[12];
            System.arraycopy(modelData, 388 + offset, rawVal, 0, 12);
            vmd.setIdOtprk(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 400 + offset, rawVal, 0, 1);
            vmd.setVidOtprk(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 401 + offset, rawVal, 0, 10);
            vmd.setDateDostav(new String(rawVal, Charset.forName(CHARSET)));
        }

        {
            byte[] rawVal = new byte[13];
            System.arraycopy(modelData, 411 + offset, rawVal, 0, 13);
            vmd.setTarif(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 424 + offset, rawVal, 0, 4);
            vmd.setKodGrzTgnlj(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 428 + offset, rawVal, 0, 4);
            vmd.setKodGrzUchj(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[7];
            System.arraycopy(modelData, 432 + offset, rawVal, 0, 7);
            vmd.setKodGrzGng(ClassUtil.byteArrayToBigInt(rawVal));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 439 + offset, rawVal, 0, 2);
            vmd.setRodGrzOsn(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 441 + offset, rawVal, 0, 2);
            vmd.setRodGrzDet(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 443 + offset, rawVal, 0, 1);
            vmd.setPrExportGrz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 444 + offset, rawVal, 0, 4);
            vmd.setVesGrzj(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 448 + offset, rawVal, 0, 4);
            vmd.setVesGrzPerevj(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 452 + offset, rawVal, 0, 4);
            vmd.setVesGrzPogrj(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 456 + offset, rawVal, 0, 2);
            vmd.setKolGrjKtk(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 458 + offset, rawVal, 0, 2);
            vmd.setKolGrjStk(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 460 + offset, rawVal, 0, 2);
            vmd.setKolPorKtk(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 462 + offset, rawVal, 0, 2);
            vmd.setKolPorStk(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 464 + offset, rawVal, 0, 2);
            vmd.setKolMo(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 466 + offset, rawVal, 0, 2);
            vmd.setKodUpak(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 468 + offset, rawVal, 0, 4);
            vmd.setKolMest(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 472 + offset, rawVal, 0, 4);
            vmd.setStanNazn(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 476 + offset, rawVal, 0, 4);
            vmd.setStanSdach(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 480 + offset, rawVal, 0, 2);
            vmd.setNodNazn(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 482 + offset, rawVal, 0, 2);
            vmd.setDorNazn(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 484 + offset, rawVal, 0, 2);
            vmd.setStrNazn(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 486 + offset, rawVal, 0, 2);
            vmd.setStrOtpr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 488 + offset, rawVal, 0, 4);
            vmd.setStanVyxPogran(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 492 + offset, rawVal, 0, 4);
            vmd.setStanPerer(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 496 + offset, rawVal, 0, 4);
            vmd.setStanPereg(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 500 + offset, rawVal, 0, 1);
            vmd.setPrPogrOtl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 501 + offset, rawVal, 0, 1);
            vmd.setKodNarushPogr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 502 + offset, rawVal, 0, 1);
            vmd.setPrGodPogr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[20];
            System.arraycopy(modelData, 503 + offset, rawVal, 0, 20);
            vmd.setNaimEksp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[6];
            System.arraycopy(modelData, 523 + offset, rawVal, 0, 6);
            vmd.setKodEksp(ClassUtil.byteArrayToBigInt(rawVal));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 529 + offset, rawVal, 0, 2);
            vmd.setAdmEksp(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 531 + offset, rawVal, 0, 1);
            vmd.setVladSrVyg(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 532 + offset, rawVal, 0, 1);
            vmd.setOsOtm1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 533 + offset, rawVal, 0, 1);
            vmd.setOsOtm2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 534 + offset, rawVal, 0, 1);
            vmd.setOsOtm3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[6];
            System.arraycopy(modelData, 535 + offset, rawVal, 0, 6);
            vmd.setPrim1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[6];
            System.arraycopy(modelData, 541 + offset, rawVal, 0, 6);
            vmd.setPrim2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 547 + offset, rawVal, 0, 2);
            vmd.setKolPoleyTgnl(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 549 + offset, rawVal, 0, 4);
            vmd.setStanProm(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 553 + offset, rawVal, 0, 2);
            vmd.setGrpVagNak(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 555 + offset, rawVal, 0, 2);
            vmd.setNormZagrCen(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 557 + offset, rawVal, 0, 4);
            vmd.setObKuzNak(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 561 + offset, rawVal, 0, 4);
            vmd.setDlRamNak(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 565 + offset, rawVal, 0, 2);
            vmd.setVesTarProv(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 567 + offset, rawVal, 0, 2);
            vmd.setVysNalNak(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 569 + offset, rawVal, 0, 2);
            vmd.setPlPolaNak(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 571 + offset, rawVal, 0, 2);
            vmd.setKolZpu(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 573 + offset, rawVal, 0, 2);
            vmd.setTipZpu1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[8];
            System.arraycopy(modelData, 575 + offset, rawVal, 0, 8);
            vmd.setKzZpu1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 583 + offset, rawVal, 0, 1);
            vmd.setPrZpu1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 584 + offset, rawVal, 0, 2);
            vmd.setKodAdm(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 586 + offset, rawVal, 0, 4);
            vmd.setStanNalZpu(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 590 + offset, rawVal, 0, 19);
            vmd.setDateZpu(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 609 + offset, rawVal, 0, 2);
            vmd.setKolPrisp(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 611 + offset, rawVal, 0, 2);
            vmd.setKodPrisp1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 613 + offset, rawVal, 0, 2);
            vmd.setKolPrisp1(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[15];
            System.arraycopy(modelData, 615 + offset, rawVal, 0, 15);
            vmd.setIndexPoezd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 630 + offset, rawVal, 0, 2);
            vmd.setNomPoezd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 632 + offset, rawVal, 0, 2);
            vmd.setKopPmd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 634 + offset, rawVal, 0, 1);
            vmd.setPrStykPosl(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 635 + offset, rawVal, 0, 2);
            vmd.setDornodPosl(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 637 + offset, rawVal, 0, 2);
            vmd.setKopPrib202(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 639 + offset, rawVal, 0, 1);
            vmd.setPrStykPrib202(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 640 + offset, rawVal, 0, 2);
            vmd.setDornodPrib202(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 642 + offset, rawVal, 0, 4);
            vmd.setNaprPosl(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 646 + offset, rawVal, 0, 4);
            vmd.setNaprPrib202(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 650 + offset, rawVal, 0, 2);
            vmd.setKodNod(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 652 + offset, rawVal, 0, 2);
            vmd.setNppVag(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 654 + offset, rawVal, 0, 4);
            vmd.setStanVklPoezd(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 658 + offset, rawVal, 0, 2);
            vmd.setKopVklPoezd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 660 + offset, rawVal, 0, 19);
            vmd.setDateVklPoezd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 679 + offset, rawVal, 0, 2);
            vmd.setPrichOtc(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 681 + offset, rawVal, 0, 2);
            vmd.setRodPoezd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 683 + offset, rawVal, 0, 4);
            vmd.setStanNaznPf(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 687 + offset, rawVal, 0, 4);
            vmd.setStanNaznGrup(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 691 + offset, rawVal, 0, 4);
            vmd.setStanKonSl(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 695 + offset, rawVal, 0, 2);
            vmd.setTormNaj(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 697 + offset, rawVal, 0, 1);
            vmd.setGvMarshOv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 698 + offset, rawVal, 0, 1);
            vmd.setPrinMarshOv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 699 + offset, rawVal, 0, 1);
            vmd.setPrNarushPf(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 700 + offset, rawVal, 0, 1);
            vmd.setVagMarsh(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 701 + offset, rawVal, 0, 1);
            vmd.setVagFgp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 702 + offset, rawVal, 0, 1);
            vmd.setSledNeNazn(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 703 + offset, rawVal, 0, 1);
            vmd.setPrSkoropGrz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 704 + offset, rawVal, 0, 1);
            vmd.setPrSpecGrz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 705 + offset, rawVal, 0, 1);
            vmd.setPrOpasGrz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 706 + offset, rawVal, 0, 2);
            vmd.setNomParkS(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 708 + offset, rawVal, 0, 2);
            vmd.setNomPutS(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 710 + offset, rawVal, 0, 4);
            vmd.setStanBrak(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 714 + offset, rawVal, 0, 19);
            vmd.setDateBrak(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[7];
            System.arraycopy(modelData, 733 + offset, rawVal, 0, 7);
            vmd.setKodBrak(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[5];
            System.arraycopy(modelData, 740 + offset, rawVal, 0, 5);
            vmd.setNomAktOb(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 745 + offset, rawVal, 0, 4);
            vmd.setStanProverGrz(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 749 + offset, rawVal, 0, 10);
            vmd.setDateProver(new String(rawVal, Charset.forName(CHARSET)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 759 + offset, rawVal, 0, 2);
            vmd.setRezultProver(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[5];
            System.arraycopy(modelData, 761 + offset, rawVal, 0, 5);
            vmd.setNomAktKom(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 766 + offset, rawVal, 0, 4);
            vmd.setStanPerNrp(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 770 + offset, rawVal, 0, 2);
            vmd.setDorPerNrp(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 772 + offset, rawVal, 0, 2);
            vmd.setKopPerNrp(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 774 + offset, rawVal, 0, 19);
            vmd.setDatePerNrp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[6];
            System.arraycopy(modelData, 793 + offset, rawVal, 0, 6);
            vmd.setNomUkazNrp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 799 + offset, rawVal, 0, 19);
            vmd.setDateUkazNrp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 818 + offset, rawVal, 0, 1);
            vmd.setVidIsp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 819 + offset, rawVal, 0, 10);
            vmd.setDateNrp(new String(rawVal, Charset.forName(CHARSET)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 829 + offset, rawVal, 0, 1);
            vmd.setPvvStn(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 830 + offset, rawVal, 0, 4);
            vmd.setStanNeispr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 834 + offset, rawVal, 0, 2);
            vmd.setDorNeispr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 836 + offset, rawVal, 0, 2);
            vmd.setKopNeispr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 838 + offset, rawVal, 0, 19);
            vmd.setDateNeispr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 857 + offset, rawVal, 0, 2);
            vmd.setKodRemont(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 859 + offset, rawVal, 0, 2);
            vmd.setKodNeispr1(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 861 + offset, rawVal, 0, 2);
            vmd.setKodNeispr2(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 863 + offset, rawVal, 0, 2);
            vmd.setKodNeispr3(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 865 + offset, rawVal, 0, 19);
            vmd.setDateNachRem(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 884 + offset, rawVal, 0, 2);
            vmd.setKodKleimVchd(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 886 + offset, rawVal, 0, 2);
            vmd.setPrOb(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 888 + offset, rawVal, 0, 2);
            vmd.setNomOb(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 890 + offset, rawVal, 0, 4);
            vmd.setStanNaznPeres(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 894 + offset, rawVal, 0, 2);
            vmd.setNomVu(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 896 + offset, rawVal, 0, 4);
            vmd.setProbGrjRem(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 900 + offset, rawVal, 0, 4);
            vmd.setProbPorRem(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 904 + offset, rawVal, 0, 1);
            vmd.setPrAktTsost(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 905 + offset, rawVal, 0, 19);
            vmd.setDateIzmNom(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[12];
            System.arraycopy(modelData, 924 + offset, rawVal, 0, 12);
            vmd.setNomVagSt(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 936 + offset, rawVal, 0, 4);
            vmd.setNomVagonSt(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 940 + offset, rawVal, 0, 2);
            vmd.setPrKachSt(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 942 + offset, rawVal, 0, 1);
            vmd.setPrNkzSt(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 943 + offset, rawVal, 0, 1);
            vmd.setPrSysNumSt(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 944 + offset, rawVal, 0, 1);
            vmd.setPrDvNumSt(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 945 + offset, rawVal, 0, 1);
            vmd.setPrDvoinSt(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 946 + offset, rawVal, 0, 1);
            vmd.setPrSnUchSt(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 947 + offset, rawVal, 0, 1);
            vmd.setPrZapKurSt(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 948 + offset, rawVal, 0, 1);
            vmd.setPrNalTexpSt(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 949 + offset, rawVal, 0, 1);
            vmd.setDopriem(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 950 + offset, rawVal, 0, 1);
            vmd.setNepriem(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 951 + offset, rawVal, 0, 1);
            vmd.setSoglasov(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 952 + offset, rawVal, 0, 1);
            vmd.setVozvrat(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 953 + offset, rawVal, 0, 1);
            vmd.setPrZadSpv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 954 + offset, rawVal, 0, 4);
            vmd.setNomPpv(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 958 + offset, rawVal, 0, 1);
            vmd.setTipPpv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 959 + offset, rawVal, 0, 4);
            vmd.setStanPpv(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 963 + offset, rawVal, 0, 19);
            vmd.setDatePpv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 982 + offset, rawVal, 0, 2);
            vmd.setKopSpv(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 984 + offset, rawVal, 0, 4);
            vmd.setStykPpv(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 988 + offset, rawVal, 0, 1);
            vmd.setPriemNepr1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 989 + offset, rawVal, 0, 2);
            vmd.setKodOrg1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[5];
            System.arraycopy(modelData, 991 + offset, rawVal, 0, 5);
            vmd.setNomAkt1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 996 + offset, rawVal, 0, 2);
            vmd.setNeispr1(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 998 + offset, rawVal, 0, 1);
            vmd.setPriemNepr2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 999 + offset, rawVal, 0, 2);
            vmd.setKodOrg2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[5];
            System.arraycopy(modelData, 1001 + offset, rawVal, 0, 5);
            vmd.setNomAkt2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1006 + offset, rawVal, 0, 2);
            vmd.setNeispr2(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1008 + offset, rawVal, 0, 1);
            vmd.setPriemNepr3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1009 + offset, rawVal, 0, 2);
            vmd.setKodOrg3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[5];
            System.arraycopy(modelData, 1011 + offset, rawVal, 0, 5);
            vmd.setNomAkt3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1016 + offset, rawVal, 0, 2);
            vmd.setNeispr3(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1018 + offset, rawVal, 0, 1);
            vmd.setPriemNepr4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1019 + offset, rawVal, 0, 2);
            vmd.setKodOrg4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[5];
            System.arraycopy(modelData, 1021 + offset, rawVal, 0, 5);
            vmd.setNomAkt4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1026 + offset, rawVal, 0, 2);
            vmd.setNeispr4(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1028 + offset, rawVal, 0, 19);
            vmd.setDateOpPdg(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1047 + offset, rawVal, 0, 2);
            vmd.setKodSoobPdg(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1049 + offset, rawVal, 0, 4);
            vmd.setStanPdg(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1053 + offset, rawVal, 0, 4);
            vmd.setKodGrzVygr(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1057 + offset, rawVal, 0, 2);
            vmd.setKolOb(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1059 + offset, rawVal, 0, 2);
            vmd.setIntegPokGodn(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1061 + offset, rawVal, 0, 1);
            vmd.setPrOstGrz(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1062 + offset, rawVal, 0, 2);
            vmd.setKodN1Pdg(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1064 + offset, rawVal, 0, 2);
            vmd.setKodN2Pdg(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1066 + offset, rawVal, 0, 2);
            vmd.setKodN3Pdg(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1068 + offset, rawVal, 0, 2);
            vmd.setKodTrebPdg(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1070 + offset, rawVal, 0, 19);
            vmd.setDateNachObr(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1089 + offset, rawVal, 0, 4);
            vmd.setRekStanNazn(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1093 + offset, rawVal, 0, 4);
            vmd.setNomAktGodn(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1097 + offset, rawVal, 0, 2);
            vmd.setKopPps(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1099 + offset, rawVal, 0, 19);
            vmd.setDateVypZv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 1118 + offset, rawVal, 0, 10);
            vmd.setNomZv(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1128 + offset, rawVal, 0, 4);
            vmd.setStanNaznZv(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1132 + offset, rawVal, 0, 1);
            vmd.setPrPrikrep(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1133 + offset, rawVal, 0, 2);
            vmd.setKopPod(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1135 + offset, rawVal, 0, 19);
            vmd.setDatePod(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1154 + offset, rawVal, 0, 4);
            vmd.setStanPod(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1158 + offset, rawVal, 0, 2);
            vmd.setVidOpPod(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1160 + offset, rawVal, 0, 2);
            vmd.setKodPrimPod(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1162 + offset, rawVal, 0, 4);
            vmd.setNomPamPod(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1166 + offset, rawVal, 0, 2);
            vmd.setNomParkPod(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1168 + offset, rawVal, 0, 2);
            vmd.setNomPutPod(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1170 + offset, rawVal, 0, 1);
            vmd.setPrSobPod(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1171 + offset, rawVal, 0, 1);
            vmd.setPrOp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1172 + offset, rawVal, 0, 4);
            vmd.setKds(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1176 + offset, rawVal, 0, 19);
            vmd.setDvs(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 1195 + offset, rawVal, 0, 9);
            vmd.setKpp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1204 + offset, rawVal, 0, 4);
            vmd.setKdsT(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1208 + offset, rawVal, 0, 19);
            vmd.setDvsT(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[9];
            System.arraycopy(modelData, 1227 + offset, rawVal, 0, 9);
            vmd.setKppT(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1236 + offset, rawVal, 0, 1);
            vmd.setPrCh1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1237 + offset, rawVal, 0, 1);
            vmd.setPrCh2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1238 + offset, rawVal, 0, 1);
            vmd.setPrCh3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1239 + offset, rawVal, 0, 1);
            vmd.setPrCh4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1240 + offset, rawVal, 0, 1);
            vmd.setPrCh5(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1241 + offset, rawVal, 0, 2);
            vmd.setKop1(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1243 + offset, rawVal, 0, 19);
            vmd.setDateOp1(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1262 + offset, rawVal, 0, 2);
            vmd.setKop2(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1264 + offset, rawVal, 0, 19);
            vmd.setDateOp2(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1283 + offset, rawVal, 0, 2);
            vmd.setKop3(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1285 + offset, rawVal, 0, 19);
            vmd.setDateOp3(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1304 + offset, rawVal, 0, 2);
            vmd.setKop4(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1306 + offset, rawVal, 0, 19);
            vmd.setDateOp4(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1325 + offset, rawVal, 0, 2);
            vmd.setKop5(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1327 + offset, rawVal, 0, 19);
            vmd.setDateOp5(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1346 + offset, rawVal, 0, 2);
            vmd.setNomVagShem(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1348 + offset, rawVal, 0, 1);
            vmd.setPrGtd(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1349 + offset, rawVal, 0, 4);
            vmd.setStanNaznNak(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1353 + offset, rawVal, 0, 4);
            vmd.setStanOtc(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1357 + offset, rawVal, 0, 4);
            vmd.setUns(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1361 + offset, rawVal, 0, 4);
            vmd.setUnsT(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1365 + offset, rawVal, 0, 2);
            vmd.setNullDatePost(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDatePost().intValue() == -1) {
                vmd.setDatePost(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1367 + offset, rawVal, 0, 2);
            vmd.setNullDatePlanRem(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDatePlanRem().intValue() == -1) {
                vmd.setDatePlanRem(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1369 + offset, rawVal, 0, 2);
            vmd.setNullDatePoslKr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDatePoslKr().intValue() == -1) {
                vmd.setDatePoslKr(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1371 + offset, rawVal, 0, 2);
            vmd.setNullDatePoslDr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDatePoslDr().intValue() == -1) {
                vmd.setDatePoslDr(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1373 + offset, rawVal, 0, 2);
            vmd.setNullDatePoslTr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDatePoslTr().intValue() == -1) {
                vmd.setDatePoslTr(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1375 + offset, rawVal, 0, 2);
            vmd.setNullDatePriemGos(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDatePriemGos().intValue() == -1) {
                vmd.setDatePriemGos(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1377 + offset, rawVal, 0, 2);
            vmd.setNullDatePriemDor(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDatePriemDor().intValue() == -1) {
                vmd.setDatePriemDor(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1379 + offset, rawVal, 0, 2);
            vmd.setNullDateVklVmd(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDateVklVmd().intValue() == -1) {
                vmd.setDateVklVmd(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1381 + offset, rawVal, 0, 2);
            vmd.setNullDatePogr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDatePogr().intValue() == -1) {
                vmd.setDatePogr(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1383 + offset, rawVal, 0, 2);
            vmd.setNullDateDostav(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDateDostav().intValue() == -1) {
                vmd.setDateDostav(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1385 + offset, rawVal, 0, 2);
            vmd.setNullDateZpu(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDateZpu().intValue() == -1) {
                vmd.setDateZpu(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1387 + offset, rawVal, 0, 2);
            vmd.setNullDateVklPoezd(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDateVklPoezd().intValue() == -1) {
                vmd.setDateVklPoezd(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1389 + offset, rawVal, 0, 2);
            vmd.setNullDateBrak(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDateBrak().intValue() == -1) {
                vmd.setDateBrak(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1391 + offset, rawVal, 0, 2);
            vmd.setNullDateProver(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDateProver().intValue() == -1) {
                vmd.setDateProver(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1393 + offset, rawVal, 0, 2);
            vmd.setNullDatePerNrp(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDatePerNrp().intValue() == -1) {
                vmd.setDatePerNrp(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1395 + offset, rawVal, 0, 2);
            vmd.setNullDateUkazNrp(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDateUkazNrp().intValue() == -1) {
                vmd.setDateUkazNrp(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1397 + offset, rawVal, 0, 2);
            vmd.setNullDateNrp(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDateNrp().intValue() == -1) {
                vmd.setDateNrp(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1399 + offset, rawVal, 0, 2);
            vmd.setNullDateNeispr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDateNeispr().intValue() == -1) {
                vmd.setDateNeispr(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1401 + offset, rawVal, 0, 2);
            vmd.setNullDateNachRem(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDateNachRem().intValue() == -1) {
                vmd.setDateNachRem(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1403 + offset, rawVal, 0, 2);
            vmd.setNullDateIzmNom(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDateIzmNom().intValue() == -1) {
                vmd.setDateIzmNom(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1405 + offset, rawVal, 0, 2);
            vmd.setNullDatePpv(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDatePpv().intValue() == -1) {
                vmd.setDatePpv(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1407 + offset, rawVal, 0, 2);
            vmd.setNullDateOpPdg(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDateOpPdg().intValue() == -1) {
                vmd.setDateOpPdg(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1409 + offset, rawVal, 0, 2);
            vmd.setNullDateNachObr(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDateNachObr().intValue() == -1) {
                vmd.setDateNachObr(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1411 + offset, rawVal, 0, 2);
            vmd.setNullDateVypZv(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDateVypZv().intValue() == -1) {
                vmd.setDateVypZv(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1413 + offset, rawVal, 0, 2);
            vmd.setNullDatePod(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDatePod().intValue() == -1) {
                vmd.setDatePod(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1415 + offset, rawVal, 0, 2);
            vmd.setNullDateOp1(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDateOp1().intValue() == -1) {
                vmd.setDateOp1(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1417 + offset, rawVal, 0, 2);
            vmd.setNullDateOp2(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDateOp2().intValue() == -1) {
                vmd.setDateOp2(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1419 + offset, rawVal, 0, 2);
            vmd.setNullDateOp3(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDateOp3().intValue() == -1) {
                vmd.setDateOp3(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1421 + offset, rawVal, 0, 2);
            vmd.setNullDateOp4(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDateOp4().intValue() == -1) {
                vmd.setDateOp4(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1423 + offset, rawVal, 0, 2);
            vmd.setNullDateOp5(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDateOp5().intValue() == -1) {
                vmd.setDateOp5(null);
            }
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1425 + offset, rawVal, 0, 2);
            vmd.setVidIspNew(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1427 + offset, rawVal, 0, 4);
            vmd.setRez1(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1431 + offset, rawVal, 0, 4);
            vmd.setRez2(new Integer((ClassUtil.byteArrayToInt(rawVal))));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1435 + offset, rawVal, 0, 1);
            vmd.setPrPerS(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1436 + offset, rawVal, 0, 2);
            vmd.setKodNeispr4(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1438 + offset, rawVal, 0, 2);
            vmd.setNomSoobPp(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1440 + offset, rawVal, 0, 1);
            vmd.setPrPassVag(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1441 + offset, rawVal, 0, 2);
            vmd.setKopVmdOtm220(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1443 + offset, rawVal, 0, 19);
            vmd.setDateOpOtm220(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 1462 + offset, rawVal, 0, 10);
            vmd.setIdElcp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[4];
            System.arraycopy(modelData, 1472 + offset, rawVal, 0, 4);
            vmd.setKodSoobElcp(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[19];
            System.arraycopy(modelData, 1476 + offset, rawVal, 0, 19);
            vmd.setDateOpDop(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1495 + offset, rawVal, 0, 2);
            vmd.setNullDateOpDop(new Short(ClassUtil.byteArrayToShort(rawVal)));
            if (vmd.getNullDateOpDop().intValue() == -1) {
                vmd.setDateOpDop(null);
            }
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1497 + offset, rawVal, 0, 1);
            vmd.setPrKorKar(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1498 + offset, rawVal, 0, 1);
            vmd.setPrVag(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1499 + offset, rawVal, 0, 2);
            vmd.setPrGr(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1501 + offset, rawVal, 0, 2);
            vmd.setKodMod5(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1503 + offset, rawVal, 0, 2);
            vmd.setKodMod6(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1505 + offset, rawVal, 0, 2);
            vmd.setKodMod7(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1507 + offset, rawVal, 0, 2);
            vmd.setKodMod8(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1509 + offset, rawVal, 0, 2);
            vmd.setKodMod9(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[2];
            System.arraycopy(modelData, 1511 + offset, rawVal, 0, 2);
            vmd.setKodMod10(new Short(ClassUtil.byteArrayToShort(rawVal)));
        }

        {
            byte[] rawVal = new byte[12];
            System.arraycopy(modelData, 1513 + offset, rawVal, 0, 12);
            vmd.setRezVmd(rawVal);
        }

        {
            byte[] rawVal = new byte[1];
            System.arraycopy(modelData, 1525 + offset, rawVal, 0, 1);
            vmd.setPrSvvTms(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[10];
            System.arraycopy(modelData, 1526 + offset, rawVal, 0, 10);
            String value = (new String(rawVal, Charset.forName(CHARSET))).trim();
            value = value.isEmpty() ? null : value;
            vmd.setSrokVv(value);
        }

        {
            byte[] rawVal = new byte[25];
            System.arraycopy(modelData, 1536 + offset, rawVal, 0, 25);
            vmd.setNomTdts(new String(rawVal, Charset.forName(CHARSET)).trim());
        }

        {
            byte[] rawVal = new byte[164];
            System.arraycopy(modelData, 1561 + offset, rawVal, 0, 164);
            vmd.setDopForSluVmd1(rawVal);
        }

        pfmx.addVmdRow(vmd);

    }
}
