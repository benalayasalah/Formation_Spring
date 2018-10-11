package com.btk.repository;

import java.util.List;

import org.hibernate.Session;

import com.btk.domain.Compte;
import com.btk.utilities.HibernateUtil;

public class ComptesRepositoryImpl_Hibernate implements IComptesRepository {

	@Override
	public void create(Compte c) {
		// TODO Auto-generated method stub

	}

	@Override
	public Compte findById(String id) {

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.get(Compte.class, id);
		}

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
