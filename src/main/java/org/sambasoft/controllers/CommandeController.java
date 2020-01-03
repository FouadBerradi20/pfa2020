package org.sambasoft.controllers;

import java.util.List;

import org.sambasoft.entities.Commande;
import org.sambasoft.repositories.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class CommandeController {
	
	@Autowired
	private CommandeRepository CommandeRepository;

	
	@GetMapping("/commandes")
	public List<Commande> getcommandes() {
		return CommandeRepository.findAll();
	}

	@GetMapping("/Commande/{id}")
	public Commande getCommande(@PathVariable Long id) {
		return CommandeRepository.getOne(id);
	}

	@DeleteMapping("/Commande/{id}")
	public boolean deleteCommande(@PathVariable Long id) {
		CommandeRepository.delete(id);
		return true;
	}

	@PutMapping("/Commande")
	public Commande updateCommande(@RequestBody Commande Commande) {
		return CommandeRepository.save(Commande);
	}

	@PostMapping("/Commande")
	public Commande createCommande(@RequestBody Commande Commande) {
		return CommandeRepository.save(Commande);
	}
	
	
	@GetMapping(value = "/bypersonne")
	public Object[] getNbrcmdByPersonne() {
		return CommandeRepository.getNbrcmdByPersonne();
	}
	
	
	

}
