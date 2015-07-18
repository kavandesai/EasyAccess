package challenge.praxify.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import challenge.praxify.app.bo.Patient;

public interface PatientRepository extends MongoRepository<Patient, String> {
	public Patient findByUserName(String name);
}
