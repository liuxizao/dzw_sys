package com.accp.pojo;

import java.util.Date;
import java.util.List;

public class Employee {
    private String ephone;

    private Integer deid;

    private Integer zid;

    private String epwd;

    private Integer esex;

    private String ecreid;

    private String eaddress;

    private Date etrytimes;

    private Date elaimes;

    private Integer ezuant;

    private String eyunayin;

    private String ename;
    
    private Zhiwei zwei;
    
    private List<Tblperm> tblperm;

    public Zhiwei getZwei() {
		return zwei;
	}

	public void setZwei(Zhiwei zwei) {
		this.zwei = zwei;
	}

	public List<Tblperm> getTblperm() {
		return tblperm;
	}

	public void setTblperm(List<Tblperm> tblperm) {
		this.tblperm = tblperm;
	}

	public String getEphone() {
        return ephone;
    }

    public void setEphone(String ephone) {
        this.ephone = ephone == null ? null : ephone.trim();
    }

    public Integer getDeid() {
        return deid;
    }

    public void setDeid(Integer deid) {
        this.deid = deid;
    }

    public Integer getZid() {
        return zid;
    }

    public void setZid(Integer zid) {
        this.zid = zid;
    }

    public String getEpwd() {
        return epwd;
    }

    public void setEpwd(String epwd) {
        this.epwd = epwd == null ? null : epwd.trim();
    }

    public Integer getEsex() {
        return esex;
    }

    public void setEsex(Integer esex) {
        this.esex = esex;
    }

    public String getEcreid() {
        return ecreid;
    }

    public void setEcreid(String ecreid) {
        this.ecreid = ecreid == null ? null : ecreid.trim();
    }

    public String getEaddress() {
        return eaddress;
    }

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress == null ? null : eaddress.trim();
    }

    public Date getEtrytimes() {
        return etrytimes;
    }

    public void setEtrytimes(Date etrytimes) {
        this.etrytimes = etrytimes;
    }

    public Date getElaimes() {
        return elaimes;
    }

    public void setElaimes(Date elaimes) {
        this.elaimes = elaimes;
    }

    public Integer getEzuant() {
        return ezuant;
    }

    public void setEzuant(Integer ezuant) {
        this.ezuant = ezuant;
    }

    public String getEyunayin() {
        return eyunayin;
    }

    public void setEyunayin(String eyunayin) {
        this.eyunayin = eyunayin == null ? null : eyunayin.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }
}