package com.leo.liblog.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Setter
public class User {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@Column(nullable=false)
	private String userEmail;
	
	@Column(nullable=false)
	private String username;
	
	@Column(nullable=false)
	private String userDisplayName;
	
	@Column(nullable=false)
	private String userPassword;
	
	public Long getUserId() {
		return userId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public String getUsername() {
		return username;
	}
	
	
	
}
