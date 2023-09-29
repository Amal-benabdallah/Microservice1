package com.example.demo.entities;

import java.util.Collection;
import java.util.Date;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Entity
@Getter @Setter
@NoArgsConstructor
@DiscriminatorValue("ens")

public class EnseignantChercheur extends Membre {
	@OneToMany (mappedBy="encadrant")
	Collection<Etudiant> listEtudiants ;
	@NonNull
	private String grade  ;
	@NonNull
	private String etablissement  ;
	@Builder
	public EnseignantChercheur( String cin, String nom, String prenom, Date dateNaissance,
	String cv,String email, String password, String grade,  String etablissement, byte[] photo) {
	super( cin, nom, prenom, dateNaissance, cv, email, password );
	this.grade = grade;
	this.etablissement = etablissement;


	}

}
