package com.dashboard.commondashboard;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PianificationRepository extends MongoRepository<Pianification, String> {

    List<Pianification> findByTestSetConfIdIn(List<Integer> ids);

}

