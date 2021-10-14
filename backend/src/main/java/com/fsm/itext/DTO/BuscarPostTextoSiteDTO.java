package com.fsm.itext.DTO;

import java.io.Serializable;

import com.fsm.itext.entities.Site;

public class BuscarPostTextoSiteDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private Byte ativo;
	private String url;
	private Long AutorId;
	
	public BuscarPostTextoSiteDTO() {}

	public BuscarPostTextoSiteDTO(Long id, String nome, Byte ativo, Long autorId, String url) {
		super();
		this.id = id;
		this.nome = nome;
		this.ativo = ativo;
		this.AutorId = autorId;
		this.setUrl(url);
	}

	public BuscarPostTextoSiteDTO(Site entity) {
		super();
		this.id = entity.getId();
		this.nome = entity.getNome();
		this.ativo = entity.getAtivo();
		this.AutorId = entity.getAutor_id();
		this.setUrl(entity.getEndereco());
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Long getAutorId() {
		return AutorId;
	}

	public void setAutorId(Long autorId) {
		AutorId = autorId;
	}
}
