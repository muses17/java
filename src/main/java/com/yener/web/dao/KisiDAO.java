package com.yener.web.dao;

import java.util.List;

import com.yener.web.entity.Kisi;

public interface KisiDAO {

	public void addKisi(Kisi k);
    public List<Kisi> listAllKisi();
    //silme
    public void delete(Kisi k);
}
