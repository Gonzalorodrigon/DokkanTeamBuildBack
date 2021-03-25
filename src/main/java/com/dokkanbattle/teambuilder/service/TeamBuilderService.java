package com.dokkanbattle.teambuilder.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.dokkanbattle.teambuilder.models.Card;
import com.dokkanbattle.teambuilder.models.Category;
import com.dokkanbattle.teambuilder.models.LinkSkill;

public interface TeamBuilderService {

	ResponseEntity<Category> getCategory(String category_name);
	
	ResponseEntity<List<Category>> getAllCategories();

	ResponseEntity<Card> getCard(String card_name);
	
	ResponseEntity<List<Card>> getAllCards();

	ResponseEntity<LinkSkill> getLink(String link_name);

	ResponseEntity<List<LinkSkill>> getAllLinks();

}
