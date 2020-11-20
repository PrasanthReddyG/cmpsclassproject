package com.subr.cmps.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.subr.cmps.dao.Patient;
import com.subr.cmps.dto.PatientDTO;
import com.subr.cmps.repository.PatientsRespository;
import com.subr.cmps.service.PatientsService;
import com.subr.cmps.util.ErrorResponse;

@Service
public class PatientsServiceImpl implements PatientsService {

	@Autowired
	PatientsRespository patientsRespository;
	@Override
	public String getAllPatients() {
		
		List<Patient> patientsList = patientsRespository.findAll();
		
		Gson json =new Gson();
		
		return json.toJson(patientsList);
	}
	@Override
	public String addPatient(PatientDTO patient) {
		
		Patient patientDto= new Patient(); 
		BeanUtils.copyProperties(patient,patientDto );
		
		 Patient save = patientsRespository.save(patientDto);
		 
		 Gson json= new Gson();
		 ErrorResponse errorResponse =new ErrorResponse();
		 if(save.getId()>0)
		 {
			 errorResponse.setErrorResponse("SUCCESS");
		 	 return json.toJson(errorResponse);
		 }
		 else
		 {
			
			 errorResponse.setErrorResponse("FAIL");
			 return json.toJson(errorResponse);
		 }
	}
	@Override
	public String getPatientByName(String name) {
		 Optional<Patient> dao = patientsRespository.findByFirstName(name);
		PatientDTO patientDto = new PatientDTO();
		Gson json= new Gson();
		if(!dao.isPresent())
		{
			System.out.println(dao);
			ErrorResponse errorResponse = new ErrorResponse();
			errorResponse.setErrorResponse("FAIL");
			return json.toJson(errorResponse);
		}
			
		BeanUtils.copyProperties(dao.get(), patientDto);
		
		System.out.println(patientDto);
		return json.toJson(patientDto);
	}

}
