package com.fsm.itext.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsm.itext.entities.Site;
import com.fsm.itext.repositories.SiteRepository;

@Service
public class SiteService {
	@Autowired
	SiteRepository siteRepository;
	
	public Site findById(Long id) {
		Optional<Site>  site =  siteRepository.findById(id);
		return site.get();
	}
}
