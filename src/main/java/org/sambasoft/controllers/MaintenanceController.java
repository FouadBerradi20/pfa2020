package org.sambasoft.controllers;


import java.util.List;

import org.sambasoft.entities.Maintenance;
import org.sambasoft.repositories.MaintenanceRepository;
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

public class MaintenanceController {

	@Autowired
	private MaintenanceRepository maintenanceRepository;

	@GetMapping("/maintenances")
	public List<Maintenance> getMaintenances() {
		return maintenanceRepository.findAll();
	}

	@GetMapping("/maintenance/{id}")
	public Maintenance getMaintenance(@PathVariable Long id) {
		return maintenanceRepository.findOne(id);
	}

	@DeleteMapping("/maintenance/{id}")
	public boolean deleteMaintenance(@PathVariable Long id) {
		maintenanceRepository.delete(id);
		return true;
	}

	@PutMapping("/maintenance")
	public Maintenance updateMaintenance(@RequestBody Maintenance maintenance) {
		return maintenanceRepository.save(maintenance);
	}

	@PostMapping("/maintenance")
	public Maintenance createMaintenance(@RequestBody Maintenance maintenance) {
		return maintenanceRepository.save(maintenance);
	}
}
