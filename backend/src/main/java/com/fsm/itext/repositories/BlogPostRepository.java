package com.fsm.itext.repositories;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fsm.itext.entities.BlogPost;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long>{

	List<BlogPost> findByResumoOrTituloContaining(String seach, String cpseach, Sort sort);

}
