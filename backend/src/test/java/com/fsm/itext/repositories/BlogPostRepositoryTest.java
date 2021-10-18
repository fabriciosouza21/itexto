package com.fsm.itext.repositories;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.fsm.itext.entities.BlogPost;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class BlogPostRepositoryTest {
	Long existingId;
	Long nonExisting; 
	String seach;
	
	@Autowired
	BlogPostRepository repository;
		
	@BeforeEach
	public void setUp() throws Exception {
		existingId = 1L;
		nonExisting = 100000000l;
		seach = "virtual box";
	}
	
	@Test
	public void findByIdDeveRetornarOptinalNaoVazioQuandoIdExistir() {
		
		Optional<BlogPost> entity = repository.findById(existingId);
		
		Assertions.assertTrue(entity.isPresent());
	}
	
	@Test
	public void findByIdDeveRetornarOptinalVazioQuandoIdNaoExistir() {
		
		Optional<BlogPost> entity = repository.findById(nonExisting);
		
		Assertions.assertTrue(entity.isEmpty());
	}
	
	@Test 
	public void 	gDeverRetornarUmaListBlogPostContendoSeach() {
		Integer page=0;
		Integer pageSize=12;
		
		PageRequest pageRequest = PageRequest.of(page, pageSize, Sort.by(Sort.Direction.DESC,"dataPublicacao"));
		
		
		Page<BlogPost> posts = repository.findByResumoOrTituloContaining(seach, pageRequest);
		
		Assertions.assertNotNull(posts);	
	}

}
