package com.yener.web.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "KISI")
public class Kisi implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(allocationSize = 1, initialValue = 1, name = "KISI_SEQ", sequenceName = "KISI_SEQ")
	@GeneratedValue(generator = "KISI_SEQ", strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "AD", length = 100)
	private String ad;
	
	@Column(name = "SOYAD", length = 100)
	private String soyad;

	
	public void setId(Long id) {
		this.id = id;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public String getAd() {
		return ad;
	}

	public Long getId() {
		return id;
	}
	
	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}


}
