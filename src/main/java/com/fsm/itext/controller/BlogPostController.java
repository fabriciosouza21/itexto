package com.fsm.itext.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsm.itext.entities.BlogPost;
import com.fsm.itext.services.BlogPostService;

@RestController
@RequestMapping(value = "/blogpost")
public class BlogPostController {
	@Autowired
	BlogPostService service;
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<BlogPost > findById (@PathVariable Long id){
		BlogPost users = service.findById(id);
		return ResponseEntity.ok().body(users);	
		
	}
		
}
