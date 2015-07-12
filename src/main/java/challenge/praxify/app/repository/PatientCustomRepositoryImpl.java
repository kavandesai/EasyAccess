package challenge.praxify.app.repository;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PatientCustomRepositoryImpl implements PatientCustomRepository {
	private MongoTemplate mongoTemplate;
	
}
