package com.dashboard.commondashboard;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface ChartItemRepository extends MongoRepository<ChartItem, String> {

}
