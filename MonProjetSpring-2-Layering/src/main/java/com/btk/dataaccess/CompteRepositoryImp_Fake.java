package com.btk.dataaccess;

import java.math.BigDecimal;
import java.util.List;

import com.btk.domain.Compte;

public class CompteRepositoryImp_Fake implements IComptesRepository {

	@Override
	public void create(Compte c) {
		// TODO Auto-generated method stub

	}

	@Override
	public Compte findById(String id) {
		return new Compte("C3000", "Boukthir", new BigDecimal("1000"));
	}

	@Override
	public List<Compte> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compte update(Compte c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

}
