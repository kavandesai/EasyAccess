package challenge.praxify.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import challenge.praxify.app.bo.Patient;

public interface PatientRepository extends MongoRepository<Patient, String> {

}
