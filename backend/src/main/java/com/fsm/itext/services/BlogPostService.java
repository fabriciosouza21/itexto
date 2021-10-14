package com.fsm.itext.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fsm.itext.DTO.BlogPostDTO;
import com.fsm.itext.entities.BlogPost;
import com.fsm.itext.repositories.BlogPostRepository;

@Service
public class BlogPostService {
	
	@Autowired
	private BlogPostRepository repository;
	
	@Transactional(readOnly = true)
	public BlogPostDTO  findById(Long id) {
		Optional<BlogPost> blogPost = repository.findById(id);
		return new BlogPostDTO( blogPost.get());
	}	

}
