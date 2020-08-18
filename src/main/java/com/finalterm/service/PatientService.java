package com.finalterm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalterm.entity.patient;
import com.finalterm.repository.PatientRepository;

@Service
public class PatientService {
 @Autowired
	private PatientRepository repository;


public patient savepatient(patient patient) {
	
return repository.save(patient);
}

public List<patient> savepatients(List<patient> patients) {
	
return repository.saveAll(patients);
}

public List<patient> getpatients() {
    return repository.findAll();
}

public patient getpatientById(int patientid) {
    return repository.findById(patientid).orElse(null);
}

public patient getpatientByName(String patientfname) {
    return repository.findByName(patientfname);
}

public String deleteProduct(int patientid) {
    repository.deleteById(patientid);
    return "product removed !! " + patientid;
}

public patient updatepatient(patient patient) {
    patient existingpatient = repository.findById(patient.getPatientID()).orElse(null);
    existingpatient.setPatientfname(patient.getPatientfname());
    existingpatient.setPatientlname(patient.getPatientlname());
    existingpatient.setPatientage(patient.getPatientage());
    existingpatient.setPatientgender(patient.getPatientgender());
    
    
    existingpatient.setPatientdayadmitted(patient.getPatientdayadmitted());
    existingpatient.setPatientdischargestatus(patient.getPatientdischargestatus());
    existingpatient.setPatientdaydischarge(patient.getPatientdaydischarge());
    existingpatient.setPatientproblem(patient.getPatientproblem());
   
    return repository.save(existingpatient);
}

public String deletepatient(int patientid) {
	// TODO Auto-generated method stub
	return null;
}






}
