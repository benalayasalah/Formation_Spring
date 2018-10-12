package com.btk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.btk.domain.Compte;

public interface ICompteRepository extends JpaRepository<Compte, String> {

}
