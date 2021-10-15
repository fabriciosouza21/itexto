package com.fsm.itext.services;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.fsm.itext.DTO.BlogPostDTO;
import com.fsm.itext.entities.BlogPost;
import com.fsm.itext.repositories.BlogPostRepository;
import com.fsm.itext.services.exception.NotFoundException;
import com.fsm.itext.tests.Factory;

@ExtendWith(SpringExtension.class)
public class BlogPostServiceTest {
	
	Long existingId;
	Long nonExistingId;
	String seach;
	BlogPost post;
	List<BlogPost> posts;
	
	@InjectMocks
	private BlogPostService service;
	
	@Mock
	private BlogPostRepository repository;	

	
	@BeforeEach

	void setUp() throws Exception {
		existingId = 1L;
		nonExistingId = 2L;
		seach = "vitual box";
		post = Factory.createBlogPost();
		posts = List.of(post);
		
		Mockito.when(repository.findByResumoOrTituloContaining(seach,Sort.by(Sort.Direction.DESC,"dataPublicacao"))).thenReturn(posts);
		Mockito.when(repository.findById(nonExistingId)).thenReturn(Optional.empty());
		Mockito.when(repository.findById(existingId)).thenReturn(Optional.of(post));
		
	
	}
	
	@Test
	public void buscarPostTextoDeveRetornarListOrdenadaPost() {
				
		List<BlogPostDTO> posts = service.buscarPostTexto(seach);		
		
		Assertions.assertNotNull(posts);
		Assertions.assertEquals(posts.get(0).getUrl(), null);
		Mockito.verify(repository).findByResumoOrTituloContaining(seach,Sort.by(Sort.Direction.DESC,"dataPublicacao"));

	}
	
	@Test
	public void cliqueDeveRetornarPostQuandoIdValido() {
				
		BlogPostDTO post = service.clique(existingId);		
		
		Assertions.assertNotNull(post);
		
		Mockito.verify(repository).findById(existingId);

	}
	
	@Test
	public void cliqueDeveGerarNotFoundExceptionQuandoIdNaoExistir() {
				
		Assertions.assertThrows(NotFoundException.class,()->{
			service.clique(nonExistingId);
		});
		Mockito.verify(repository).findById(nonExistingId);

	}
	
}
