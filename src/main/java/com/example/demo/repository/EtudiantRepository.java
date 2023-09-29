package com.example.demo.repository;
import com.example.demo.entities.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EtudiantRepository extends JpaRepository<Etudiant,
Long> {
List<Etudiant>findByDiplome(String diplome);
List<Etudiant>findByDiplomeOrderByDateInscriptionDesc(String
diplome);
}