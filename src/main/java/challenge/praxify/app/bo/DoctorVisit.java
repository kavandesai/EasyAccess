package challenge.praxify.app.bo;

import java.util.Date;
import java.util.List;

public class DoctorVisit {
	private Date lastVisit;
	private String cause;
	private List<Attaichment> attaichments;
	private DoctorInfo doctorInfo;
	public Date getLastVisit() {
		return lastVisit;
	}
	public void setLastVisit(Date lastVisit) {
		this.lastVisit = lastVisit;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public List<Attaichment> getAttaichments() {
		return attaichments;
	}
	public void setAttaichments(List<Attaichment> attaichments) {
		this.attaichments = attaichments;
	}
	public DoctorInfo getDoctorInfo() {
		return doctorInfo;
	}
	public void setDoctorInfo(DoctorInfo doctorInfo) {
		this.doctorInfo = doctorInfo;
	}

}
