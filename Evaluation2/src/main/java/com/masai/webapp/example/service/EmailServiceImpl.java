package com.masai.webapp.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.webapp.example.entity.Email;
import com.masai.webapp.example.repository.EmailRepository;

@Service
public class EmailServiceImpl implements EmailService {
	
	@Autowired
	EmailRepository repository;

	@Override
	public List<Email> addEmail(Email email) {
		repository.save(email);
		return repository.findAll();
	}

	@Override
	public boolean deleteEmail(int mail_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Email> getEmails() {
		return repository.findAll();
	}

	@Override
	public Email getEmail(int mail_id) {
		return repository.findById(mail_id).get();
	}

}
