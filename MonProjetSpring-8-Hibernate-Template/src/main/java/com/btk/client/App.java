package com.btk.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.btk.domain.Compte;

public class App {
	public static void main(String[] args) {

		// Démarrer le conteneur Spring
		ConfigurableApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");

		HibernateTemplate template = ctxt.getBean(HibernateTemplate.class);

		Compte c = template.get(Compte.class, "C2000");
		System.out.println(c);

	}

}
