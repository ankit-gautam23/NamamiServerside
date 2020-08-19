package com.namami.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TOURNAMENT")
public class TournamentEntity {
	
	@Id
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "RDATE")
	private String rdate;
	@Column(name = "IMAGEURL")
	private String imageurl;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
}
