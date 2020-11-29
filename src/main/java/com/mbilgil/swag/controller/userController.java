package com.mbilgil.swag.controller;

import com.mbilgil.swag.model.UserDTO;
import com.mbilgil.swag.service.intf.UserService;
import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Api(value="User Rest Service")
public class userController {
	
	private UserService userService;
	
	
	@GetMapping("/{userId}")
	public  ResponseEntity <UserDTO> getUserByUserId(@PathVariable Long userId){
		UserDTO userDTO = userService.getUserByUserId(userId);
		return new ResponseEntity<>(userDTO,HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity <UserDTO> createUser(@RequestBody  UserDTO userDTO){
		UserDTO createdUserDTO = userService.createUser(userDTO);
		return new ResponseEntity<>(createdUserDTO,HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity <UserDTO> updateUser(@RequestBody  UserDTO userDTO){
		UserDTO updatedUserDTO = userService.createUser(userDTO);
		return new ResponseEntity<>(updatedUserDTO,HttpStatus.OK);
	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity deleteUser(@PathVariable Long userId) {
		userService.deleteUser(userId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	
	

}
