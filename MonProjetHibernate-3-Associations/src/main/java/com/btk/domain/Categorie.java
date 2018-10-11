package com.btk.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Categorie {

	@Id
	private String id;
	private String titre;

	@OneToMany(mappedBy="categorie")
	private List<Produit> produits;

	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categorie(String id, String titre, List<Produit> produits) {
		super();
		this.id = id;
		this.titre = titre;
		this.produits = produits;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	


}
