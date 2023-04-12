package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Absence;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Groupe;


@Service
public interface IEtudiantServices {
	public List<Etudiant> getEtuPaeGR (Groupe g);
	 public List<Etudiant> getEtudiant ();

}
