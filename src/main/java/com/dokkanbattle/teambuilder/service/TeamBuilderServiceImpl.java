package com.dokkanbattle.teambuilder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dokkanbattle.teambuilder.models.Card;
import com.dokkanbattle.teambuilder.models.Category;
import com.dokkanbattle.teambuilder.models.LinkSkill;
import com.dokkanbattle.teambuilder.repository.CardRepository;
import com.dokkanbattle.teambuilder.repository.CategoryRepository;
import com.dokkanbattle.teambuilder.repository.LinkSkillRepository;

@Service
public class TeamBuilderServiceImpl implements TeamBuilderService {

	@Autowired CardRepository cardRepository;
	
	@Autowired CategoryRepository categoryRepository;

	@Autowired LinkSkillRepository linkRepository;
	
	@Override
	public ResponseEntity<Category> getCategory(String category_name) {
		Category category = categoryRepository.findByName(category_name);
		return new ResponseEntity<>(category, HttpStatus.OK);
	}
	
	@Override
	public ResponseEntity<List<Category>> getAllCategories() {
		
		List<Category> categories = categoryRepository.findAll();
		
		return new ResponseEntity<>(categories, HttpStatus.OK);
	}


	@Override
	public ResponseEntity<Card> getCard(String card_name) {
		Card card = cardRepository.findByName(card_name);
		return new ResponseEntity<>(card, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Card>> getAllCards() {
		List<Card> cards = cardRepository.findAll();
		return new ResponseEntity<>(cards, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<LinkSkill> getLink(String link_name) {
		LinkSkill link = linkRepository.findByName(link_name);
		return new ResponseEntity<>(link, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<LinkSkill>> getAllLinks() {
		List<LinkSkill> links = linkRepository.findAll();
		return new ResponseEntity<>(links, HttpStatus.OK);
	}

}