package com.yener.web.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.yener.web.entity.Kisi;
import com.yener.web.service.KisiService;

@Controller
@Scope(value = "session")
public class KisiController implements Serializable {

	@Autowired
	private KisiService kisiService;

	private Kisi kisi;
	private List<Kisi> kisiList;

	@PostConstruct
	private void init() {
		kisi = new Kisi();
		kisiList = kisiService.listAllKisi();
		RequestContext.getCurrentInstance().update("kisiForm");
	}

	public void kisiEkle() {
		RequestContext.getCurrentInstance().execute("PF('kisiEkleW').show()");
	}

	public void addKisi() {
		kisiService.addKisi(kisi);
		RequestContext.getCurrentInstance().execute("PF('kisiEkleW').hide()");
		init();
	}
	
	public void kisiSil()
	{
		
		kisiService.delete(kisi);
		
	}
	public Kisi getKisi() {
		return kisi;
	}

	public void setKisi(Kisi kisi) {
		this.kisi = kisi;
	}

	public List<Kisi> getKisiList() {
		return kisiList;
	}

	public void setKisiList(List<Kisi> kisiList) {
		this.kisiList = kisiList;
	}

}
