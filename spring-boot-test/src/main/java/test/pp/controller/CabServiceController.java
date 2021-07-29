package test.pp.controller;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import test.pp.entity.Cabs;
import test.pp.entity.users;
import test.pp.repo.UserRepo;
import test.pp.repo.CabRepo;

@RestController
public class CabServiceController {

	@Autowired
	UserRepo repo;
	@Autowired
	CabRepo repo1;
	
	@GetMapping("/getAllCabs")
	public List<Cabs> get() {
		
		return (List<Cabs>) repo1.findAll();
	}
	@PostMapping("/add/cab")
	public Response add(Long userId, Cabs details) {
		Optional<users> customerToUpdate =  repo.findById(userId);
		if(!customerToUpdate.isEmpty()) {
			users usr = customerToUpdate.get();
			usr.getCabs().add(details);
			repo.save(usr);
		}
		return null;
	}
}
