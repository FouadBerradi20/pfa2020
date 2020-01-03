package org.sambasoft.controllers;

import java.io.IOException;
import java.util.List;

import org.sambasoft.entities.Employe;
import org.sambasoft.repositories.EmployeRepository;
import org.sambasoft.services.Qrcode;
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

import com.google.zxing.WriterException;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class EmployeController {
	private static final String path = "D:\\IIR5\\pfa2020\\stage\\src\\main\\resources\\static\\qrcode\\";
	@Autowired
	private EmployeRepository employeRepository;

	@GetMapping("/employees")
	public List<Employe> getEmployees() {
		return employeRepository.findAll();
	}

	@GetMapping("/employe/{id}")
	public Employe getEmploye(@PathVariable Long id) {
		return employeRepository.findOne(id);
	}

	@DeleteMapping("/employe/{id}")
	public boolean deleteEmploye(@PathVariable Long id) {
		employeRepository.delete(id);
		return true;
	}

	@PutMapping("/employe")
	public Employe updateEmploye(@RequestBody Employe employe) {
		return employeRepository.save(employe);
	}

	@PostMapping("/employe")
	public Employe createEmploye(@RequestBody Employe employe) {
		String randomS = Qrcode.generateRandomText();
        try {
        	String url = path+randomS+".png";
        	Qrcode.generateQRCodeImage(employe.getNom(), 350, 350, url);
        } catch (WriterException e) {
            System.out.println("Could not generate QR Code, WriterException :: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Could not generate QR Code, IOException :: " + e.getMessage());
        }
        employe.setQrurl(randomS);
		return employeRepository.save(employe);
	}
	
	

}
