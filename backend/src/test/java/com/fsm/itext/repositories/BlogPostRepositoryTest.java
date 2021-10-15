package com.fsm.itext.repositories;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

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
	public void findByIdShouldReturnOptinalNaoVazioQuandoIdExistir() {
		
		Optional<BlogPost> entity = repository.findById(existingId);
		
		Assertions.assertTrue(entity.isPresent());
	}
	
	@Test
	public void findByIdDeverRetornarOptinalVazioQuandoIdNaoExistir() {
		
		Optional<BlogPost> entity = repository.findById(nonExisting);
		
		Assertions.assertTrue(entity.isEmpty());
	}
	

}
