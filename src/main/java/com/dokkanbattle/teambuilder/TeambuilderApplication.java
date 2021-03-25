package com.dokkanbattle.teambuilder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories()
public class TeambuilderApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeambuilderApplication.class, args);
	}
}
