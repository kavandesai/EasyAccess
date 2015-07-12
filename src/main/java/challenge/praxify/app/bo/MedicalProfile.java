package challenge.praxify.app.bo;

import java.util.List;

public class MedicalProfile {
	private Gender geder;
	private List<DoctorVisit> doctorVisit;
	private BloodGroup bloodGroup;
	private int age;
	private boolean isDiabetic;
	public List<DoctorVisit> getDoctorVisit() {
		return doctorVisit;
	}
	public void setDoctorVisit(List<DoctorVisit> doctorVisit) {
		this.doctorVisit = doctorVisit;
	}
	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isDiabetic() {
		return isDiabetic;
	}
	public void setDiabetic(boolean isDiabetic) {
		this.isDiabetic = isDiabetic;
	}
	public Gender getGeder() {
		return geder;
	}
	public void setGeder(Gender geder) {
		this.geder = geder;
	}
} 
