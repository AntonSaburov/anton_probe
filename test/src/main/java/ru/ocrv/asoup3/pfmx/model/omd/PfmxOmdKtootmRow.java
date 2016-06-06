package ru.ocrv.asoup3.pfmx.model.omd;

public class PfmxOmdKtootmRow extends PfmxOmdKModelRow {

    private static final long serialVersionUID = 552912532442406268L;
    private String idOtprk;
    private Short nppOtm;
    private String dorRasch;
    private String prPechOtm;
    private String textOtm;
    private String kodSoob;

    public String getIdOtprk() {

        return idOtprk;
    }

    public void setIdOtprk(String idOtprk) {

        this.idOtprk = idOtprk;
    }

    public Short getNppOtm() {

        return nppOtm;
    }

    public void setNppOtm(Short nppOtm) {

        this.nppOtm = nppOtm;
    }

    public String getDorRasch() {

        return dorRasch;
    }

    public void setDorRasch(String dorRasch) {

        this.dorRasch = dorRasch;
    }

    public String getPrPechOtm() {

        return prPechOtm;
    }

    public void setPrPechOtm(String prPechOtm) {

        this.prPechOtm = prPechOtm;
    }

    public String getTextOtm() {

        return textOtm;
    }

    public void setTextOtm(String textOtm) {

        this.textOtm = textOtm;
    }

    public String getKodSoob() {

        return kodSoob;
    }

    public void setKodSoob(String kodSoob) {

        this.kodSoob = kodSoob;
    }
}
