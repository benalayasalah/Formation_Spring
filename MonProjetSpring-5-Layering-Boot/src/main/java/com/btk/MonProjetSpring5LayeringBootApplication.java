package com.btk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.btk.client.ClientConsole;

@SpringBootApplication
public class MonProjetSpring5LayeringBootApplication {

	@Autowired
	private ClientConsole client;

	public static void main(String[] args) {
		SpringApplication.run(MonProjetSpring5LayeringBootApplication.class, args);
	}

	@Bean
	public CommandLineRunner runit() {

		return args -> {
			System.out.println("*****Execute Aprés le Démarrage de Boot*****");
			System.out.println("Obtenu avec Boot : Le Solde est :" + client.getBusiness().consulterSolde("C1000"));
		};
	}

}
