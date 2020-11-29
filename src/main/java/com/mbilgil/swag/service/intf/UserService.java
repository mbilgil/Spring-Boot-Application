package com.mbilgil.swag.service.intf;

import com.mbilgil.swag.model.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
	
	public UserDTO getUserByUserId(Long userId);
	
	public UserDTO createUser(UserDTO userDTO);
	
	public UserDTO updateUser(UserDTO userDTO);
	
	public void deleteUser(Long userId);
	

}
