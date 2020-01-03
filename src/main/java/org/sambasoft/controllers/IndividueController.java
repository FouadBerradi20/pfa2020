package org.sambasoft.controllers;

import java.util.List;

import org.sambasoft.entities.Individue;
import org.sambasoft.repositories.IndividueRepository;
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
public class IndividueController {
	
	@Autowired
	private IndividueRepository IndividueRepository;

	@GetMapping("/individues")
	public List<Individue> getindividues() {
		return IndividueRepository.findAll();
	}

	@GetMapping("/Individue/{id}")
	public Individue getIndividue(@PathVariable Long id) {
		return IndividueRepository.findOne(id);
	}

	@DeleteMapping("/Individue/{id}")
	public boolean deleteIndividue(@PathVariable Long id) {
		IndividueRepository.delete(id);
		return true;
	}

	@PutMapping("/Individue")
	public Individue updateIndividue(@RequestBody Individue Individue) {
		return IndividueRepository.save(Individue);
	}

	@PostMapping("/Individue")
	public Individue createIndividue(@RequestBody Individue Individue) {
		return IndividueRepository.save(Individue);
	}

}
