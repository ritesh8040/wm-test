package test.pp.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import test.pp.entity.users;

@Repository
public interface UserRepo extends CrudRepository<users, Long> {

	  List<users> findByName(String name);

	  users findById(long id);
	}