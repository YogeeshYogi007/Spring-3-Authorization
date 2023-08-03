package com.cg.details.UserRelated;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepo extends MongoRepository<Client, Integer>{

	Client findByName(String name);

}
