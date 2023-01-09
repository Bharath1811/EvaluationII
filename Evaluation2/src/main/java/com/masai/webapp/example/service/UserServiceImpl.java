package com.masai.webapp.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.webapp.example.entity.User;

import com.masai.webapp.example.repository.*;
@Service
public class UserServiceImpl implements UserService {
    
	@Autowired
	UserRespository repository;
	
	@Override
	public List<User> addUser(User user) {
		repository.save(user);
		return repository.findAll();
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getUsers() {
		return repository.findAll();
	}

	@Override
	public User getUser(int id) {
		return repository.findById(id).get();
	}

}
