package com.namami.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GALLERY")
public class GalleryEntity {
	@Id
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "IMGSURL")
	private String imgsurl;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getImgsurl() {
		return imgsurl;
	}
	public void setImgsurl(String imgsurl) {
		this.imgsurl = imgsurl;
	}

}
