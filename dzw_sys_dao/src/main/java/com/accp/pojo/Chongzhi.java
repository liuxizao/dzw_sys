package com.accp.pojo;

import java.util.Date;

public class Chongzhi {
    private Integer cid;

    private String cliphone;

    private String cztype;

    private Float cmoney;

    private String cbh;

    
    private Date czdate;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCliphone() {
        return cliphone;
    }

    public void setCliphone(String cliphone) {
        this.cliphone = cliphone == null ? null : cliphone.trim();
    }

    public String getCztype() {
        return cztype;
    }

    public void setCztype(String cztype) {
        this.cztype = cztype == null ? null : cztype.trim();
    }

    public Float getCmoney() {
        return cmoney;
    }

    public void setCmoney(Float cmoney) {
        this.cmoney = cmoney;
    }

    public String getCbh() {
        return cbh;
    }

    public void setCbh(String cbh) {
        this.cbh = cbh == null ? null : cbh.trim();
    }

    public Date getCzdate() {
        return czdate;
    }

    public void setCzdate(Date czdate) {
        this.czdate = czdate;
    }
}