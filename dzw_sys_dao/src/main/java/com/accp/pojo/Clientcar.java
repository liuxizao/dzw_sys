package com.accp.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Clientcar {
    private String cno;

    private String cliphone;

    private Integer ctid;

    private String driver;

    private String dphone;

    @DateTimeFormat(pattern="yyyy��MM��dd��")
    private Date ddate;

    @DateTimeFormat(pattern="yyyy��MM��dd��")
    private Date purdate;

    @DateTimeFormat(pattern="yyyy��MM��dd��")
    private Date jctdate;
    
    private Cartypes ctype;
    

    public Cartypes getCtype() {
		return ctype;
	}

	public void setCtype(Cartypes ctype) {
		this.ctype = ctype;
	}

	public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno == null ? null : cno.trim();
    }

    public String getCliphone() {
        return cliphone;
    }

    public void setCliphone(String cliphone) {
        this.cliphone = cliphone == null ? null : cliphone.trim();
    }

    public Integer getCtid() {
        return ctid;
    }

    public void setCtid(Integer ctid) {
        this.ctid = ctid;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
    }

    public String getDphone() {
        return dphone;
    }

    public void setDphone(String dphone) {
        this.dphone = dphone == null ? null : dphone.trim();
    }

    public Date getDdate() {
        return ddate;
    }

    public void setDdate(Date ddate) {
        this.ddate = ddate;
    }

    public Date getPurdate() {
        return purdate;
    }

    public void setPurdate(Date purdate) {
        this.purdate = purdate;
    }

    public Date getJctdate() {
        return jctdate;
    }

    public void setJctdate(Date jctdate) {
        this.jctdate = jctdate;
    }
}