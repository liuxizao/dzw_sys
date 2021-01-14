package com.accp.pojo;

import java.util.List;

public class Team {
    private Integer tid;

    private String tname;

    private Integer tzhuant;

    private Integer sid;
    
    private List<Artisan> artisan;
    

    public List<Artisan> getArtisan() {
		return artisan;
	}

	public void setArtisan(List<Artisan> artisan) {
		this.artisan = artisan;
	}

	public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public Integer getTzhuant() {
        return tzhuant;
    }

    public void setTzhuant(Integer tzhuant) {
        this.tzhuant = tzhuant;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
}