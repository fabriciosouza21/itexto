package com.fsm.itext.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsm.itext.entities.Site;

public interface SiteRepository extends JpaRepository<Site, Long> {

}
