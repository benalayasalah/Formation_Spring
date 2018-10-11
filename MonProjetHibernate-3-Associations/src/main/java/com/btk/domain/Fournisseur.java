package com.btk.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "fournisseurs")
public class Fournisseur {

	@Id
	private String id;

	private String nom;

	@ManyToMany
	private List<Produit> produits;
	
	
	
	public Fournisseur() {
		// TODO Auto-generated constructor stub
	}



	public Fournisseur(String id, String nom, List<Produit> produits) {
		super();
		this.id = id;
		this.nom = nom;
		this.produits = produits;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public List<Produit> getProduits() {
		return produits;
	}



	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	
	
	
	
	
	
	
}
