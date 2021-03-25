package com.dokkanbattle.teambuilder.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SuperAtk {

	private String name;
	private String effect;
	
	@Override
	public String toString() {
		return "SuperAtk [name=" + name + ", effect=" + effect + "]";
	}
	
}
