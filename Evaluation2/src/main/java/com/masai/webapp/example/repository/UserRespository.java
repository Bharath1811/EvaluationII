package com.masai.webapp.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.webapp.example.entity.Email;
import com.masai.webapp.example.entity.User;

import java.util.List;

@Repository
public interface UserRespository extends JpaRepository<User, Integer> {

}
