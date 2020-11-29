package com.mbilgil.swag.model.Repository;

import com.mbilgil.swag.model.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface  UserRepository  extends CrudRepository<User,Long>{
	
	User findByUserId(Long userId);
	User findByName(String userName);
	User findBySurname(String surname);

}
