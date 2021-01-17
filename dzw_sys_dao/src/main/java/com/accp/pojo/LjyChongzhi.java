package com.accp.pojo;

import java.util.Date;

public class LjyChongzhi {
		private String cliphone;
	
	    private String ephone;
	
	    private String cliname;
	
	    private String cliaddress;
	
	    private Date clidate;
	
	    private Integer mid;
	
	    private Float baifb;
	
	    private Date rhdate;
	
	    private Float yue;
	
	    private String khbz;

		private Integer cid;

	    private String cztype;

	    private Float cmoney;

	    private String cbh;

	    private Date czdate;

		public String getCliphone() {
			return cliphone;
		}

		public void setCliphone(String cliphone) {
			this.cliphone = cliphone;
		}

		public String getEphone() {
			return ephone;
		}

		public void setEphone(String ephone) {
			this.ephone = ephone;
		}

		public String getCliname() {
			return cliname;
		}

		public void setCliname(String cliname) {
			this.cliname = cliname;
		}

		public String getCliaddress() {
			return cliaddress;
		}

		public void setCliaddress(String cliaddress) {
			this.cliaddress = cliaddress;
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
			this.khbz = khbz;
		}

		public Integer getCid() {
			return cid;
		}

		public void setCid(Integer cid) {
			this.cid = cid;
		}

		public String getCztype() {
			return cztype;
		}

		public void setCztype(String cztype) {
			this.cztype = cztype;
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
			this.cbh = cbh;
		}

		public Date getCzdate() {
			return czdate;
		}

		public void setCzdate(Date czdate) {
			this.czdate = czdate;
		}

		public LjyChongzhi(String cliphone, String ephone, String cliname, String cliaddress, Date clidate, Integer mid,
				Float baifb, Date rhdate, Float yue, String khbz, Integer cid, String cztype, Float cmoney, String cbh,
				Date czdate) {
			super();
			this.cliphone = cliphone;
			this.ephone = ephone;
			this.cliname = cliname;
			this.cliaddress = cliaddress;
			this.clidate = clidate;
			this.mid = mid;
			this.baifb = baifb;
			this.rhdate = rhdate;
			this.yue = yue;
			this.khbz = khbz;
			this.cid = cid;
			this.cztype = cztype;
			this.cmoney = cmoney;
			this.cbh = cbh;
			this.czdate = czdate;
		}

		public LjyChongzhi() {
			super();
		}

		@Override
		public String toString() {
			return "LjyChongzhi [cliphone=" + cliphone + ", ephone=" + ephone + ", cliname=" + cliname + ", cliaddress="
					+ cliaddress + ", clidate=" + clidate + ", mid=" + mid + ", baifb=" + baifb + ", rhdate=" + rhdate
					+ ", yue=" + yue + ", khbz=" + khbz + ", cid=" + cid + ", cztype=" + cztype + ", cmoney=" + cmoney
					+ ", cbh=" + cbh + ", czdate=" + czdate + "]";
		}
	    
	    

}
