package challenge.praxify.app.bo;

public class DoctorInfo {
	private String name;
	private MedicalSpeciality speciality;
	public MedicalSpeciality getSpeciality() {
		return speciality;
	}
	public void setSpeciality(MedicalSpeciality speciality) {
		this.speciality = speciality;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
