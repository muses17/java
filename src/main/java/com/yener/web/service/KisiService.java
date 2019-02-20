package com.yener.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yener.web.dao.KisiDAO;
import com.yener.web.entity.Kisi;

@Service
@Transactional
public class KisiService {

	@Autowired
	private KisiDAO kisiDAO;
	

    public void addKisi(Kisi k) {
        this.kisiDAO.addKisi(k);
    }
 
 
    public List<Kisi> listAllKisi() {
        return this.kisiDAO.listAllKisi();
    }
    
    public void delete(Kisi k)
    {
    	this.kisiDAO.delete(k);
    }
}
