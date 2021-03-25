package com.dokkanbattle.teambuilder.models;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Effect {

	@Field("lv_1")
	private String lv_1;
	
	@Field("lv_2")
	private String lv_2;
	
	@Field("lv_3")
	private String lv_3;
	
	@Field("lv_4")
	private String lv_4;
	
	@Field("lv_5")
	private String lv_5;
	
	@Field("lv_6")
	private String lv_6;
	
	@Field("lv_7")
	private String lv_7;
	
	@Field("lv_8")
	private String lv_8;
	
	@Field("lv_9")
	private String lv_9;
	
	@Field("lv_10")
	private String lv_10;
	
	@Override
	public String toString() {
		return "Effect [lv_1=" + lv_1 + ", lv_2=" + lv_2 + ", lv_3=" + lv_3 + ", lv_4=" + lv_4 + ", lv_5=" + lv_5
				+ ", lv_6=" + lv_6 + ", lv_7=" + lv_7 + ", lv_8=" + lv_8 + ", lv_9=" + lv_9 + ", lv_10=" + lv_10 + "]";
	}
}
