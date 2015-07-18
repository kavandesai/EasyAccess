package challenge.praxify.app.repository;

import org.springframework.stereotype.Repository;

import challenge.praxify.app.bo.Patient;

@Repository
public interface PatientCustomRepository  {

	Patient findOne(String id);

}
