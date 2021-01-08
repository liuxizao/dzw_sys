package com.accp.pojo;

public class Workcar {
    private Integer wid;

    private String caid;

    private String cbrand;

    private Integer czt;

    private Float qbj;

    private Float ccj;

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getCaid() {
        return caid;
    }

    public void setCaid(String caid) {
        this.caid = caid == null ? null : caid.trim();
    }

    public String getCbrand() {
        return cbrand;
    }

    public void setCbrand(String cbrand) {
        this.cbrand = cbrand == null ? null : cbrand.trim();
    }

    public Integer getCzt() {
        return czt;
    }

    public void setCzt(Integer czt) {
        this.czt = czt;
    }

    public Float getQbj() {
        return qbj;
    }

    public void setQbj(Float qbj) {
        this.qbj = qbj;
    }

    public Float getCcj() {
        return ccj;
    }

    public void setCcj(Float ccj) {
        this.ccj = ccj;
    }
}