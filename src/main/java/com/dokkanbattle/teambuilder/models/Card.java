package com.dokkanbattle.teambuilder.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "Cards")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Card {
	
	@Id
	@Field("_id")
	private String _id;
	
	@Field("name")
	private String name;
	
	@Field("rarity")
	private String rarity;
	
	@Field("type")
	private String type;
	
	@Field("color")
	private String color;
	
	@Field("leader_skill")
	private String leader_skill;
	
	@Field("transformation_condition")
	private String transformation_condition;
	
	@Field("transformation")
	private boolean transformation;
	
	@Field("super_atk")
	private List<SuperAtk> superAtk; 
	
	@Field("passive_skill")
	private PassiveSkill passive_skill;
	
	@Field("active_skill")
	private PassiveSkill active_skill;
	
	@Field("link_skill")
	private List<String> linkSkills;
	
	@Field("category")
	private List<String> categories;
	
	public String toString() {
		return "Card [name=" + name + ", rarity=" + rarity + ", type=" + type + ", color=" + color
				+ ", leader_skill=" + leader_skill + ", transformation_condition=" + transformation_condition
				+ ", transformation=" + transformation + ", superAtk=" + superAtk + ", passive_skill=" + passive_skill + ", active_skill=" + active_skill
				+ ", linkSkills=" + linkSkills + ", categories=" + categories + "]";
	}
}