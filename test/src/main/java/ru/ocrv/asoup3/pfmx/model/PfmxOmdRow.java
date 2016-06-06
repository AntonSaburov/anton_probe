package ru.ocrv.asoup3.pfmx.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtdankRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtdantRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtgruzRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtkperegRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtoaktRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtokatlgRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtokontRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtooperRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtootmRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtoperevRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtotextRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtovagRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtpereadRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtplatRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtprispsRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKttkoorRow;
import ru.ocrv.asoup3.pfmx.model.omd.PfmxOmdKtvperegRow;

public class PfmxOmdRow extends PfmxModelRow {

    private static final long serialVersionUID = 482692850395554091L;
    private Short ktdank;
    private Short ktdant;
    private Short ktokatlg;
    private Short ktgruz;
    private Short ktovag;
    private Short ktokont;
    private Short ktooper;
    private Short kttkoor;
    private Short ktotext;
    private Short ktoperev;
    private Short ktootm;
    private Short ktperead;
    private Short ktplat;
    private Short ktoakt;
    private Short ktvpereg;
    private Short ktkpereg;
    private Short ktprisps;

    private List<PfmxOmdKtdankRow> ktdankList;
    private List<PfmxOmdKtdantRow> ktdantList;
    private List<PfmxOmdKtokatlgRow> ktokatlgList;
    private List<PfmxOmdKtgruzRow> ktgruzList;
    private List<PfmxOmdKtovagRow> ktovagList;
    private List<PfmxOmdKtokontRow> ktokontList;
    private List<PfmxOmdKtooperRow> ktooperList;
    private List<PfmxOmdKttkoorRow> kttkoorList;
    private List<PfmxOmdKtotextRow> ktotextList;
    private List<PfmxOmdKtoperevRow> ktoperevList;
    private List<PfmxOmdKtootmRow> ktootmList;
    private List<PfmxOmdKtpereadRow> ktpereadList;
    private List<PfmxOmdKtplatRow> ktplatList;
    private List<PfmxOmdKtoaktRow> ktoaktList;
    private List<PfmxOmdKtvperegRow> ktvperegList;
    private List<PfmxOmdKtkperegRow> ktkperegList;
    private List<PfmxOmdKtprispsRow> ktprispsList;

    public Short getKtdank() {

        return ktdank;
    }

    public void setKtdank(Short ktdank) {

        this.ktdank = ktdank;
    }

    public Short getKtdant() {

        return ktdant;
    }

    public void setKtdant(Short ktdant) {

        this.ktdant = ktdant;
    }

    public Short getKtokatlg() {

        return ktokatlg;
    }

    public void setKtokatlg(Short ktokatlg) {

        this.ktokatlg = ktokatlg;
    }

    public Short getKtgruz() {

        return ktgruz;
    }

    public void setKtgruz(Short ktgruz) {

        this.ktgruz = ktgruz;
    }

    public Short getKtovag() {

        return ktovag;
    }

    public void setKtovag(Short ktovag) {

        this.ktovag = ktovag;
    }

    public Short getKtokont() {

        return ktokont;
    }

    public void setKtokont(Short ktokont) {

        this.ktokont = ktokont;
    }

    public Short getKtooper() {

        return ktooper;
    }

    public void setKtooper(Short ktooper) {

        this.ktooper = ktooper;
    }

    public Short getKttkoor() {

        return kttkoor;
    }

    public void setKttkoor(Short kttkoor) {

        this.kttkoor = kttkoor;
    }

    public Short getKtotext() {

        return ktotext;
    }

    public void setKtotext(Short ktotext) {

        this.ktotext = ktotext;
    }

    public Short getKtoperev() {

        return ktoperev;
    }

    public void setKtoperev(Short ktoperev) {

        this.ktoperev = ktoperev;
    }

    public Short getKtootm() {

        return ktootm;
    }

    public void setKtootm(Short ktootm) {

        this.ktootm = ktootm;
    }

    public Short getKtperead() {

        return ktperead;
    }

    public void setKtperead(Short ktperead) {

        this.ktperead = ktperead;
    }

    public Short getKtplat() {

        return ktplat;
    }

    public void setKtplat(Short ktplat) {

        this.ktplat = ktplat;
    }

    public Short getKtoakt() {

        return ktoakt;
    }

    public void setKtoakt(Short ktoakt) {

        this.ktoakt = ktoakt;
    }

    public Short getKtvpereg() {

        return ktvpereg;
    }

    public void setKtvpereg(Short ktvpereg) {

        this.ktvpereg = ktvpereg;
    }

    public Short getKtkpereg() {

        return ktkpereg;
    }

    public void setKtkpereg(Short ktkpereg) {

        this.ktkpereg = ktkpereg;
    }

    public Short getKtprisps() {

        return ktprisps;
    }

    public void setKtprisps(Short ktprisps) {

        this.ktprisps = ktprisps;
    }

    public List<PfmxOmdKtdankRow> getKtdankList() {

        return ktdankList;
    }

    public synchronized void addKtdankRow(PfmxOmdKtdankRow ktdankRow) {

        if (ktdankList == null) {
            ktdankList = new LinkedList<PfmxOmdKtdankRow>();
        }
        ktdankList.add(ktdankRow);
    }

    public List<PfmxOmdKtdantRow> getKtdantList() {

        return ktdantList == null ? Collections.<PfmxOmdKtdantRow> emptyList() : ktdantList;
    }

    public synchronized void addKtdantRow(PfmxOmdKtdantRow ktdantRow) {

        if (ktdantList == null) {
            ktdantList = new LinkedList<PfmxOmdKtdantRow>();
        }
        ktdantList.add(ktdantRow);
    }

    public List<PfmxOmdKtokatlgRow> getKtokatlgList() {

        return ktokatlgList == null ? Collections.<PfmxOmdKtokatlgRow> emptyList() : ktokatlgList;
    }

    public synchronized void addKtokatlgRow(PfmxOmdKtokatlgRow ktokatlgRow) {

        if (ktokatlgList == null) {
            ktokatlgList = new LinkedList<PfmxOmdKtokatlgRow>();
        }
        ktokatlgList.add(ktokatlgRow);
    }

    public List<PfmxOmdKtgruzRow> getKtgruzList() {

        return ktgruzList == null ? Collections.<PfmxOmdKtgruzRow> emptyList() : ktgruzList;
    }

    public synchronized void addKtgruzRow(PfmxOmdKtgruzRow ktgruzRow) {

        if (ktgruzList == null) {
            ktgruzList = new LinkedList<PfmxOmdKtgruzRow>();
        }
        ktgruzList.add(ktgruzRow);
    }

    public List<PfmxOmdKtovagRow> getKtovagList() {

        return ktovagList == null ? Collections.<PfmxOmdKtovagRow> emptyList() : ktovagList;
    }

    public synchronized void addKtovagRow(PfmxOmdKtovagRow ktovagRow) {

        if (ktovagList == null) {
            ktovagList = new LinkedList<PfmxOmdKtovagRow>();
        }
        ktovagList.add(ktovagRow);
    }

    public List<PfmxOmdKtokontRow> getKtokontList() {

        return ktokontList == null ? Collections.<PfmxOmdKtokontRow> emptyList() : ktokontList;
    }

    public synchronized void addKtokontRow(PfmxOmdKtokontRow ktokontRow) {

        if (ktokontList == null) {
            ktokontList = new LinkedList<PfmxOmdKtokontRow>();
        }
        ktokontList.add(ktokontRow);
    }

    public List<PfmxOmdKtooperRow> getKtooperList() {

        return ktooperList == null ? Collections.<PfmxOmdKtooperRow> emptyList() : ktooperList;
    }

    public synchronized void addKtooperRow(PfmxOmdKtooperRow ktooperRow) {

        if (ktooperList == null) {
            ktooperList = new LinkedList<PfmxOmdKtooperRow>();
        }
        ktooperList.add(ktooperRow);
    }

    public List<PfmxOmdKttkoorRow> getKttkoorList() {

        return kttkoorList == null ? Collections.<PfmxOmdKttkoorRow> emptyList() : kttkoorList;
    }

    public synchronized void addKttkoorRow(PfmxOmdKttkoorRow kttkoorRow) {

        if (kttkoorList == null) {
            kttkoorList = new LinkedList<PfmxOmdKttkoorRow>();
        }
        kttkoorList.add(kttkoorRow);
    }

    public List<PfmxOmdKtotextRow> getKtotextList() {

        return ktotextList == null ? Collections.<PfmxOmdKtotextRow> emptyList() : ktotextList;
    }

    public synchronized void addKtotextRow(PfmxOmdKtotextRow ktotextRow) {

        if (ktotextList == null) {
            ktotextList = new LinkedList<PfmxOmdKtotextRow>();
        }
        ktotextList.add(ktotextRow);
    }

    public List<PfmxOmdKtoperevRow> getKtoperevList() {

        return ktoperevList == null ? Collections.<PfmxOmdKtoperevRow> emptyList() : ktoperevList;
    }

    public synchronized void addKtotextRow(PfmxOmdKtoperevRow ktoperevRow) {

        if (ktoperevList == null) {
            ktoperevList = new LinkedList<PfmxOmdKtoperevRow>();
        }
        ktoperevList.add(ktoperevRow);
    }

    public List<PfmxOmdKtootmRow> getKtootmList() {

        return ktootmList == null ? Collections.<PfmxOmdKtootmRow> emptyList() : ktootmList;
    }

    public synchronized void addKtootmRow(PfmxOmdKtootmRow ktootmRow) {

        if (ktootmList == null) {
            ktootmList = new LinkedList<PfmxOmdKtootmRow>();
        }
        ktootmList.add(ktootmRow);
    }

    public List<PfmxOmdKtpereadRow> getKtpereadList() {

        return ktpereadList == null ? Collections.<PfmxOmdKtpereadRow> emptyList() : ktpereadList;
    }

    public synchronized void addKtpereadRow(PfmxOmdKtpereadRow ktpereadRow) {

        if (ktpereadList == null) {
            ktpereadList = new LinkedList<PfmxOmdKtpereadRow>();
        }
        ktpereadList.add(ktpereadRow);
    }

    public List<PfmxOmdKtplatRow> getKtplatList() {

        return ktplatList == null ? Collections.<PfmxOmdKtplatRow> emptyList() : ktplatList;
    }

    public synchronized void addKtplatRow(PfmxOmdKtplatRow ktplatRow) {

        if (ktplatList == null) {
            ktplatList = new LinkedList<PfmxOmdKtplatRow>();
        }
        ktplatList.add(ktplatRow);
    }

    public List<PfmxOmdKtoaktRow> getKtoaktList() {

        return ktoaktList == null ? Collections.<PfmxOmdKtoaktRow> emptyList() : ktoaktList;
    }

    public synchronized void addKtoaktRow(PfmxOmdKtoaktRow ktoaktRow) {

        if (ktoaktList == null) {
            ktoaktList = new LinkedList<PfmxOmdKtoaktRow>();
        }
        ktoaktList.add(ktoaktRow);
    }

    public List<PfmxOmdKtvperegRow> getKtvperegList() {

        return ktvperegList == null ? Collections.<PfmxOmdKtvperegRow> emptyList() : ktvperegList;
    }

    public synchronized void addKtvperegRow(PfmxOmdKtvperegRow ktvperegRow) {

        if (ktvperegList == null) {
            ktvperegList = new LinkedList<PfmxOmdKtvperegRow>();
        }
        ktvperegList.add(ktvperegRow);
    }

    public List<PfmxOmdKtkperegRow> getKtkperegList() {

        return ktkperegList == null ? Collections.<PfmxOmdKtkperegRow> emptyList() : ktkperegList;
    }

    public synchronized void addKtkperegRow(PfmxOmdKtkperegRow ktkperegRow) {

        if (ktkperegList == null) {
            ktkperegList = new LinkedList<PfmxOmdKtkperegRow>();
        }
        ktkperegList.add(ktkperegRow);
    }

    public List<PfmxOmdKtprispsRow> getKtprispsList() {

        return ktprispsList == null ? Collections.<PfmxOmdKtprispsRow> emptyList() : ktprispsList;
    }

    public synchronized void addKtprispsRow(PfmxOmdKtprispsRow ktprispsRow) {

        if (ktprispsList == null) {
            ktprispsList = new LinkedList<PfmxOmdKtprispsRow>();
        }
        ktprispsList.add(ktprispsRow);
    }

}
