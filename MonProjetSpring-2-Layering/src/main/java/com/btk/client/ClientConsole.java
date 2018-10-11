package com.btk.client;

import java.math.BigDecimal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.btk.business.ICompteBusiness;

public class ClientConsole {

	private ICompteBusiness business;

	public ICompteBusiness getBusiness() {
		return business;
	}

	public void setBusiness(ICompteBusiness business) {
		this.business = business;
	}

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml")) {
			ClientConsole client = ctxt.getBean(ClientConsole.class);
			BigDecimal solde = client.getBusiness().consulterSolde("C1000");

			System.out.println("Le Solde est : " + solde);
		}
	}

}
