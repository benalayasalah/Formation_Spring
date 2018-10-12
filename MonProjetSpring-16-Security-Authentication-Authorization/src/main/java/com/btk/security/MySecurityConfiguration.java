package com.btk.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class MySecurityConfiguration extends WebSecurityConfigurerAdapter{

	
	
	@Bean
	public BCryptPasswordEncoder encoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	//Règles de l'Authentification


 	@Override
 	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
 		
 		// enable in memory based authentication with a user named "user" and "admin"
 		auth.inMemoryAuthentication()
 		.withUser("salah").password(encoder().encode("password")).roles("USER","ADMIN")
 		.and()
 		.withUser("nizar").password(encoder().encode("password")).roles("USER")
 		.and()
 		.withUser("Med").password(encoder().encode("password")).roles("VISITEUR")
 		.and()
 		.withUser("kamel").password(encoder().encode("password")).roles("USER", "ADMIN");
 	}

	
	
	//Règles de l'Autorisation
	
	
 	@Override
 	protected void configure(HttpSecurity http) throws Exception {
 		http.authorizeRequests()
 		.antMatchers("/public/**").hasRole("USER")  //.permitAll()
 		.antMatchers("/secret/**").hasRole("ADMIN") 
 		//.anyRequest().hasRole("ADMIN")
 		.and()
 				// Possibly more configuration ...
 				//.formLogin() // enable form based log in
 				// set permitAll for all URLs associated with Form Login
 				//.permitAll();
 		.httpBasic();
 	}

	
}
