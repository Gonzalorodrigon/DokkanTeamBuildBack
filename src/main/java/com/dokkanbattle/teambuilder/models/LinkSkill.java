package com.dokkanbattle.teambuilder.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Document(collection = "LinkSkills")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LinkSkill {
	
	@Field(name = "name")
	private String name;
	
	@Field(name = "effect")
	private Effect effect;
	
	@Override
	public String toString() {
		return "LinkSkill [name=" + name + ", effect=" + effect + "]";
	}
}