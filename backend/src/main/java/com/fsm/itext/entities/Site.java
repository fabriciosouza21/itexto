package com.fsm.itext.entities;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "site")
public class Site {
	@Id
	private Long id;
	private Long version;
	private Boolean ativo;
	private Long autor_id;
	private String endereco;
	private String nome;
	private String rss;
	private String sobre;
	private Integer tentativas;
	private Instant ultima_verificacao;
	private Integer posts_dia;
	
	
	public Site() {
		
	}
	
	public Site(Long id, Long version, Boolean ativo, Long autor_id, String endereco, String nome, String rss,
			String sobre, Integer tentativas, Instant ultima_verificacao, Integer posts_dia) {
		this.id = id;
		this.version = version;
		this.ativo = ativo;
		this.autor_id = autor_id;
		this.endereco = endereco;
		this.nome = nome;
		this.rss = rss;
		this.sobre = sobre;
		this.tentativas = tentativas;
		this.ultima_verificacao = ultima_verificacao;
		this.posts_dia = posts_dia;
	}


	public Boolean getAtivo() {
		return ativo;
	}

	public Long getAutor_id() {
		return autor_id;
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

	public Long getId() {
		return id;
	}

	public Long getVersion() {
		return version;
	}

}
