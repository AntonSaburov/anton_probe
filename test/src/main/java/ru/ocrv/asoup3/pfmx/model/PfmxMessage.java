package ru.ocrv.asoup3.pfmx.model;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import ru.ocrv.asoup3.pfmx.util.ClassUtil;

public class PfmxMessage implements Serializable
{

    private Integer packageSize;
    private String packageType;
    private String ksmcbpf;
    private String kskmcbpf;
    private String dnosmcbp;
    private String vnosmcbp;
    private String idstdpf;
    private String adrabpf;
    private Integer uns;
    private String ikoddor;
    private Integer lbefcomp;
    private String startTimestamp;
    private Short additionalLength;
    private String additionalInfo;

    private List<PfmxVmdRow> vmdList;
    private List<PfmxLmdRow> lmdList;
    private List<PfmxPmdRow> pmdList;
    private List<PfmxVmdDvsRow> vmdDvsList;
    private List<PfmxSpdVagRow> spdVagList;
    private List<PfmxSpdPricRow> spdPricList;
    private List<PfmxKmdRow> kmdList;
    private List<PfmxOmdRow> omdList;
    private List<PfmxBmdRow> bmdList;

    public Integer getPackageSize() {

        return packageSize;
    }

    public void setPackageSize(Integer packageSize) {

        this.packageSize = packageSize;
    }

    public String getPackageType() {

        return packageType;
    }

    public void setPackageType(String packageType) {

        this.packageType = packageType;
    }

    public String getKsmcbpf() {

        return ksmcbpf;
    }

    public void setKsmcbpf(String ksmcbpf) {

        this.ksmcbpf = ksmcbpf;
    }

    public String getKskmcbpf() {

        return kskmcbpf;
    }

    public void setKskmcbpf(String kskmcbpf) {

        this.kskmcbpf = kskmcbpf;
    }

    public String getDnosmcbp() {

        return dnosmcbp;
    }

    public void setDnosmcbp(String dnosmcbp) {

        this.dnosmcbp = dnosmcbp;
    }

    public String getVnosmcbp() {

        return vnosmcbp;
    }

    public void setVnosmcbp(String vnosmcbp) {

        this.vnosmcbp = vnosmcbp;
    }

    public String getIdstdpf() {

        return idstdpf;
    }

    public void setIdstdpf(String idstdpf) {

        this.idstdpf = idstdpf;
    }

    public String getAdrabpf() {

        return adrabpf;
    }

    public void setAdrabpf(String adrabpf) {

        this.adrabpf = adrabpf;
    }

    public Integer getUns() {

        return uns;
    }

    public void setUns(Integer uns) {

        this.uns = uns;
    }

    public String getIkoddor() {

        return ikoddor;
    }

    public void setIkoddor(String ikoddor) {

        this.ikoddor = ikoddor;
    }

    public Integer getLbefcomp() {

        return lbefcomp;
    }

    public void setLbefcomp(Integer lbefcomp) {

        this.lbefcomp = lbefcomp;
    }

    public String getStartTimestamp() {

        return startTimestamp;
    }

    public void setStartTimestamp(String startTimestamp) {

        this.startTimestamp = startTimestamp;
    }

    public Short getAdditionalLength() {

        return additionalLength;
    }

    public void setAdditionalLength(Short additionalLength) {

        this.additionalLength = additionalLength;
    }

    public String getAdditionalInfo() {

        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {

        this.additionalInfo = additionalInfo;
    }

    public List<PfmxVmdRow> getVmdList() {

        return vmdList;
    }

    public synchronized void addVmdRow(PfmxVmdRow vmd) {

        if (vmdList == null) {
            vmdList = new LinkedList<PfmxVmdRow>();
        }
        vmdList.add(vmd);
    }

    public List<PfmxVmdDvsRow> getVmdDvsList() {

        return vmdDvsList;
    }

    public synchronized void addVmdDvsRow(PfmxVmdDvsRow vmdDvs) {

        if (vmdDvsList == null) {
            vmdDvsList = new LinkedList<PfmxVmdDvsRow>();
        }
        vmdDvsList.add(vmdDvs);
    }

    public List<PfmxLmdRow> getLmdList() {

        return lmdList;
    }

    public synchronized void addLmdRow(PfmxLmdRow lmd) {

        if (lmdList == null) {
            lmdList = new LinkedList<PfmxLmdRow>();
        }
        lmdList.add(lmd);
    }

    public List<PfmxPmdRow> getPmdList() {

        return pmdList;
    }

    public synchronized void addPmdRow(PfmxPmdRow pmd) {

        if (pmdList == null) {
            pmdList = new LinkedList<PfmxPmdRow>();
        }
        pmdList.add(pmd);
    }


    public List<PfmxSpdVagRow> getSpdVagList() {

        return spdVagList;
    }

    public synchronized void addSpdVagRow(PfmxSpdVagRow spdVag) {

        if (spdVagList == null) {
            spdVagList = new LinkedList<PfmxSpdVagRow>();
        }
        spdVagList.add(spdVag);
    }

    public List<PfmxSpdPricRow> getSpdPricList() {

        return spdPricList;
    }

    public synchronized void addSpdPricRow(PfmxSpdPricRow spdPricRow) {

        if (spdPricList == null) {
            spdPricList = new LinkedList<PfmxSpdPricRow>();
        }
        spdPricList.add(spdPricRow);
    }

    public List<PfmxKmdRow> getKmdList() {

        return kmdList;
    }

    public synchronized void addKmdRow(PfmxKmdRow kmd) {

        if (kmdList == null) {
            kmdList = new LinkedList<PfmxKmdRow>();
        }
        kmdList.add(kmd);
    }

    public List<PfmxOmdRow> getOmdList() {

        return omdList;
    }

    public synchronized void addOmdRow(PfmxOmdRow omd) {

        if (omdList == null) {
            omdList = new LinkedList<PfmxOmdRow>();
        }
        omdList.add(omd);
    }

    public List<PfmxBmdRow> getBmdList() {

        return bmdList;
    }

    public synchronized void addBmdRow(PfmxBmdRow bmd) {

        if (bmdList == null) {
            bmdList = new LinkedList<PfmxBmdRow>();
        }
        bmdList.add(bmd);
    }

    @Override
    public String toString() {

        return ClassUtil.getString(this);
    }
}
