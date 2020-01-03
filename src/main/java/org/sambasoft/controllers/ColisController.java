package org.sambasoft.controllers;

import java.util.List;

import org.sambasoft.entities.Colis;
import org.sambasoft.repositories.ColisRepository;
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
public class ColisController {
	
	@Autowired
	private ColisRepository ColisRepository;

	@GetMapping("/coliss")
	public List<Colis> getcoliss() {
		return ColisRepository.findAll();
	}

	@GetMapping("/Colis/{id}")
	public Colis getColis(@PathVariable Long id) {
		return ColisRepository.findOne(id);
	}

	@DeleteMapping("/Colis/{id}")
	public boolean deleteColis(@PathVariable Long id) {
		ColisRepository.delete(id);
		return true;
	}

	@PutMapping("/Colis")
	public Colis updateColis(@RequestBody Colis Colis) {
		return ColisRepository.save(Colis);
	}

	@PostMapping("/Colis")
	public Colis createColis(@RequestBody Colis Colis) {
		return ColisRepository.save(Colis);
	}

}
