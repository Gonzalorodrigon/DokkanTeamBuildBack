package com.dokkanbattle.teambuilder.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import com.dokkanbattle.teambuilder.models.Card;
import com.dokkanbattle.teambuilder.models.Category;
import com.dokkanbattle.teambuilder.models.LinkSkill;
import com.dokkanbattle.teambuilder.service.TeamBuilderService;

@RestController
@Validated
public class TeamBuilderApiController implements TeamBuilderApi {

	private final NativeWebRequest request;
	
	@Autowired
	private TeamBuilderService service;
	
	@Autowired
	public TeamBuilderApiController(NativeWebRequest request) {
		this.request = request;
	}

	/** Get the native web request. */
	@Override
	public Optional<NativeWebRequest> getRequest() {
		return Optional.ofNullable(request);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@Override
	@GetMapping(value = "/category", produces = { "application/json;charset=utf-8" })
	public ResponseEntity<Category> getCategory(@RequestParam("name") String name) {
		return service.getCategory(name);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@Override
	@GetMapping(value = "/categories", produces = { "application/json;charset=utf-8" })
	public ResponseEntity<List<Category>> getAllCategories() {
		return service.getAllCategories();
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@Override
	@GetMapping(value = "/card", produces = { "application/json;charset=utf-8" })
	public ResponseEntity<Card> getCardByName(@RequestParam("name") String name) {
		return service.getCard(name);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@Override
	@GetMapping(value = "/cards", produces = { "application/json;charset=utf-8" })
	public ResponseEntity<List<Card>> getAllCards() {
		return service.getAllCards();
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@Override
	@GetMapping(value = "/link", produces = { "application/json;charset=utf-8" })
	public ResponseEntity<LinkSkill> getLinkByName(@RequestParam("name") String name) {
		return service.getLink(name);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@Override
	@GetMapping(value = "/links", produces = { "application/json;charset=utf-8" })
	public ResponseEntity<List<LinkSkill>> getAllLinks() {
		return service.getAllLinks();
	}

}
