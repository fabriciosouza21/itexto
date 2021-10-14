package com.fsm.itext.DTO;

import java.io.Serializable;
import java.time.Instant;

import com.fsm.itext.entities.BlogPost;

public class BuscarPostTextoBlogPostDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private String titulo;
	private String resumo;
	private Integer cliques;
	private Instant data_inclusao;
	private Instant data_publicacao;
	private Integer votos_negativos;
	private Integer votos_positivos;	
	private Long favoritos;
	private Long comentarios;
	private String url;
	private BuscarPostTextoSiteDTO blog;
	
	public BuscarPostTextoBlogPostDTO() {}

	public BuscarPostTextoBlogPostDTO(Long id, String titulo, String resumo, Integer cliques, Instant data_inclusao,
			Instant data_publicacao, Integer votos_negativos, Integer votos_positivos, Long favoritos, Long comentarios,
			String url, BuscarPostTextoSiteDTO blog) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.resumo = resumo;
		this.cliques = cliques;
		this.data_inclusao = data_inclusao;
		this.data_publicacao = data_publicacao;
		this.votos_negativos = votos_negativos;
		this.votos_positivos = votos_positivos;
		this.favoritos = favoritos;
		this.comentarios = comentarios;
		this.url = url;
		this.blog = blog;
	}
	
	public BuscarPostTextoBlogPostDTO(BlogPost entity) {
		super();
		this.id = entity.getId();
		this.titulo = entity.getTitulo();
		this.resumo = entity.getResumo();
		this.cliques = entity.getCliques();
		this.data_inclusao = entity.getData_inclusao();
		this.data_publicacao = entity.getData_publicacao();
		this.votos_negativos = entity.getVotos_negativos();
		this.votos_positivos = entity.getVotos_positivos();
		this.favoritos = entity.getFavoritos();
		this.comentarios = entity.getComentarios();
		this.url = entity.getUrl();
		this.blog = new BuscarPostTextoSiteDTO(entity.getBlog());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public Integer getCliques() {
		return cliques;
	}

	public void setCliques(Integer cliques) {
		this.cliques = cliques;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public BuscarPostTextoSiteDTO getBlog() {
		return blog;
	}

	public void setBlog(BuscarPostTextoSiteDTO blog) {
		this.blog = blog;
	}
	
		
}
