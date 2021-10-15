package com.fsm.itext.DTO;

import com.fsm.itext.entities.Autor;

public class AutorDTO {
	private Long id;
	private String nome;
	
	public AutorDTO() { }
	
	public AutorDTO(Autor autorEntity) {
		this.id = autorEntity.getId();
		this.nome = autorEntity.getNome();
	}
	
	public AutorDTO(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	
	
}
