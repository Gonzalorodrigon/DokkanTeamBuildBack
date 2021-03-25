package com.dokkanbattle.teambuilder.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;

import com.dokkanbattle.teambuilder.models.Card;
import com.dokkanbattle.teambuilder.models.Category;
import com.dokkanbattle.teambuilder.models.LinkSkill;

import io.swagger.annotations.*;

@Validated
@Api(value = "Service", description = "The Dokkan Battle Team Builder Service")
public interface TeamBuilderApi {

	default Optional<NativeWebRequest> getRequest() {
		return Optional.empty();
	}

	@ApiOperation(
			value = "Find a Category", 
			nickname = "Category", 
			notes = "Thisoperation finds a category", 
			response = Category.class
			)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Success", response = Category.class),
			@ApiResponse(code = 400, message = "Bad Request", response = Error.class),
			@ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
			@ApiResponse(code = 403, message = "Forbidden", response = Error.class),
			@ApiResponse(code = 404, message = "Not Found", response = Error.class),
			@ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
			@ApiResponse(code = 409, message = "Conflict", response = Error.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) 
	})

	@RequestMapping(value = "/category",
	produces = { "application/json;charset=utf-8" }, 
	method = RequestMethod.GET)
	default ResponseEntity<Category> getCategory(
			@ApiParam(value = "Name of the Category", required = true) 
			@Valid 
			@RequestParam("name")
			String name) {
		getRequest();
		return new ResponseEntity<>(HttpStatus.OK);
	}
	

	@ApiOperation(
			value = "Find all categories", 
			nickname = "Categories", 
			notes = "This operation finds all categories", 
			response = Category.class
			)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Success", response = Category.class),
			@ApiResponse(code = 400, message = "Bad Request", response = Error.class),
			@ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
			@ApiResponse(code = 403, message = "Forbidden", response = Error.class),
			@ApiResponse(code = 404, message = "Not Found", response = Error.class),
			@ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
			@ApiResponse(code = 409, message = "Conflict", response = Error.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) 
	})
	@RequestMapping(value = "/categories",
			produces = { "application/json;charset=utf-8" }, 
			method = RequestMethod.GET)
	default ResponseEntity<List<Category>> getAllCategories() {
		getRequest();
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@ApiOperation(
			value = "Find a card", 
			nickname = "Card", 
			notes = "This operation find a card by it's name", 
			response = Card.class
			)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Success", response = Card.class),
			@ApiResponse(code = 400, message = "Bad Request", response = Error.class),
			@ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
			@ApiResponse(code = 403, message = "Forbidden", response = Error.class),
			@ApiResponse(code = 404, message = "Not Found", response = Error.class),
			@ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
			@ApiResponse(code = 409, message = "Conflict", response = Error.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) 
	})
	@RequestMapping(value = "/card",
	produces = { "application/json;charset=utf-8" }, 
	method = RequestMethod.GET)
	default ResponseEntity<Card> getCardByName(
			@ApiParam(value = "Name of the Card", required = true) 
			@Valid 
			@RequestParam("name")
			String name) {
		getRequest();
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@ApiOperation(
			value = "Find all cards", 
			nickname = "Cards", 
			notes = "This operation finds all categories", 
			response = Card.class
			)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Success", response = Card.class),
			@ApiResponse(code = 400, message = "Bad Request", response = Error.class),
			@ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
			@ApiResponse(code = 403, message = "Forbidden", response = Error.class),
			@ApiResponse(code = 404, message = "Not Found", response = Error.class),
			@ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
			@ApiResponse(code = 409, message = "Conflict", response = Error.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) 
	})
	@RequestMapping(value = "/cards",
			produces = { "application/json;charset=utf-8" }, 
			method = RequestMethod.GET)
	default ResponseEntity<List<Card>> getAllCards() {
		getRequest();
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Success", response = LinkSkill.class),
			@ApiResponse(code = 400, message = "Bad Request", response = Error.class),
			@ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
			@ApiResponse(code = 403, message = "Forbidden", response = Error.class),
			@ApiResponse(code = 404, message = "Not Found", response = Error.class),
			@ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
			@ApiResponse(code = 409, message = "Conflict", response = Error.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) 
	})
	@RequestMapping(value = "/link",
	produces = { "application/json;charset=utf-8" }, 
	method = RequestMethod.GET)
	default ResponseEntity<LinkSkill> getLinkByName(
			@ApiParam(value = "Name of the Link", required = true) 
			@Valid 
			@RequestParam("name")
			String name) {
		getRequest();
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@ApiOperation(
			value = "Find all Link Skills", 
			nickname = "Cards", 
			notes = "This operation finds all Link Skills", 
			response = LinkSkill.class
			)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Success", response = LinkSkill.class),
			@ApiResponse(code = 400, message = "Bad Request", response = Error.class),
			@ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
			@ApiResponse(code = 403, message = "Forbidden", response = Error.class),
			@ApiResponse(code = 404, message = "Not Found", response = Error.class),
			@ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
			@ApiResponse(code = 409, message = "Conflict", response = Error.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) 
	})
	@RequestMapping(value = "/links",
			produces = { "application/json;charset=utf-8" }, 
			method = RequestMethod.GET)
	default ResponseEntity<List<LinkSkill>> getAllLinks() {
		getRequest();
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
