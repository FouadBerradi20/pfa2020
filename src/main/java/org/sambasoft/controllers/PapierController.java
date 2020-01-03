package org.sambasoft.controllers;

import java.util.List;

import org.sambasoft.entities.Papier;
import org.sambasoft.repositories.PapierRepository;
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
public class PapierController {
	
	@Autowired
	private PapierRepository papierRepository;

	@GetMapping("/papiers")
	public List<Papier> getPapiers() {
		return papierRepository.findAll();
	}

	@GetMapping("/papier/{id}")
	public Papier getPapier(@PathVariable Long id) {
		return papierRepository.findOne(id);
	}

	@DeleteMapping("/papier/{id}")
	public boolean deletePapier(@PathVariable Long id) {
		papierRepository.delete(id);
		return true;
	}

	@PutMapping("/papier")
	public Papier updatePapier(@RequestBody Papier papier) {
		return papierRepository.save(papier);
	}

	@PostMapping("/papier")
	public Papier createPapier(@RequestBody Papier papier) {
		return papierRepository.save(papier);
	}
	

}
