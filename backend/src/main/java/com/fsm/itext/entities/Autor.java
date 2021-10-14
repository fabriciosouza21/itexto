package com.fsm.itext.entities;

public class Autor {
	private Long id;
	private String nome;
	
	
	
	public Autor(Long id, String nome) {
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
