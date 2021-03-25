package com.dokkanbattle.teambuilder.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.dokkanbattle.teambuilder.models.LinkSkill;

@Repository
public interface LinkSkillRepository extends MongoRepository<LinkSkill, String> {

	@Query("{ 'name' : ?0 }")
	LinkSkill findByName(String name);

}
