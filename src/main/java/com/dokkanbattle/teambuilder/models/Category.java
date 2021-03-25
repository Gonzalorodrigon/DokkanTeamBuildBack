package com.dokkanbattle.teambuilder.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Document(collection = "Categories")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Category {
	
	@Id
	private String _id;
	
	@Field("name")
	private String name;
	
	@Field("description")
	private String description;
	
	private String leader;
	private String sub_leader;
	private List<Card> cards;
	
	@Override
	public String toString() {
		return "Category [name=" + name + ", description=" + description + ", leader=" + leader + ", sub_leader="
				+ sub_leader + ", cards=" + cards + "]";
	}
}
