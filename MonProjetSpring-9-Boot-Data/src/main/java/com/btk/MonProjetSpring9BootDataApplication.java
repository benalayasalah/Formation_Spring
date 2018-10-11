package com.btk;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.btk.domain.Compte;
import com.btk.repository.IComptesRepository;

@SpringBootApplication
public class MonProjetSpring9BootDataApplication {

	@Autowired
	private IComptesRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(MonProjetSpring9BootDataApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner runIt() {
		return args ->  {
			repository.save(new Compte("C5000","Med Romdhani",new BigDecimal("5000")));
			repository.findAll().forEach(System.out::println);
		};
	}
	
}
