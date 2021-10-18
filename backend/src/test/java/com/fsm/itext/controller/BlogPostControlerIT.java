package com.fsm.itext.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
public class BlogPostControlerIT {
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void BuscarPostTextoBlogPostDTODeveRetornarPostsContendoTextoOrdenadosPorDataPublicacao() throws Exception {
		
		ResultActions result =
				mockMvc.perform(get("/post?search=VirtualBox&page=0")
					.contentType(MediaType.APPLICATION_JSON));

		result.andExpect(status().isOk());
		result.andExpect(jsonPath("$").isArray());
	}
	
	@Test
	public void cliqueIdDeveRetornarPosts() throws Exception {
		
		ResultActions result =
				mockMvc.perform(get("/post/clique/1")
					.contentType(MediaType.APPLICATION_JSON));

		result.andExpect(status().isOk());
		result.andExpect(jsonPath("$.titulo").exists());
		result.andExpect(jsonPath("$.id").exists());
		result.andExpect(jsonPath("$.cliques").exists());
		result.andExpect(jsonPath("$.dataInclusao").exists());
		result.andExpect(jsonPath("$.dataPublicacao").exists());
		result.andExpect(jsonPath("$.votosNegativos").exists());
		result.andExpect(jsonPath("$.votosPositivos").exists());
		result.andExpect(jsonPath("$.favoritos").hasJsonPath());
		result.andExpect(jsonPath("$.comentarios").exists());
		result.andExpect(jsonPath("$.url").exists());
		result.andExpect(jsonPath("$.blog").exists());
		
		
	}
	
	@Test
	public void cliqueIdDeveRetornarNotFoundQuandoIdNaoExisti() throws Exception {
		
		ResultActions result =
				mockMvc.perform(get("/post/clique/1000000000")
					.contentType(MediaType.APPLICATION_JSON));

		result.andExpect(status().isNotFound());		
		
	}
	
}
	

