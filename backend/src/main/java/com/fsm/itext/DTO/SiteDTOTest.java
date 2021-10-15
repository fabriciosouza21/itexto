package com.fsm.itext.DTO;

import java.io.Serializable;
import java.time.Instant;

import com.fsm.itext.entities.Site;

public class SiteDTOTest implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long version;
	private Boolean ativo;
	private AutorDTO autor;
	private String endereco;
	private String nome;
	private String rss;
	private String sobre;
	private Integer tentativas;
	private Instant ultima_verificacao;
	private Integer posts_dia;
	

	public SiteDTOTest() {
		super();
	}
	
	public SiteDTOTest(Site entity) {
		this.id = entity.getId();
		this.version = entity.getVersion();
		this.ativo = entity.getAtivo();
		this.autor = new AutorDTO(entity.getAutor_id());
		this.endereco = entity.getEndereco();
		this.nome = entity.getNome();
		this.rss = entity.getRss();
		this.sobre = entity.getSobre();
		this.tentativas = entity.getTentativas();
		this.ultima_verificacao = entity.getUltima_verificacao();
		this.posts_dia = entity.getPosts_dia();
	}
	
	

	public SiteDTOTest(Long id, Long version, Boolean ativo, AutorDTO autor_id, String endereco, String nome, String rss,
			String sobre, Integer tentativas, Instant ultima_verificacao, Integer posts_dia) {
		super();
		this.id = id;
		this.version = version;
		this.ativo = ativo;
		this.autor = autor_id;
		this.endereco = endereco;
		this.nome = nome;
		this.rss = rss;
		this.sobre = sobre;
		this.tentativas = tentativas;
		this.ultima_verificacao = ultima_verificacao;
		this.posts_dia = posts_dia;
	}

	public Long getId() {
		return id;
	}

	public Long getVersion() {
		return version;
	}
	public Boolean getAtivo() {
		return ativo;
	}

	public AutorDTO getAutor_id() {
		return autor;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getRss() {
		return rss;
	}

	public String getSobre() {
		return sobre;
	}

	public Integer getTentativas() {
		return tentativas;
	}

	public Instant getUltima_verificacao() {
		return ultima_verificacao;
	}

	public Integer getPosts_dia() {
		return posts_dia;
	}

}
