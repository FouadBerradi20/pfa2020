package org.sambasoft.controllers;

import java.util.List;

import org.sambasoft.entities.Demande;
import org.sambasoft.repositories.DemandeRepository;
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
public class DemandeController {
	
	@Autowired
	private DemandeRepository DemandeRepository;

	@GetMapping("/demandes")
	public List<Demande> getdemandes() {
		return DemandeRepository.findAll();
	}

	@GetMapping("/Demande/{id}")
	public Demande getDemande(@PathVariable Long id) {
		return DemandeRepository.findOne(id);
	}

	@DeleteMapping("/Demande/{id}")
	public boolean deleteDemande(@PathVariable Long id) {
		DemandeRepository.delete(id);
		return true;
	}

	@PutMapping("/Demande")
	public Demande updateDemande(@RequestBody Demande Demande) {
		return DemandeRepository.save(Demande);
	}

	@PostMapping("/Demande")
	public Demande createDemande(@RequestBody Demande Demande) {
		return DemandeRepository.save(Demande);
	}
	

}
