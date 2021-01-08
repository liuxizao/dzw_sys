package com.accp.pojo;

public class Cartypes {
    private Integer ctid;

    private String ctname;

    private String ctszm;

    public Integer getCtid() {
        return ctid;
    }

    public void setCtid(Integer ctid) {
        this.ctid = ctid;
    }

    public String getCtname() {
        return ctname;
    }

    public void setCtname(String ctname) {
        this.ctname = ctname == null ? null : ctname.trim();
    }

    public String getCtszm() {
        return ctszm;
    }

    public void setCtszm(String ctszm) {
        this.ctszm = ctszm == null ? null : ctszm.trim();
    }
}