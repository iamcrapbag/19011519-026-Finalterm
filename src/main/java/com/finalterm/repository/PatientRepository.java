package com.finalterm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalterm.entity.patient;

public interface PatientRepository extends JpaRepository <patient,Integer> {

	
	patient findByName(String patientfname);
	
}
