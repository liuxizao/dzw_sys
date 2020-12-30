package com.accp.pojo;

public class Department {
    private Integer deid;

    private String dename;

    public Integer getDeid() {
        return deid;
    }

    public void setDeid(Integer deid) {
        this.deid = deid;
    }

    public String getDename() {
        return dename;
    }

    public void setDename(String dename) {
        this.dename = dename == null ? null : dename.trim();
    }
}