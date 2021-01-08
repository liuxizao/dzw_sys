package com.accp.pojo;

import java.util.Date;

public class Cashiers {
    private String casid;

    private Integer inid;

    private Float cassprice;

    private Float shisprice;

    private String paymenttemp;

    private Date casdate;

    public String getCasid() {
        return casid;
    }

    public void setCasid(String casid) {
        this.casid = casid == null ? null : casid.trim();
    }

    public Integer getInid() {
        return inid;
    }

    public void setInid(Integer inid) {
        this.inid = inid;
    }

    public Float getCassprice() {
        return cassprice;
    }

    public void setCassprice(Float cassprice) {
        this.cassprice = cassprice;
    }

    public Float getShisprice() {
        return shisprice;
    }

    public void setShisprice(Float shisprice) {
        this.shisprice = shisprice;
    }

    public String getPaymenttemp() {
        return paymenttemp;
    }

    public void setPaymenttemp(String paymenttemp) {
        this.paymenttemp = paymenttemp == null ? null : paymenttemp.trim();
    }

    public Date getCasdate() {
        return casdate;
    }

    public void setCasdate(Date casdate) {
        this.casdate = casdate;
    }
}