package com.btk.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.btk.business.ICompteBusiness;
import com.btk.domain.Compte;

@RestController
@RequestMapping("/compte")
public class CompteRestController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ICompteBusiness business;

	@GetMapping()
	public List<Compte> tousLesComptes() {
		return business.tousLesComptes();
	}

	@PostMapping
	public ResponseEntity<Compte> ouvrirCompte(@RequestBody Compte c) {
		try {
			business.ouvrir(c);
			return new ResponseEntity<Compte>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			logger.error("Il y'a eu lieu erreur " + logger.getName());
			return new ResponseEntity<Compte>(c, HttpStatus.CONFLICT);
		}
	}

}
