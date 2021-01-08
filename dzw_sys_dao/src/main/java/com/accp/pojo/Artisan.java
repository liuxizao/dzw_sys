package com.accp.pojo;

import java.util.Date;

public class Artisan {
    private String aphone;

    private Integer sid;

    private Integer zid;

    private Integer tid;

    private String aname;

    private Integer asex;

    private String address;

    private String acaid;

    private String acraft;

    private Integer azt;

    private String alzyy;

    private Date alzday;

    private Date arzday;

    public String getAphone() {
        return aphone;
    }

    public void setAphone(String aphone) {
        this.aphone = aphone == null ? null : aphone.trim();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getZid() {
        return zid;
    }

    public void setZid(Integer zid) {
        this.zid = zid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public Integer getAsex() {
        return asex;
    }

    public void setAsex(Integer asex) {
        this.asex = asex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAcaid() {
        return acaid;
    }

    public void setAcaid(String acaid) {
        this.acaid = acaid == null ? null : acaid.trim();
    }

    public String getAcraft() {
        return acraft;
    }

    public void setAcraft(String acraft) {
        this.acraft = acraft == null ? null : acraft.trim();
    }

    public Integer getAzt() {
        return azt;
    }

    public void setAzt(Integer azt) {
        this.azt = azt;
    }

    public String getAlzyy() {
        return alzyy;
    }

    public void setAlzyy(String alzyy) {
        this.alzyy = alzyy == null ? null : alzyy.trim();
    }

    public Date getAlzday() {
        return alzday;
    }

    public void setAlzday(Date alzday) {
        this.alzday = alzday;
    }

    public Date getArzday() {
        return arzday;
    }

    public void setArzday(Date arzday) {
        this.arzday = arzday;
    }
}