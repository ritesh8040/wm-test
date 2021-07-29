package test.pp.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import test.pp.entity.Cabs;
import test.pp.entity.users;

@Repository
public interface CabRepo  extends CrudRepository<Cabs, Long> {

	  List<Cabs> findByName(String name);

	  Cabs findById(long id);
}
