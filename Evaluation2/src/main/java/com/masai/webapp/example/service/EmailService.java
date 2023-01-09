package com.masai.webapp.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.webapp.example.entity.Email;

@Service
public interface EmailService {
	public List<Email> addEmail(Email email);
	public boolean deleteEmail(int mail_id);
	public List<Email> getEmails();
	public Email getEmail(int mail_id);

}
