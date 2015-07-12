package challenge.praxify.app.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import challenge.praxify.app.bo.Patient;
import challenge.praxify.app.repository.PatientRepository;

@Service
public class PatientService {
	 @Autowired
	    private PatientRepository patientRepository;
	 
	    public Patient findById(String id) {
	        return patientRepository.findOne(id);
	    }
	 
	    public List<Patient> getList() {
	        return patientRepository.findAll();
	    }
	 
	    public Patient insert(Patient patient) {
	    	return patientRepository.save(patient);
	    }
	 
	    public Patient update(Patient patient) {
	        return patientRepository.save(patient);
	    }
	 
	    public void delete(String id) {
	    	patientRepository.delete(id);
	    }

		
}
