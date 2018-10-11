package com.btk.repository;

import java.util.List;

import com.btk.domain.Compte;

public interface IComptesRepository {

	// CRUD Contract

	void create(Compte c); // C du CRUD

	Compte findById(String id); // R du CRUD

	List<Compte> findAll(); // R par liste du CRUD

	Compte update(Compte c); // U du CRUD

	void delete(String id); // D du CRUD

}
