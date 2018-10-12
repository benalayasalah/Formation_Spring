package com.btk.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSecurityController {

	@GetMapping("/secret")
	public String actionSecrete() {
		return "Ceci est un secret, Gardez-le!!!!!!";
	}

	@GetMapping("/public")
	public String actionPublique() {
		return "Ceci est de l'ordre publique";
	}

}
