package com.btk.utilities;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory;

	// créer un singleton pour être instancié une seule fois
	static {
		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (HibernateException e) {
		System.out.println("Log - Attention, il y'a eu l'exception "+ e+ "lors de la factorisation");
		}
	}
	
	
	
	
	public static SessionFactory getSessionFactory() {
		return factory;
	}
	
	
}
