package com.dashboard.commondashboard;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface DataRowRepository extends MongoRepository<DataRow, String>{
	
	@Query("{_class: ?0 , configurationIndex: { $in: ?1 }, recordDate: { $gte: ?2 } }")
	List<DataRow> findEntitiesWihtConfigurationIndex(String _class, List<Integer> ids, String recordDate);
	
	@Query("{_class: ?0 }")
	List<DataRow> findEntities(String _class);

	List<DataRow> deleteByRecordDateLessThan(String recordDate);


	

}
