package com.namami.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BATTLE")
public class BattleEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BATTLEID")
	private Integer battleid;
	@Column(name = "EMAIL1")
	private String email1;
	@Column(name = "EMAIL2")
	private String email2;
	@Column(name = "STARTTIME")
	private String starttime;
	@Column(name = "ENDTIME")
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
