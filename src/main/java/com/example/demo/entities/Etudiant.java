package com.example.demo.entities;

import java.util.Date;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.ManyToOne;
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
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("etd")
public class Etudiant extends Membre {
@ManyToOne 
EnseignantChercheur encadrant ;
@NonNull
private String diplome ;
@NonNull
private String sujet  ;
@NonNull @Temporal(TemporalType.DATE) 
private Date dateInscription ;

@Builder
public Etudiant(String cin, String nom, String prenom, Date dateNaissance,
                 String cv, String email, String password, Date dateInscription, 
                 String sujet, String diplome, byte[] photo, EnseignantChercheur encadrant) {
    super( cin, nom, prenom, dateNaissance, cv, email, password); 
    this.dateInscription = dateInscription;
    this.sujet = sujet;
    this.diplome = diplome;
    this.encadrant = encadrant;
}



}
