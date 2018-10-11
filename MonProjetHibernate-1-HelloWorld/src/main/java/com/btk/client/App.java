package com.btk.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.btk.domain.Compte;


public class App {
	public static void main(String[] args) {
		
		
		// Obtenir la sesion factory à partir de la configuration
		SessionFactory factory = new Configuration().configure().buildSessionFactory().getSessionFactory();

		// Obtenir une session à partir de la factory
		Session session = factory.openSession();

		// Travailler sur les objets persistants via la session
		Compte compte = session.load(Compte.class, "C2000");  //ou bien session.get
		System.out.println(compte);

		// Close la session
		session.close();

		// close la factory
		factory.close();

	}
}
