package challenge.praxify.app.builder;

import challenge.praxify.app.bo.MedicalProfile;
import challenge.praxify.app.bo.Patient;

public class PatientBuilder {
	
	private Patient patient;
	public PatientBuilder() {
		this.patient = new Patient();
	}
	
	public PatientBuilder UIDAI(String uidai) {
		patient.setUIDAI(uidai);
		return this;
	}
	
	public PatientBuilder medicalProfile(MedicalProfile medicalProfile) {
		patient.setMedicalProfile(null);
		return this;
	}
	
	public Patient build() {
		return patient;
	}
	
	
}
