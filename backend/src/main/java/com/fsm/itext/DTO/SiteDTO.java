package com.fsm.itext.DTO;

import java.io.Serializable;

import com.fsm.itext.entities.Site;

public class SiteDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private Boolean ativo;
	private String url;
	private AutorDTO Autor;
	
	public SiteDTO() {}

	public SiteDTO(Long id, String nome, Boolean ativo, AutorDTO autor, String url) {
		super();
		this.id = id;
		this.nome = nome;
		this.ativo = ativo;
		this.Autor = autor;
		this.setUrl(url);
	}

	public SiteDTO(Site entity) {
		super();
		this.id = entity.getId();
		this.nome = entity.getNome();
		this.ativo = entity.getAtivo();
		this.Autor = new AutorDTO(entity.getAutor_id());
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

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public AutorDTO getAutorId() {
		return Autor;
	}

	public void setAutorId(AutorDTO autorId) {
		Autor = autorId;
	}
}
