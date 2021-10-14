package com.fsm.itext.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsm.itext.entities.BlogPost;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long>{

}
