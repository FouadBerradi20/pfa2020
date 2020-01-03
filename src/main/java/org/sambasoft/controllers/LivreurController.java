package org.sambasoft.controllers;

import java.util.List;

import org.sambasoft.entities.Livreur;
import org.sambasoft.repositories.LivreurRepository;
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
public class LivreurController {
	@Autowired
	private LivreurRepository LivreurRepository;

	@GetMapping("/livreurs")
	public List<Livreur> getlivreurs() {
		return LivreurRepository.findAll();
	}

	@GetMapping("/Livreur/{id}")
	public Livreur getLivreur(@PathVariable Long id) {
		return LivreurRepository.findOne(id);
	}

	@DeleteMapping("/Livreur/{id}")
	public boolean deleteLivreur(@PathVariable Long id) {
		LivreurRepository.delete(id);
		return true;
	}

	@PutMapping("/Livreur")
	public Livreur updateLivreur(@RequestBody Livreur Livreur) {
		return LivreurRepository.save(Livreur);
	}

	@PostMapping("/Livreur")
	public Livreur createLivreur(@RequestBody Livreur Livreur) {
		return LivreurRepository.save(Livreur);
	}

}
