package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Absence;
import com.example.demo.services.AbsencesServices;

@RestController
@RequestMapping("/abs")
public class AbsencesController {

	@Autowired
	AbsencesServices service;

	@PostMapping("/save")
	public Absence saveAbsences(@RequestBody Absence abs) {
		return service.createAbsence(abs);
	}

	@GetMapping("/getabs")
	public List<Absence> getAbs() {
		return service.getAbsence();
	}

	
	  @GetMapping("/getemps/{id}")
	  public Absence getAbsence(@PathVariable int id)
	  { return service.getby(id); }
	  
	 
	
	// @GetMapping("/geteabs/{cin}") public List<Absence> getAbsetud(@PathVariable
	 //int cin) { return service.getAbsetud(cin); }
	 

}
