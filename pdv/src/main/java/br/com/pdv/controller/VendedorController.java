package br.com.pdv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.pdv.repository.VendedorRepository;

@Controller
public class VendedorController {

	@Autowired
	private VendedorRepository vendedorRepository; //cria uma instância do nosso repositório
	
	@GetMapping ({"/vendedores"}) //É o nome que eu escolher
	public String home(ModelMap model) {
		
		//o findAll lista todos os produtos
		model.addAttribute("vendedores", vendedorRepository.findAll());
		return "vendedores"; // é o nome do arquivo real
	}
	
	
}
