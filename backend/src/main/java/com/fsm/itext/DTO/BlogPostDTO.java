package com.fsm.itext.DTO;

import java.io.Serializable;
import java.time.Instant;

import com.fsm.itext.entities.BlogPost;

public class BlogPostDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private String titulo;
	private String resumo;
	private Integer cliques;
	private Instant dataInclusao;
	private Instant dataPublicacao;
	private Integer votosNegativos;
	private Integer votosPositivos;	
	private Long favoritos;
	private Long comentarios;
	private String url;
	private BuscarPostTextoSiteDTO blog;
	
	public BlogPostDTO() {}

	public BlogPostDTO(Long id, String titulo, String resumo, Integer cliques, Instant data_inclusao,
			Instant data_publicacao, Integer votos_negativos, Integer votos_positivos, Long favoritos, Long comentarios,
			String url, BuscarPostTextoSiteDTO blog) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.resumo = resumo;
		this.cliques = cliques;
		this.dataInclusao = data_inclusao;
		this.dataPublicacao = data_publicacao;
		this.votosNegativos = votos_negativos;
		this.votosPositivos = votos_positivos;
		this.favoritos = favoritos;
		this.comentarios = comentarios;
		this.url = url;
		this.blog = blog;
	}
	
	public BlogPostDTO(BlogPost entity) {
		super();
		this.id = entity.getId();
		this.titulo = entity.getTitulo();
		this.resumo = entity.getResumo();
		this.cliques = entity.getCliques();
		this.dataInclusao = entity.getDataInclusao();
		this.dataPublicacao = entity.getDataPublicacao();
		this.votosNegativos = entity.getVotosNegativos();
		this.votosPositivos = entity.getVotosPositivos();
		this.favoritos = entity.getFavoritos();
		this.comentarios = entity.getComentarios();	
		this.blog = new BuscarPostTextoSiteDTO(entity.getBlog());
	}

	public BlogPostDTO(BlogPost entity, String url) {
		this(entity);
		this.setUrl(url);
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
