package com.btk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.btk.service.Calcul;

@SpringBootApplication
public class MonProjetSpring10AopApplication {

	@Autowired
	private Calcul calcul;

	public static void main(String[] args) {
		SpringApplication.run(MonProjetSpring10AopApplication.class, args);
	}

	@Bean
	public CommandLineRunner runWithout_AOP() {
		return args -> {

//			System.out.println(calcul.additionner(11, 11));
			calcul.additionner(11, 11);

//			System.out.println(calcul.diviser(11, 11));
			calcul.diviser(11, 11);
		};
	}
}
