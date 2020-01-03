package org.sambasoft.controllers;

import java.util.List;

import org.sambasoft.entities.Client;
import org.sambasoft.repositories.ClientRepository;
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
public class ClientController {
	
	@Autowired
	private ClientRepository clientRepository;

	@GetMapping("/clients")
	public List<Client> getClients() {
		return clientRepository.findAll();
	}

	@GetMapping("/client/{id}")
	public Client getClient(@PathVariable Long id) {
		return clientRepository.findOne(id);
	}

	@DeleteMapping("/client/{id}")
	public boolean deleteClient(@PathVariable Long id) {
		clientRepository.delete(id);
		return true;
	}

	@PutMapping("/client")
	public Client updateClient(@RequestBody Client client) {
		return clientRepository.save(client);
	}

	@PostMapping("/client")
	public Client createClient(@RequestBody Client client) {
		return clientRepository.save(client);
	}
	

}
