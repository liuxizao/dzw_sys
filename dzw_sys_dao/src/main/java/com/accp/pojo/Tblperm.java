package com.accp.pojo;

public class Tblperm {
    private Integer zid;

    private Integer fid;
    
    private Tblfunction tblfunction;

    public Tblfunction getTblfunction() {
		return tblfunction;
	}

	public void setTblfunction(Tblfunction tblfunction) {
		this.tblfunction = tblfunction;
	}

	public Integer getZid() {
        return zid;
    }

    public void setZid(Integer zid) {
        this.zid = zid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }
}