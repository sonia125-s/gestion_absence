package com.example.demo.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

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
@Table(name = "T_ENSEIGNANT")
public class Enseignant {

	public Enseignant() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ENS_ID")
	int id ;
	@Column(name="ENS_NOM")
	String nom ;
	@Column(name="ENS_PRENOM")
	String prenom ;
	@Embedded
	Adresse adresse ;
	@Temporal(TemporalType.DATE)
	Date date_naissance;
	@Transient
	float age ;
	@Column(name="ENS_EMAIL")
	String email ;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	Set<Matiere> matiere ;
	
}
