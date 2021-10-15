package com.fsm.itext.repositories;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fsm.itext.entities.BlogPost;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long>{
	@Query("select x from BlogPost x where x.resumo like %?1%  or x.titulo like %?1%")
	List<BlogPost> findByResumoOrTituloContaining(String seach, Sort sort);

}
