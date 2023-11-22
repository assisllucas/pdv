package br.com.pdv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.pdv.repository.VendaRepository;

@Controller
public class VendaController {

	@Autowired
	private VendaRepository vendaRepository; //cria uma instância do nosso repositório
	
	@GetMapping ({"/vendas"}) //É o nome que eu escolher
	public String home(ModelMap model) {
		
		//o findAll lista todos os produtos
		model.addAttribute("vendas", vendaRepository.findAll());
		return "vendas"; // é o nome do arquivo real
	}
	
	
}
