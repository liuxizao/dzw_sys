package com.accp.pojo;

public class Firm {
    private Integer firmid;

    private String firmname;

    private String faddress;

    private String fphone;

    private String lxr;

    private String lphone;

    private String fsevenst;

    public Integer getFirmid() {
        return firmid;
    }

    public void setFirmid(Integer firmid) {
        this.firmid = firmid;
    }

    public String getFirmname() {
        return firmname;
    }

    public void setFirmname(String firmname) {
        this.firmname = firmname == null ? null : firmname.trim();
    }

    public String getFaddress() {
        return faddress;
    }

    public void setFaddress(String faddress) {
        this.faddress = faddress == null ? null : faddress.trim();
    }

    public String getFphone() {
        return fphone;
    }

    public void setFphone(String fphone) {
        this.fphone = fphone == null ? null : fphone.trim();
    }

    public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr == null ? null : lxr.trim();
    }

    public String getLphone() {
        return lphone;
    }

    public void setLphone(String lphone) {
        this.lphone = lphone == null ? null : lphone.trim();
    }

    public String getFsevenst() {
        return fsevenst;
    }

    public void setFsevenst(String fsevenst) {
        this.fsevenst = fsevenst == null ? null : fsevenst.trim();
    }
}