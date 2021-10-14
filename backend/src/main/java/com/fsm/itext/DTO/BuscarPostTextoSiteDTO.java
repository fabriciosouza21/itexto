package com.fsm.itext.DTO;

import java.io.Serializable;

import com.fsm.itext.entities.Site;

public class BuscarPostTextoSiteDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private Byte ativo;
	private Long AutorId;
	
	public BuscarPostTextoSiteDTO() {}

	public BuscarPostTextoSiteDTO(Long id, String nome, Byte ativo, Long autorId) {
		super();
		this.id = id;
		this.nome = nome;
		this.ativo = ativo;
		AutorId = autorId;
	}

	public BuscarPostTextoSiteDTO(Site entity) {
		super();
		this.id = entity.getId();
		this.nome = entity.getNome();
		this.ativo = entity.getAtivo();
		AutorId = entity.getAutor_id();
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Byte getAtivo() {
		return ativo;
	}

	public void setAtivo(Byte ativo) {
		this.ativo = ativo;
	}

	public Long getAutorId() {
		return AutorId;
	}

	public void setAutorId(Long autorId) {
		AutorId = autorId;
	}
}
