package com.accp.pojo;

public class Stars {
    private Integer sid;

    private String starts;

    private Float xmoney;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getStarts() {
        return starts;
    }

    public void setStarts(String starts) {
        this.starts = starts == null ? null : starts.trim();
    }

    public Float getXmoney() {
        return xmoney;
    }

    public void setXmoney(Float xmoney) {
        this.xmoney = xmoney;
    }
}