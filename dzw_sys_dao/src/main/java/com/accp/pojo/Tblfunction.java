package com.accp.pojo;

public class Tblfunction {
    private Integer fid;

    private String fcode;

    private String fname;

    private Integer fpid;
    
    private Tblfunction tblfunction;

    public Tblfunction getTblfunction() {
		return tblfunction;
	}

	public void setTblfunction(Tblfunction tblfunction) {
		this.tblfunction = tblfunction;
	}

	public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFcode() {
        return fcode;
    }

    public void setFcode(String fcode) {
        this.fcode = fcode == null ? null : fcode.trim();
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public Integer getFpid() {
        return fpid;
    }

    public void setFpid(Integer fpid) {
        this.fpid = fpid;
    }
}