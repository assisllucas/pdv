package br.com.pdv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.pdv.repository.ProdutoRepository;

@Controller
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository; //cria uma instância do nosso repositório
	
	@GetMapping ({"/produtos"}) //É o nome que eu escolher
	public String home(ModelMap model) {
		
		//o findAll lista todos os produtos
		model.addAttribute("produtos", produtoRepository.findAll());
		return "produtos"; // é o nome do arquivo real
	}
	
	
}
