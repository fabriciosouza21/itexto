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
	private Byte ativo;
	private Long autor_id;
	private String endereco;
	private String nome;
	private String rss;
	private String sobre;
	private String tentativas;
	private Instant ultima_verificacao;
	private Integer posts_dia;
	
	
	public Site() {
		
	}

	public Site(Long id, Long version) {
		super();
		this.id = id;
		this.version = version;
	}

	
	
	public Byte getAtivo() {
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

	public String getTentativas() {
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
