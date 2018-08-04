package com.dashboard.commondashboard;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {

	Account findByUsername(String username);

}
