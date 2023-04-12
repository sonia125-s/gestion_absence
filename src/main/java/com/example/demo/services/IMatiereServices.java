package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Matiere;

@Service
public interface IMatiereServices {
	public List<Matiere> getMatiere();

}
