package com.masai.webapp.example.config;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.webapp.example.entity.Email;
import com.masai.webapp.example.entity.User;
import com.masai.webapp.example.service.EmailService;
import com.masai.webapp.example.service.UserService;

import jakarta.annotation.PostConstruct;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/bookservice")
public class MyController {
	@Autowired
	UserService serviceuser;
	@Autowired
	EmailService serviceemail;
	
	@PostConstruct
	public void working() {
		System.out.println("Postconstruct working");
	}
	
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return serviceuser.getUsers();}
	

	@PostMapping("/users")
	public List<User> createUser(@RequestBody User user) {
		return serviceuser.addUser(user);}
	
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable int id) {
		return serviceuser.getUser(id);}
	

	
	@DeleteMapping("/users/{id}")
	public List<User> deleteUser(@PathVariable int id){
		serviceuser.deleteUser(1);
		return serviceuser.getUsers();}
	
	@PostMapping("/user/{id}/mail")
	public List<Email> createEmail(@RequestBody Email email) {
		return serviceemail.addEmail(email);}

	@GetMapping("/users/{id}/mail/{mail_id}")
	public Email getEmail(@PathVariable int mail_id) {
		return serviceemail.getEmail(mail_id);}
}
