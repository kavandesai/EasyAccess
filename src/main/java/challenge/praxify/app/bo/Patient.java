package challenge.praxify.app.bo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Patient {

	private String userName;
	@Id
	private String UIDAI;
	private MedicalProfile medicalProfile;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUIDAI() {
		return UIDAI;
	}

	public void setUIDAI(String uIDAI) {
		UIDAI = uIDAI;
	}

	public MedicalProfile getMedicalProfile() {
		return medicalProfile;
	}

	public void setMedicalProfile(MedicalProfile medicalProfile) {
		this.medicalProfile = medicalProfile;
	}

}
