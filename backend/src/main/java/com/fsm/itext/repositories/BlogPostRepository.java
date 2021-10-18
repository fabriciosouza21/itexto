package com.fsm.itext.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fsm.itext.entities.BlogPost;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long>{
	
	@Query("select x from BlogPost x where x.resumo like %?1%  or x.titulo like %?1%")
	Page<BlogPost> findByResumoOrTituloContaining(String seach, Pageable pageRequest);

}
