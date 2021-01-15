package com.accp.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Client {
    private String cliphone;

    private String ephone;

    private String cliname;

    private String cliaddress;

    @JSONField(format = "yyyy-MM-dd")
    private Date clidate;

    private Integer mid;

    private Float baifb;

    @JSONField(format = "yyyy-MM-dd")
    private Date rhdate;

    private Float yue;

    private String khbz;

    public String getCliphone() {
        return cliphone;
    }

    public void setCliphone(String cliphone) {
        this.cliphone = cliphone == null ? null : cliphone.trim();
    }

    public String getEphone() {
        return ephone;
    }

    public void setEphone(String ephone) {
        this.ephone = ephone == null ? null : ephone.trim();
    }

    public String getCliname() {
        return cliname;
    }

    public void setCliname(String cliname) {
        this.cliname = cliname == null ? null : cliname.trim();
    }

    public String getCliaddress() {
        return cliaddress;
    }

    public void setCliaddress(String cliaddress) {
        this.cliaddress = cliaddress == null ? null : cliaddress.trim();
    }

    public Date getClidate() {
        return clidate;
    }

    public void setClidate(Date clidate) {
        this.clidate = clidate;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Float getBaifb() {
        return baifb;
    }

    public void setBaifb(Float baifb) {
        this.baifb = baifb;
    }

    public Date getRhdate() {
        return rhdate;
    }

    public void setRhdate(Date rhdate) {
        this.rhdate = rhdate;
    }

    public Float getYue() {
        return yue;
    }

    public void setYue(Float yue) {
        this.yue = yue;
    }

    public String getKhbz() {
        return khbz;
    }

    public void setKhbz(String khbz) {
        this.khbz = khbz == null ? null : khbz.trim();
    }
}