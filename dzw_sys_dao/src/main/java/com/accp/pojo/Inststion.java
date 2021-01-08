package com.accp.pojo;

import java.util.Date;

public class Inststion {
    private Integer inid;

    private Integer wid;

    private String aphone;

    private Integer tid;

    private String cno;

    private Integer izt;

    private Date jdate;

    private Date jcday;

    private Date yjday;

    private Date wgday;

    private Integer iszn;

    private Integer lc;

    private Integer ifjs;

    private String insevent;

    public Integer getInid() {
        return inid;
    }

    public void setInid(Integer inid) {
        this.inid = inid;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getAphone() {
        return aphone;
    }

    public void setAphone(String aphone) {
        this.aphone = aphone == null ? null : aphone.trim();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno == null ? null : cno.trim();
    }

    public Integer getIzt() {
        return izt;
    }

    public void setIzt(Integer izt) {
        this.izt = izt;
    }

    public Date getJdate() {
        return jdate;
    }

    public void setJdate(Date jdate) {
        this.jdate = jdate;
    }

    public Date getJcday() {
        return jcday;
    }

    public void setJcday(Date jcday) {
        this.jcday = jcday;
    }

    public Date getYjday() {
        return yjday;
    }

    public void setYjday(Date yjday) {
        this.yjday = yjday;
    }

    public Date getWgday() {
        return wgday;
    }

    public void setWgday(Date wgday) {
        this.wgday = wgday;
    }

    public Integer getIszn() {
        return iszn;
    }

    public void setIszn(Integer iszn) {
        this.iszn = iszn;
    }

    public Integer getLc() {
        return lc;
    }

    public void setLc(Integer lc) {
        this.lc = lc;
    }

    public Integer getIfjs() {
        return ifjs;
    }

    public void setIfjs(Integer ifjs) {
        this.ifjs = ifjs;
    }

    public String getInsevent() {
        return insevent;
    }

    public void setInsevent(String insevent) {
        this.insevent = insevent == null ? null : insevent.trim();
    }
}