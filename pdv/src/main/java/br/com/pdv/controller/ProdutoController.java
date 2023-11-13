package br.com.pdv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.pdv.repository.ProdutoRepository;

public class ProdutoController {

	@Autowired
	private LojaRepository lojaRepository; //cria uma instância do nosso repositório
	
	@GetMapping ({"/lojas"}) //É o nome que eu escolher
	public String home(ModelMap model) {
		
		//o findAll lista todas lojas
		model.addAttribute("lojas", lojaRepository.findAll());
		return "lojas"; // é o nome do arquivo real
	}
	
	
}
