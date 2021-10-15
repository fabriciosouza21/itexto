package com.fsm.itext.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "blog_post")
public class BlogPost implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	private Long version;	
	private Integer cliques;
	private String resumo;
	private Instant dataInclusao;
	private Instant dataPublicacao;
	private String titulo;
	private String url;
	private Integer votosNegativos;
	private Integer votosPositivos;
	private Boolean ativo;
	private Integer tentativas;
	private Long favoritos;
	private Long comentarios;
	private String thumbnail;
	
	@ManyToOne
	@JoinColumn(name = "site_id")
	private Site blog;
	
	public BlogPost() { }
	
		
	public BlogPost(Long id, Long version, Integer cliques, String resumo, Instant dataInclusao, Instant dataPublicacao,
			String titulo, String url, Integer votosNegativos, Integer votosPositivos, Boolean ativo,
			Integer tentativas, Long favoritos, Long comentarios, String thumbnail, Site blog) {
		super();
		this.id = id;
		this.version = version;
		this.cliques = cliques;
		this.resumo = resumo;
		this.dataInclusao = dataInclusao;
		this.dataPublicacao = dataPublicacao;
		this.titulo = titulo;
		this.url = url;
		this.votosNegativos = votosNegativos;
		this.votosPositivos = votosPositivos;
		this.ativo = ativo;
		this.tentativas = tentativas;
		this.favoritos = favoritos;
		this.comentarios = comentarios;
		this.thumbnail = thumbnail;
		this.blog = blog;
	}



	public Site getBlog() {
		return blog;
	}



	public void setBlog(Site blog) {
		this.blog = blog;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}
	public Integer getCliques() {
		return cliques;
	}
	public void setCliques(Integer cliques) {
		this.cliques = cliques;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	
	public Instant getDataInclusao() {
		return dataInclusao;
	}


	public void setDataInclusao(Instant data_inclusao) {
		this.dataInclusao = data_inclusao;
	}


	public Instant getDataPublicacao() {
		return dataPublicacao;
	}


	public void setDataPublicacao(Instant data_publicacao) {
		this.dataPublicacao = data_publicacao;
	}


	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getVotosNegativos() {
		return votosNegativos;
	}

	public void setVotosNegativos(Integer votos_negativos) {
		this.votosNegativos = votos_negativos;
	}

	public Integer getVotosPositivos() {
		return votosPositivos;
	}

	public void setVotosPositivos(Integer votos_positivos) {
		this.votosPositivos = votos_positivos;
	}
	
	public Boolean getAtivo() {
		return ativo;
	}


	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}


	public Integer getTentativas() {
		return tentativas;
	}


	public void setTentativas(Integer tentativas) {
		this.tentativas = tentativas;
	}


	public Long getFavoritos() {
		return favoritos;
	}


	public void setFavoritos(Long favoritos) {
		this.favoritos = favoritos;
	}


	public Long getComentarios() {
		return comentarios;
	}


	public void setComentarios(Long comentarios) {
		this.comentarios = comentarios;
	}


	public String getThumbnail() {
		return thumbnail;
	}


	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BlogPost other = (BlogPost) obj;
		return Objects.equals(id, other.id);
	}	

}
