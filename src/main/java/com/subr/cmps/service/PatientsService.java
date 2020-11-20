package com.subr.cmps.service;

import org.springframework.stereotype.Service;

import com.subr.cmps.dto.PatientDTO;

@Service
public interface PatientsService {

	String getAllPatients();

	String addPatient(PatientDTO patient);

	String getPatientByName(String name);

	
}
