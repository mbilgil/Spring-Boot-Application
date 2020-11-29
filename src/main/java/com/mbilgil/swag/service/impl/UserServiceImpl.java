package com.mbilgil.swag.service.impl;

import com.mbilgil.swag.mapper.UserMapper;
import com.mbilgil.swag.model.Entity.User;
import com.mbilgil.swag.model.Repository.UserRepository;
import com.mbilgil.swag.model.UserDTO;
import com.mbilgil.swag.service.intf.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public abstract class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	private UserMapper userMapper;
	Long createUserId = (long) 10;
	Long updateUserId = (long) 11;
	
	public User getUserbyUserId(Long userId) {
		return userRepository.findByUserId(userId); 
	}
	
	public UserDTO createUser(UserDTO userDTO) {
		User user = userMapper.dtoToEntity(userDTO);
		user.setUserId(createUserId);
		user = userRepository.save(user);
		return getUserDetails(user);
	}
	
	public UserDTO updateUser(UserDTO userDTO) {
		User user = userMapper.dtoToEntity(userDTO);
		user.setUpdatedUserId(updateUserId);
		user = userRepository.save(user);
		return getUserDetails(user);
	} 
	
	public void deleteUserById(Long userId) {
		userRepository.deleteById(userId);
	}
	
	
	private UserDTO getUserDetails(User user) {
		UserDTO userDTO = userMapper.entityToDto(user);
		return userDTO;
	}

}
