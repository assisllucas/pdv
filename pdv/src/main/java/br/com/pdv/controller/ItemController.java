package br.com.pdv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.pdv.repository.ItemRepository;


@Controller
public class ItemController {

	@Autowired
	private ItemRepository itemRepository; //cria uma instância do nosso repositório
	
	@GetMapping ({"/itens"}) //É o nome que eu escolher
	public String home(ModelMap model) {
		
		//o findAll lista todas itens
		model.addAttribute("itens", itemRepository.findAll());
		return "itens"; // é o nome do arquivo real
	}
	
	
}
