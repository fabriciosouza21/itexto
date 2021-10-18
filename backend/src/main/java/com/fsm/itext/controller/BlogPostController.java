package com.fsm.itext.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fsm.itext.DTO.BlogPostDTO;
import com.fsm.itext.services.BlogPostService;

@RestController
@RequestMapping(value = "/post")
public class BlogPostController {
	@Autowired
	BlogPostService service;
	
	
	@GetMapping(value = "/clique/{id}")
	public ResponseEntity<BlogPostDTO> cliqueId (@PathVariable Long id){
		BlogPostDTO blogPost = service.clique(id);
		return ResponseEntity.ok().body(blogPost);	
		
	}
	@GetMapping
	public ResponseEntity<List<BlogPostDTO>> buscarPostTexto(
			@RequestParam(value = "search", defaultValue = "") String seach,
			@RequestParam(value = "page", defaultValue = "0") String page){
		List<BlogPostDTO> posts = service.buscarPostTexto(seach,page);
		return  ResponseEntity.ok().body(posts);
	}
	
}
