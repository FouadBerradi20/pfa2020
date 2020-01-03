package org.sambasoft.controllers;

import java.util.List;

import org.sambasoft.entities.Reclamation;
import org.sambasoft.repositories.ReclamationRepository;
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
public class ReclamationController {
	
	
	@Autowired
	private ReclamationRepository ReclamationRepository;

	@GetMapping("/reclamations")
	public List<Reclamation> getreclamations() {
		return ReclamationRepository.findAll();
	}

	@GetMapping("/Reclamation/{id}")
	public Reclamation getReclamation(@PathVariable Long id) {
		return ReclamationRepository.findOne(id);
	}

	@DeleteMapping("/Reclamation/{id}")
	public boolean deleteReclamation(@PathVariable Long id) {
		ReclamationRepository.delete(id);
		return true;
	}

	@PutMapping("/Reclamation")
	public Reclamation updateReclamation(@RequestBody Reclamation Reclamation) {
		return ReclamationRepository.save(Reclamation);
	}

	@PostMapping("/Reclamation")
	public Reclamation createReclamation(@RequestBody Reclamation Reclamation) {
		return ReclamationRepository.save(Reclamation);
	}

}
