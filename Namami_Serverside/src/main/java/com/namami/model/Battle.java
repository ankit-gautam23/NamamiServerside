package com.namami.model;

public class Battle {
	private Integer battleid;
	private String email1;
	private String email2;
	private String starttime;
	private String endtime;
	public Integer getBattleid() {
		return battleid;
	}
	public void setBattleid(Integer battleid) {
		this.battleid = battleid;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
}
