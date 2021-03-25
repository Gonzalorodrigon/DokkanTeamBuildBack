package com.dokkanbattle.teambuilder.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.dokkanbattle.teambuilder.models.Card;

@Repository
public interface CardRepository extends MongoRepository<Card, String> {
	
	@Query("{ 'name' : ?0 }")
	Card findByName(String name);
	
}
