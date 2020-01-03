package org.sambasoft.controllers;

import java.util.List;

import org.sambasoft.entities.Conge;
import org.sambasoft.repositories.CongeRepository;
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
public class CongeController {
	
	@Autowired
	private CongeRepository congeRepository;

	@GetMapping("/conges")
	public List<Conge> getConges() {
		return congeRepository.findAll();
	}

	@GetMapping("/conge/{id}")
	public Conge getConge(@PathVariable Long id) {
		return congeRepository.findOne(id);
	}

	@DeleteMapping("/conge/{id}")
	public boolean deleteConge(@PathVariable Long id) {
		congeRepository.delete(id);
		return true;
	}

	@PutMapping("/conge")
	public Conge updateConge(@RequestBody Conge conge) {
		return congeRepository.save(conge);
	}

	@PostMapping("/conge")
	public Conge createUser(@RequestBody Conge conge) {
		return congeRepository.save(conge);
	}
	

}
