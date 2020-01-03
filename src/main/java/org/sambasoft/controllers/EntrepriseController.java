package org.sambasoft.controllers;

import java.util.List;

import org.sambasoft.entities.Entreprise;
import org.sambasoft.repositories.EntrepriseRepository;
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

public class EntrepriseController {
	
	@Autowired
	private EntrepriseRepository EntrepriseRepository;

	@GetMapping("/entreprises")
	public List<Entreprise> getentreprises() {
		return EntrepriseRepository.findAll();
	}

	@GetMapping("/Entreprise/{id}")
	public Entreprise getEntreprise(@PathVariable Long id) {
		return EntrepriseRepository.findOne(id);
	}

	@DeleteMapping("/Entreprise/{id}")
	public boolean deleteEntreprise(@PathVariable Long id) {
		EntrepriseRepository.delete(id);
		return true;
	}

	@PutMapping("/Entreprise")
	public Entreprise updateEntreprise(@RequestBody Entreprise Entreprise) {
		return EntrepriseRepository.save(Entreprise);
	}

	@PostMapping("/Entreprise")
	public Entreprise createEntreprise(@RequestBody Entreprise Entreprise) {
		return EntrepriseRepository.save(Entreprise);
	}

}
