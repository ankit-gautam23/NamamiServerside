package com.namami.entity;

import javax.persistence.*;

@Entity
@Table(name = "RBATTLE")
public class RegisterBattleEntity {
	@Id
	@Column(name = "EMAIL")
	private String 	email;
	@Column(name = "DATE")
	private String date;
	@Column(name = "IMGURL")
	private String imgurl;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

}
