package org.sambasoft.controllers;

import java.util.List;

import org.sambasoft.entities.Trajet;
import org.sambasoft.repositories.TrajetRepository;
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

public class TrajetController {
	
	@Autowired
	private TrajetRepository trajetRepository;

	@GetMapping("/trajets")
	public List<Trajet> getPapiers() {
		return trajetRepository.findAll();
	}

	@GetMapping("/trajet/{id}")
	public Trajet getTrajet(@PathVariable Long id) {
		return trajetRepository.findOne(id);
	}

	@DeleteMapping("/trajet/{id}")
	public boolean deleteTrajet(@PathVariable Long id) {
		trajetRepository.delete(id);
		return true;
	}

	@PutMapping("/trajet")
	public Trajet updateTrajet(@RequestBody Trajet trajet) {
		return trajetRepository.save(trajet);
	}

	@PostMapping("/trajet")
	public Trajet createTrajet(@RequestBody Trajet trajet) {
		return trajetRepository.save(trajet);
	}
	

}
