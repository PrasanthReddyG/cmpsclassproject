package com.subr.cmps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.subr.cmps.dto.PatientDTO;
import com.subr.cmps.service.PatientsService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class MainController {
	
	@Autowired
	PatientsService patientsService;
	
	@GetMapping("/getAllPatients")
	public String getAllPatients() {
		return patientsService.getAllPatients();
	}
	@PostMapping("/addPatient")	
	public String addPatient(@RequestBody PatientDTO patient) {
		return patientsService.addPatient(patient);
		
	}
	@GetMapping("/getPatientByName/{name}")	
	public String getPatientByName(@PathVariable String name) {
		return patientsService.getPatientByName(name);
		
	}
		
	
}
