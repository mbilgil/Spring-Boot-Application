package com.mbilgil.swag.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="User Api Doc",description="Model")
public class UserDTO {
	@ApiModelProperty(value="User ID")
	private Long userId;
	
	@ApiModelProperty(value="User Name")
	private String userName;
	
	@ApiModelProperty(value="User Surname")
	private Long surname;
	
	@ApiModelProperty(value="User Phone")
	private String userPhone;
	
	@ApiModelProperty(value="User Mail")
	private Long userEmail;
	
	@ApiModelProperty(value="User Update ID")
	private Long updateUserId;
	
	
	
}
