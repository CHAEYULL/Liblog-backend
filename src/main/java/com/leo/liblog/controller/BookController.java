package com.leo.liblog.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.leo.liblog.model.Book;
import com.leo.liblog.repository.BookRepository;
import com.leo.liblog.service.BookService;

import lombok.RequiredArgsConstructor;



@Controller
@RequiredArgsConstructor
public class BookController {
	private final BookRepository bookRepository;
	private final BookService bookService;
	@PostMapping("/users/posting")
	@ResponseBody
	ResponseEntity<String> appendPost(@RequestBody Map<String, String> formData) {
		bookService.appendPostSerive(formData);
		return ResponseEntity.status(200).body("축하합니다. 책을 출판하셨네요!");
	}
	@GetMapping("/postLists")
	@ResponseBody
	List<Book> getBookData(){
		List<Book> result = bookRepository.findAll();
		return result;
	}

}
