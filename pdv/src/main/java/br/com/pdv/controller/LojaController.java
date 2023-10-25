package br.com.pdv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LojaController {

	@GetMapping ({"/lojas"}) //É o nome que eu escolher
	public String home(String username) {
		
		return "lojas"; // é o nome do arquivo real
	}
	
	
}
