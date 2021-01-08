package com.accp.pojo;

public class Fangong {
    private Integer fid;

    private Integer inid;

    private Float koufei;

    private String fyuany;

    private Integer fzt;

    private String wgyy;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getInid() {
        return inid;
    }

    public void setInid(Integer inid) {
        this.inid = inid;
    }

    public Float getKoufei() {
        return koufei;
    }

    public void setKoufei(Float koufei) {
        this.koufei = koufei;
    }

    public String getFyuany() {
        return fyuany;
    }

    public void setFyuany(String fyuany) {
        this.fyuany = fyuany == null ? null : fyuany.trim();
    }

    public Integer getFzt() {
        return fzt;
    }

    public void setFzt(Integer fzt) {
        this.fzt = fzt;
    }

    public String getWgyy() {
        return wgyy;
    }

    public void setWgyy(String wgyy) {
        this.wgyy = wgyy == null ? null : wgyy.trim();
    }
}