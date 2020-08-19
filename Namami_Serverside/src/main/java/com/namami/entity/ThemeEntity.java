package com.namami.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "THEME")
public class ThemeEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "THEMEID")
	private Integer themeid;
	@Column(name = "THEME")
	private String theme;
	@Column(name = "TDATE")
	private String tdate;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "IMGURL")
	private String imgurl;
	
	public Integer getThemeid() {
		return themeid;
	}
	public void setThemeid(Integer themeid) {
		this.themeid = themeid;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getTdate() {
		return tdate;
	}
	public void setTdate(String tdate) {
		this.tdate = tdate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
}
