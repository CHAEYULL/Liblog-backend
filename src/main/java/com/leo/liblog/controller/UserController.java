package com.leo.liblog.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.leo.liblog.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserController {
	@Autowired
	private final UserRepository userRepository;
	
	@PostMapping("users/register")
	@ResponseBody
	ResponseEntity<String> userRegister(@RequestBody Map<String, String> formData) {
		
		return ResponseEntity.status(200).body("가입완료");
	}
	
	
	
	
	
	
	
}

















