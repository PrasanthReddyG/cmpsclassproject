package com.subr.cmps.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subr.cmps.dao.Patient;
@Repository
public interface PatientsRespository extends JpaRepository<Patient, Long> {

	Optional<Patient> findByFirstName(String name);

}
