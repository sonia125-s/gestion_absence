package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Absence;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Groupe;
import com.example.demo.services.EtudiantServices;

@RestController
@RequestMapping("/etu")
public class EtudiantController {
	@Autowired
	EtudiantServices service;
	 @GetMapping("/geteabs/{groupe}") public List<Etudiant> getEtuPaeGR(@PathVariable Groupe groupe)
	 { return service.getEtuPaeGR(groupe); }
	 
	 
	 @GetMapping("/getetud")
		public List<Etudiant> getEtd() {
			return service.getEtudiant();
		}
			 
}
