package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Matiere;
import com.example.demo.repository.EtudiantRepository;
import com.example.demo.repository.MatiereRepository;
@Service
public class MatiereServices implements IMatiereServices  {

	public MatiereServices() {
		// TODO Auto-generated constructor stub
	}
	 @Autowired
		MatiereRepository repo;
	
	public List<Matiere> getMatiere() {
		
		return repo.findAll();
	}

}
