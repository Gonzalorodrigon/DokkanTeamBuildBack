package com.dokkanbattle.teambuilder.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Document(collection = "Model")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class NewModel {
	
	@Field(name = "name")
	private String name;
	
	@Field(name = "effect")
	private Effect effect;

    @Field(name = "effect")
	private Effect secondEffect;

    @Field(name = "effect")
	private Effect thirdEffec;
	
	@Override
	public String toString() {
		return "Model [name=" + name + ", effect=" + effect + "]";
	}
}