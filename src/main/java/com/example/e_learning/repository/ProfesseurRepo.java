package com.example.e_learning.repository;

import com.example.e_learning.model.Professeur;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProfesseurRepo extends MongoRepository<Professeur,String> {
      List<Professeur> findByIsadmin(boolean isAdmin);
}
