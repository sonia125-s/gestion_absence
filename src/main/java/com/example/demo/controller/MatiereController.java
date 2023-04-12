package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Matiere;
import com.example.demo.services.MatiereServices;



@RestController
@RequestMapping("/mat")
public class MatiereController {

	
	@Autowired
	MatiereServices service;
	@GetMapping("/getmat")
	public List<Matiere> getEtd() {
		return service.getMatiere();
	}
}
