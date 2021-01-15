package com.accp.pojo;

import java.util.Date;

public class Cashiers {
    private String casid;

    private Integer inid;

    private Float cassprice;

    private Float shisprice;

    private String paymenttemp;

    private Date casdate;
    
    
    private int wid;
    private String aphone;
    private int tid;
    private String cno;
    private int izt;
    private Date jdate;
    private Date jcday;
    private Date yjday;
    private Date wgday;
    private int iszn;
    private int lc;
    private int ifjs;
    private String insevent;
	public String getCasid() {
		return casid;
	}
	public void setCasid(String casid) {
		this.casid = casid;
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
		this.paymenttemp = paymenttemp;
	}
	public Date getCasdate() {
		return casdate;
	}
	public void setCasdate(Date casdate) {
		this.casdate = casdate;
	}
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public String getAphone() {
		return aphone;
	}
	public void setAphone(String aphone) {
		this.aphone = aphone;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public int getIzt() {
		return izt;
	}
	public void setIzt(int izt) {
		this.izt = izt;
	}
	public Date getJdate() {
		return jdate;
	}
	public void setJdate(Date jdate) {
		this.jdate = jdate;
	}
	public Date getJcday() {
		return jcday;
	}
	public void setJcday(Date jcday) {
		this.jcday = jcday;
	}
	public Date getYjday() {
		return yjday;
	}
	public void setYjday(Date yjday) {
		this.yjday = yjday;
	}
	public Date getWgday() {
		return wgday;
	}
	public void setWgday(Date wgday) {
		this.wgday = wgday;
	}
	public int getIszn() {
		return iszn;
	}
	public void setIszn(int iszn) {
		this.iszn = iszn;
	}
	public int getLc() {
		return lc;
	}
	public void setLc(int lc) {
		this.lc = lc;
	}
	public int getIfjs() {
		return ifjs;
	}
	public void setIfjs(int ifjs) {
		this.ifjs = ifjs;
	}
	public String getInsevent() {
		return insevent;
	}
	public void setInsevent(String insevent) {
		this.insevent = insevent;
	}
	public Cashiers(String casid, Integer inid, Float cassprice, Float shisprice, String paymenttemp, Date casdate,
			int wid, String aphone, int tid, String cno, int izt, Date jdate, Date jcday, Date yjday, Date wgday,
			int iszn, int lc, int ifjs, String insevent) {
		super();
		this.casid = casid;
		this.inid = inid;
		this.cassprice = cassprice;
		this.shisprice = shisprice;
		this.paymenttemp = paymenttemp;
		this.casdate = casdate;
		this.wid = wid;
		this.aphone = aphone;
		this.tid = tid;
		this.cno = cno;
		this.izt = izt;
		this.jdate = jdate;
		this.jcday = jcday;
		this.yjday = yjday;
		this.wgday = wgday;
		this.iszn = iszn;
		this.lc = lc;
		this.ifjs = ifjs;
		this.insevent = insevent;
	}
	public Cashiers() {
		super();
	}
	
   
}