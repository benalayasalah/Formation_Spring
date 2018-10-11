package com.btk.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.btk.domain.Compte;

public class App_With_Spring {

	public static void main(String[] args) {

		// Démarrer le conteneur (contexte) Spring
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		// Démarrer l'objet au conteneur
		Compte c = context.getBean("compte0", Compte.class);

		// Travailler avec l'objet
		System.out.println("Obtenu à partir de la factory de Spring " + c);

		// Arrêter le conteneur
		((AbstractApplicationContext) context).close();

	}

}
