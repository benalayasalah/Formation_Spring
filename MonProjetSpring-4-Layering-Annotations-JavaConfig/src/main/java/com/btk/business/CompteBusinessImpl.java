package com.btk.business;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btk.dataaccess.IComptesRepository;
import com.btk.domain.Compte;




@Service
public class CompteBusinessImpl implements ICompteBusiness {

	
	@Autowired
	private IComptesRepository repository;

	public IComptesRepository getRepository() {
		return repository;
	}

	public void setRepository(IComptesRepository repository) {
		this.repository = repository;
	}

	@Override
	public BigDecimal consulterSolde(String numero) {
		// Simulon une règle qui stipule que les comptes C% seront bonifiés de 10 %

		Compte compte = repository.findById(numero);
		return (compte.getNumero().startsWith("C")) ? compte.getSolde().multiply(new BigDecimal("1.1"))
				: compte.getSolde();

	}

}
