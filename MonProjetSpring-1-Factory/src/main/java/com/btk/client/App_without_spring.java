package com.btk.client;

import java.math.BigDecimal;

import com.btk.domain.Compte;

public class App_without_spring 
{
    public static void main( String[] args )
    {
    	
    	Compte compte = new Compte("C2000","Ben Alaya Salah",new BigDecimal("1000"));
    	System.out.println(compte);
    	
    }
}
