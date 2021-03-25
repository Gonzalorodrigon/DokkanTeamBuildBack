package com.dokkanbattle.teambuilder.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.dokkanbattle.teambuilder.models.Category;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String>{
	
	@Query("{ 'name' : ?0 }")
	Category findByName(String name);
}
