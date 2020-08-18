package com.finalterm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@Entity
@Table(name="patient_tbl")
public class patient {
	
@Id
@GeneratedValue
private int patientID;
	private String patientfname;
	private String patientlname;
	private int patientage;
	private String patientgender;
	private String patientdayadmitted;
	private Boolean patientdischargestatus;
	private String patientdaydischarge;
	private String patientproblem;
	public int getPatientID() {
		return patientID;
	}
	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	public String getPatientfname() {
		return patientfname;
	}
	public void setPatientfname(String patientfname) {
		this.patientfname = patientfname;
	}
	public String getPatientlname() {
		return patientlname;
	}
	public void setPatientlname(String patientlname) {
		this.patientlname = patientlname;
	}
	public int getPatientage() {
		return patientage;
	}
	public void setPatientage(int patientage) {
		this.patientage = patientage;
	}
	public String getPatientgender() {
		return patientgender;
	}
	public void setPatientgender(String patientgender) {
		this.patientgender = patientgender;
	}
	public String getPatientdayadmitted() {
		return patientdayadmitted;
	}
	public void setPatientdayadmitted(String patientdayadmitted) {
		this.patientdayadmitted = patientdayadmitted;
	}
	public Boolean getPatientdischargestatus() {
		return patientdischargestatus;
	}
	public void setPatientdischargestatus(Boolean patientdischargestatus) {
		this.patientdischargestatus = patientdischargestatus;
	}
	public String getPatientdaydischarge() {
		return patientdaydischarge;
	}
	public void setPatientdaydischarge(String patientdaydischarge) {
		this.patientdaydischarge = patientdaydischarge;
	}
	public String getPatientproblem() {
		return patientproblem;
	}
	public void setPatientproblem(String patientproblem) {
		this.patientproblem = patientproblem;
	}
	
	


}
