package com.finalterm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finalterm.entity.patient;
import com.finalterm.service.PatientService;
@RestController
public class PatientController {
	@Autowired
private PatientService service;
	

    @PostMapping("/addpatient")
    public patient addpatient(@RequestBody patient patient) {
        return service.savepatient(patient);
    }

    @PostMapping("/addpatients")
    public List<patient> addpatient(@RequestBody List<patient> patients) {
        return service.savepatients(patients);
    }

    @GetMapping("/patients")
    public List<patient> findAllpatients() {
        return service.getpatients();
    }

    @GetMapping("/patientById/{id}")
    public patient findpatientById(@PathVariable int patientid) {
        return service.getpatientById(patientid);
    }

    @GetMapping("/product/{name}")
    public patient findProductByName(@PathVariable String name) {
        return service.getpatientByName(name);
    }

    @PutMapping("/update")
    public patient updateProduct(@RequestBody patient patient) {
        return service.updatepatient(patient);
    }

    @DeleteMapping("/delete/{patientid}")
    public String deletepatient(@PathVariable int patientid) {
        return service.deletepatient(patientid);
    }
	
	
	
	
	
	
	
}
