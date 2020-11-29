package com.mbilgil.swag.mapper;

import com.mbilgil.swag.model.Entity.User;
import com.mbilgil.swag.model.UserDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

	User dtoToEntity(UserDTO userDTO);
	UserDTO entityToDto(User user);
}
