package com.leo.liblog.controller;

import java.sql.Array;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.leo.liblog.model.PostDetail;
import com.leo.liblog.repository.PostDetailRepository;

@Controller
public class PostController {
	
//	private final PostDetailRepository postDetailRepository = null;
	
	@PostMapping("/users/posting")
	ResponseEntity<String> appendPost(@RequestBody Map<String, String> formData) {
//		PostDetail postDetail = new PostDetail();
		System.out.println(formData);
//		postDetailRepository.save()
		
		return ResponseEntity.status(200).body("축하합니다. 책을 출판하셨네요!");
	}
}
