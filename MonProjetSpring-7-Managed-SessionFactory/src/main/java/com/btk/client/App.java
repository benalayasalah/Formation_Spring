package com.btk.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.btk.domain.Compte;


public class App {
	public static void main(String[] args) {
		
		//Démarrer le conteneur Spring
		ConfigurableApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");
		
		
		
		
		// Obtenir la sesion factory à partir de la configuration
		//SessionFactory factory = new Configuration().configure().buildSessionFactory().getSessionFactory();
		try( SessionFactory factory = ctxt.getBean(SessionFactory.class)) {

		// Obtenir une session à partir de la factory
		Session session = factory.openSession();

		// Travailler sur les objets persistants via la session
		Compte compte = session.load(Compte.class, "C2000");  //ou bien session.get
		System.out.println(compte);

		// Close la session
		session.close();

			// close la factory
		} //factory.close();

	}
		
}
