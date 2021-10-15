package com.fsm.itext.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fsm.itext.DTO.BlogPostDTO;
import com.fsm.itext.entities.BlogPost;
import com.fsm.itext.repositories.BlogPostRepository;
import com.fsm.itext.services.exception.NotFoundException;

@Service
public class BlogPostService {
	
	@Autowired
	private BlogPostRepository repository;
	
	@Transactional(readOnly = true)
	public BlogPostDTO  clique(Long id) {
		Optional<BlogPost> blogPost = repository.findById(id);		
		BlogPost entity = blogPost.orElseThrow(() -> new NotFoundException("entitidade não foi encontrada"));
		entity.setCliques(entity.getCliques()+1);
		//repository.save(entity)
		return new BlogPostDTO( entity, entity.getUrl());
	}
	@Transactional(readOnly = true)
	public List<BlogPostDTO> buscarPostTexto(String seach) {
		List<BlogPost> posts = repository.findByResumoOrTituloContaining(seach,Sort.by(Sort.Direction.DESC,"dataPublicacao"));

		return posts.stream().map( x -> new BlogPostDTO(x)).collect(Collectors.toList());
	}	

}
