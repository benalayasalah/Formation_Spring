package com.btk.service;

import org.springframework.stereotype.Service;

@Service
public class Calcul {

	public int additionner(int a, int b) {
//		System.out.println(">>>    LOG input additionner >>>>>>");
		int resultat = a + b;
//	System.out.println(">>>    LOG output additionner >>>>>>");
		return resultat;
	}

	public int diviser(int a, int b) {
//		System.out.println(">>>    LOG input diviser >>>>>>");
		int resultat = a / b;
//		System.out.println(">>>    LOG output diviser >>>>>>");
		return resultat;
	}
}
