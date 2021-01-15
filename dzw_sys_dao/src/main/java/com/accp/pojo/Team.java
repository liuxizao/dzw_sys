package com.accp.pojo;

public class Team {
    private Integer tid;

    private String tname;

    private Integer tzhuant;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public Integer getTzhuant() {
        return tzhuant;
    }

    public void setTzhuant(Integer tzhuant) {
        this.tzhuant = tzhuant;
    }
}