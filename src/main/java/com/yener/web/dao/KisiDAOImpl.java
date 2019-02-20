package com.yener.web.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yener.web.entity.Kisi;

@Repository
public class KisiDAOImpl implements KisiDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(KisiDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;
	
	 public void setSessionFactory(SessionFactory sf){
	        this.sessionFactory = sf;
	    }

	public void addKisi(Kisi k) {
		Session session = this.sessionFactory.getCurrentSession();
        session.persist(k);
        logger.info("Person saved successfully, Person Details="+k);
		
	}

	public List<Kisi> listAllKisi() {
		 Session session = this.sessionFactory.getCurrentSession();
	        List<Kisi> kisiList = session.createQuery("from Kisi").list();
	        for(Kisi p : kisiList){
	            logger.info("Person List::"+p);
	        }
	        return kisiList;
	}
	@Override
	public void delete(Kisi k)
	{
		Session session = this.sessionFactory.getCurrentSession();
		
			session.delete(k);
		
		
		
	}

}
