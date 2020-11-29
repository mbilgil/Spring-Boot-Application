package com.mbilgil.swag.model.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="user")
public class User {
		@Id
		@GeneratedValue
		private Long userId;
		
		private String userName;
		
		private String surname;
		
		private String userPhone;
		
		private String userMail;
		
		private Long updatedUserId;
}
