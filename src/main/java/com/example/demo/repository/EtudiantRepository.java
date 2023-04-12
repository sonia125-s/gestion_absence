package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Groupe;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
	
	@Query("select a from Etudiant a where a.groupe = :c")
	 List<Etudiant> getEtudiantbyGR(@Param("c") Groupe c);


}
