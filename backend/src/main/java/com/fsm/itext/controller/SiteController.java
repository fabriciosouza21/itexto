package com.fsm.itext.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsm.itext.DTO.SiteDTOTest;
import com.fsm.itext.services.SiteService;

@RestController
@RequestMapping(value = "/sites")
public class SiteController {
	@Autowired
	SiteService siteService;
	@GetMapping(value = "/{id}")
	public ResponseEntity<SiteDTOTest>findByid(@PathVariable Long id){
		return ResponseEntity.ok(new SiteDTOTest(siteService.findById(id))) ;
	}
}
