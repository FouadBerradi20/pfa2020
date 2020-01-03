package org.sambasoft.controllers;

import java.util.List;
import org.sambasoft.entities.Vehicule;
import org.sambasoft.repositories.VehiculeRepository;
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
public class VehiculeController {

	@Autowired
	private VehiculeRepository vehiculeRepository;

	@GetMapping("/vehicules")
	public List<Vehicule> getVehicules() {
		return vehiculeRepository.findAll();
	}

	@GetMapping("/vehicule/{id}")
	public Vehicule getVehicule(@PathVariable Long id) {
		return vehiculeRepository.findOne(id);
	}

	@DeleteMapping("/vehicule/{id}")
	public boolean deleteVehicule(@PathVariable Long id) {
		vehiculeRepository.delete(id);
		return true;
	}

	@PutMapping("/vehicule")
	public Vehicule updateVehicule(@RequestBody Vehicule vehicule) {
		return vehiculeRepository.save(vehicule);
	}

	@PostMapping("/vehicule")
	public Vehicule createVehicule(@RequestBody Vehicule vehicule) {
		return vehiculeRepository.save(vehicule);
	}
	
}
