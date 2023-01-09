package com.masai.webapp.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.webapp.example.entity.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, Integer> {

}
