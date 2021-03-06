package com.imlewis.repository;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import com.imlewis.model.User;

@Transactional
public interface UserRepository extends CrudRepository<User, Long>{
	User findByEmail(String email);
	
}
