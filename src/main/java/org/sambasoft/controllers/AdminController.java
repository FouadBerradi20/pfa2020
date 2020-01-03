package org.sambasoft.controllers;

import java.util.List;

import org.sambasoft.entities.Admin;
import org.sambasoft.repositories.AdminRepository;
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
public class AdminController {
	
	@Autowired
	private AdminRepository AdminRepository;

	@GetMapping("/admins")
	public List<Admin> getadmins() {
		return AdminRepository.findAll();
	}

	@GetMapping("/Admin/{id}")
	public Admin getAdmin(@PathVariable Long id) {
		return AdminRepository.findOne(id);
	}

	@DeleteMapping("/Admin/{id}")
	public boolean deleteAdmin(@PathVariable Long id) {
		AdminRepository.delete(id);
		return true;
	}

	@PutMapping("/Admin")
	public Admin updateAdmin(@RequestBody Admin Admin) {
		return AdminRepository.save(Admin);
	}

	@PostMapping("/Admin")
	public Admin createAdmin(@RequestBody Admin Admin) {
		return AdminRepository.save(Admin);
	}

}
