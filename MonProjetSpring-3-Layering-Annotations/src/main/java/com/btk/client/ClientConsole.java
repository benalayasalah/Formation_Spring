package com.btk.client;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml")) {
			ClientConsole client = ctxt.getBean(ClientConsole.class);
			BigDecimal solde = client.getBusiness().consulterSolde("C1000");

			System.out.println("Le Solde est : " + solde);
		}
	}

}
