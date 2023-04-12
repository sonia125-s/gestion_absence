package com.example.demo.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

@EqualsAndHashCode
@Entity
@Table(name = "T_MATIERE")
public class Matiere implements Serializable{

	public Matiere() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="MAT_ID")
	int id_mat ;
	String nom;
	@Column(name="MAT_NIVEAU")
	int niveau ;
	//@ManyToMany(cascade = CascadeType.ALL)
	//Set<Enseignant> enseignant ;
}
