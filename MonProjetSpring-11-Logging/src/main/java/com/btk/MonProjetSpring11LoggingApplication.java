package com.btk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MonProjetSpring11LoggingApplication {

	//on aurait du mettre @Autowired par ce que c'est un singleton or il y'a plusieurs implémentations
	//de la classe Logger et delà il faut indiquer l'implémentation par code
	private Logger log = LoggerFactory.getLogger(MonProjetSpring11LoggingApplication.class)  ;
	
	
	public static void main(String[] args) {
		SpringApplication.run(MonProjetSpring11LoggingApplication.class, args);
	}
	
	
	
	@Bean
	public CommandLineRunner runIt()
	{
		return args ->{
			//niveaux des messages log : FATAL  > ERROR  > WARN > DEBUG > TRACE
			log.warn("Voici mon message d'info Log ... ");
		};
	}
}
