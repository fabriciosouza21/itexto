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
import com.fsm.itext.DTO.BuscarPostTextoBlogPostDTO;
import com.fsm.itext.services.BlogPostService;

@RestController
@RequestMapping(value = "/post")
public class BlogPostController {
	@Autowired
	BlogPostService service;
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<BlogPostDTO > findById (@PathVariable Long id){
		BlogPostDTO blogPost = service.findById(id);
		return ResponseEntity.ok().body(blogPost);	
		
	}
	@GetMapping
	public ResponseEntity<List<BuscarPostTextoBlogPostDTO>> buscarPostTexto(@RequestParam(value = "search", defaultValue = " ") String seach){
		List<BuscarPostTextoBlogPostDTO> posts = service.buscarPostTexto(seach);
		return  ResponseEntity.ok().body(posts);
	}
	
}
