package com.accp.pojo;

public class Wxxq {
    private Integer xqid;

    private Integer inid;

    private String xqname;

    private Integer xqsl;

    private Integer spid;

    private Integer zt;

    private Float xmoney;

    public Integer getXqid() {
        return xqid;
    }

    public void setXqid(Integer xqid) {
        this.xqid = xqid;
    }

    public Integer getInid() {
        return inid;
    }

    public void setInid(Integer inid) {
        this.inid = inid;
    }

    public String getXqname() {
        return xqname;
    }

    public void setXqname(String xqname) {
        this.xqname = xqname == null ? null : xqname.trim();
    }

    public Integer getXqsl() {
        return xqsl;
    }

    public void setXqsl(Integer xqsl) {
        this.xqsl = xqsl;
    }

    public Integer getSpid() {
        return spid;
    }

    public void setSpid(Integer spid) {
        this.spid = spid;
    }

    public Integer getZt() {
        return zt;
    }

    public void setZt(Integer zt) {
        this.zt = zt;
    }

    public Float getXmoney() {
        return xmoney;
    }

    public void setXmoney(Float xmoney) {
        this.xmoney = xmoney;
    }
}