package com.btk.business;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btk.domain.Compte;
import com.btk.repository.ICompteRepository;



@Service
public class CompteBusinessImpl implements ICompteBusiness {

	@Autowired
	private ICompteRepository repository;

	@Override
	public void ouvrir(Compte c) throws Exception {
		
		Optional<Compte> resultat = repository.findById(c.getNumero());
		if (resultat.isPresent()) {
			throw new Exception("Compte Existant!");
		}
		else
			
		repository.save(c);
	}

	@Override
	public List<Compte> tousLesComptes() {
		return repository.findAll();
	}

	@Override
	public BigDecimal consulterSolde(String numero) {
		Optional<Compte> resultat = repository.findById(numero);
		return resultat.isPresent() ? resultat.get().getSolde() : new BigDecimal(Long.MIN_VALUE);

	}

	@Override
	public void cloturerCompte(String numero) {
		Optional<Compte> resultat = repository.findById(numero);
		if (resultat.isPresent()) {
			repository.delete(resultat.get());
		}
	}

}
