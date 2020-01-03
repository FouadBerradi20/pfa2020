package org.sambasoft.controllers;

import java.util.List;

import org.sambasoft.entities.Personne;
import org.sambasoft.repositories.PersonneRepository;
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
public class PersonneController {
	
	@Autowired
	private PersonneRepository PersonneRepository;

	@GetMapping("/personnes")
	public List<Personne> getpersonnes() {
		return PersonneRepository.findAll();
	}

	@GetMapping("/Personne/{id}")
	public Personne getPersonne(@PathVariable Long id) {
		return PersonneRepository.findOne(id);
	}

	@DeleteMapping("/Personne/{id}")
	public boolean deletePersonne(@PathVariable Long id) {
		PersonneRepository.delete(id);
		return true;
	}

	@PutMapping("/Personne")
	public Personne updatePersonne(@RequestBody Personne Personne) {
		return PersonneRepository.save(Personne);
	}

	@PostMapping("/Personne")
	public Personne createPersonne(@RequestBody Personne Personne) {
		return PersonneRepository.save(Personne);
	}

}
