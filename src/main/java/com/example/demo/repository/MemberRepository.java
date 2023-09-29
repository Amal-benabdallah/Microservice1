package com.example.demo.repository;
import java.util.List;
import com.example.demo.entities.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.*;
public interface MemberRepository extends JpaRepository<Membre,Long>
{

Membre findByCin(String cin);
List<Membre>findByNomStartingWith(String caractere);
Membre findByEmail(String email);

}