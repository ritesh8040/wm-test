package test.pp.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.aspectj.apache.bcel.classfile.Module.Uses;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import test.pp.entity.Cabs;
import test.pp.entity.users;
import test.pp.repo.UserRepo;

@RestController
public class UserController {

	@Autowired
	UserRepo repo;
	
	@PostMapping("/add")
	public Response add(users user) {
		repo.save(user);
		return null;
	}
	@GetMapping("/getAllUsers")
	public List<users> get() {
		
		return (List<users>) repo.findAll();
	}
	
}
