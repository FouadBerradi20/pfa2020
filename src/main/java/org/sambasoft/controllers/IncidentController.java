package org.sambasoft.controllers;
import java.util.List;

import org.sambasoft.entities.Incident;
import org.sambasoft.repositories.IncidentRepository;
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
public class IncidentController {
	
	@Autowired
	private IncidentRepository incidentRepository;

	@GetMapping("/incidents")
	public List<Incident> getIncidents() {
		return incidentRepository.findAll();
	}

	@GetMapping("/incident/{id}")
	public Incident getIncident(@PathVariable Long id) {
		return incidentRepository.findOne(id);
	}

	@DeleteMapping("/incident/{id}")
	public boolean deleteIncident(@PathVariable Long id) {
		incidentRepository.delete(id);
		return true;
	}

	@PutMapping("/incident")
	public Incident updateIncident(@RequestBody Incident incident) {
		return incidentRepository.save(incident);
	}

	@PostMapping("/incident")
	public Incident createIncident(@RequestBody Incident incident) {
		return incidentRepository.save(incident);
	}
	
}
