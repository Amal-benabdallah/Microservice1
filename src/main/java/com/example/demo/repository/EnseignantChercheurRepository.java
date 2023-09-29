package com.example.demo.repository;
import com.example.demo.entities.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EnseignantChercheurRepository extends
JpaRepository<EnseignantChercheur, Long> {
List<EnseignantChercheur>findByGrade(String grade);
List<EnseignantChercheur>findByEtablissement(String etablissement);
}