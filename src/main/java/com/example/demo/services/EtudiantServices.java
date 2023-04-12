package com.example.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Groupe;
import com.example.demo.repository.EtudiantRepository;
@Service
public class EtudiantServices implements IEtudiantServices {
    @Autowired
	EtudiantRepository repo;
	public List<Etudiant> getEtuPaeGR(Groupe g) {
		
		return repo.getEtudiantbyGR(g);
	}
	
	public List<Etudiant> getEtudiant() {
		
		return repo.findAll();
	}

}
