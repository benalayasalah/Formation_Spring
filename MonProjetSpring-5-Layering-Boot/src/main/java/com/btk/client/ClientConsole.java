package com.btk.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.btk.business.ICompteBusiness;

@Component
public class ClientConsole {

	@Autowired
	private ICompteBusiness business;

	public ICompteBusiness getBusiness() {
		return business;
	}

	public void setBusiness(ICompteBusiness business) {
		this.business = business;
	}
	//
	// public static void main(String[] args) {
	// try (AnnotationConfigApplicationContext ctxt = new
	// AnnotationConfigApplicationContext(
	// MySpringConfiguration.class)) {
	//
	// ClientConsole client = ctxt.getBean(ClientConsole.class);
	// BigDecimal solde = client.getBusiness().consulterSolde("C1000");
	//
	// System.out.println("Le Solde est : " + solde);
	// }
	// }

}
