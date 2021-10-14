package com.fsm.itext.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsm.itext.DTO.SiteDTO;
import com.fsm.itext.services.SiteService;

@RestController
@RequestMapping(value = "/sites")
public class SiteController {
	@Autowired
	SiteService siteService;
	@GetMapping
	public ResponseEntity<SiteDTO>findByid(){
		return ResponseEntity.ok(new SiteDTO(siteService.findById())) ;
	}
}
