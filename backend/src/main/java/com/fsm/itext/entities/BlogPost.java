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
	private Instant data_inclusao;
	private Instant data_publicacao;
	private String titulo;
	private String url;
	private Integer votos_negativos;
	private Integer votos_positivos;
	private Boolean ativo;
	private Integer tentativas;
	private Long favoritos;
	private Long comentarios;
	private String thumbnail;
	
	@ManyToOne
	@JoinColumn(name = "site_id")
	private Site blog;
	
	public BlogPost() { }
	
	
	
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

	
	public Instant getData_inclusao() {
		return data_inclusao;
	}


	public void setData_inclusao(Instant data_inclusao) {
		this.data_inclusao = data_inclusao;
	}


	public Instant getData_publicacao() {
		return data_publicacao;
	}


	public void setData_publicacao(Instant data_publicacao) {
		this.data_publicacao = data_publicacao;
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

	public Integer getVotos_negativos() {
		return votos_negativos;
	}

	public void setVotos_negativos(Integer votos_negativos) {
		this.votos_negativos = votos_negativos;
	}

	public Integer getVotos_positivos() {
		return votos_positivos;
	}

	public void setVotos_positivos(Integer votos_positivos) {
		this.votos_positivos = votos_positivos;
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
