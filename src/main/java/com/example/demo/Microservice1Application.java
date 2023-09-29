package com.example.demo;
import com.example.demo.entities.*;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.AllArgsConstructor;
import com.example.demo.repository.*;
@SpringBootApplication
@AllArgsConstructor
public class Microservice1Application implements CommandLineRunner{
	MemberRepository memberRepository;
	EtudiantRepository etudiantRepository ;
	EnseignantChercheurRepository EnseignantChercheurRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Microservice1Application.class, args);
	}


	public void run(String... args) throws Exception {
		Etudiant etd1=Etudiant.builder()
				.cin("123456")
				.dateInscription(new Date())
				.dateNaissance(new Date())
				.diplome("mastère")
				.email("etd1@gmail.com")
				.password("pass1")
				.encadrant(null)
				.cv("cv1")
				.nom("abid")
				.prenom("youssef)")
				.sujet("blockhain")
				.build();
		Etudiant etd2=Etudiant.builder()
				.cin("123123")
				.dateInscription(new Date())
				.dateNaissance(new Date())
				.diplome("mastère")
				.email("etd2@gmail.com")
				.password("pass2")
				.encadrant(null)
				.cv("cv2")
				.nom("dammak")
				.prenom("ines)")
				.sujet("blockhain")
				.build();
		EnseignantChercheur ens1=EnseignantChercheur.builder()
				.cin("123133")
				.dateNaissance(new Date())
				.email("etd2@gmail.com")
				.password("pass2")
				.cv("cv2")
				.grade("2")
				.etablissement("2")
				.nom("dammak")
				.prenom("ines)")
				.build();
		EnseignantChercheur ens2=EnseignantChercheur.builder()
				.cin("123122")
				.dateNaissance(new Date())
				.email("etd2@gmail.com")
				.password("pass2")
				.cv("cv2")
				.grade("2")
				.etablissement("2")
				.nom("kammoun")
				.prenom("maha)")
				.build();
		   etudiantRepository.save(etd1);
	        etudiantRepository.save(etd2);
	        EnseignantChercheurRepository.save(ens1);
	        EnseignantChercheurRepository.save(ens2);

	}

}
