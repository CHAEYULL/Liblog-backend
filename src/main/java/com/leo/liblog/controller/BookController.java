package com.leo.liblog.controller;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.leo.liblog.model.Book;
import com.leo.liblog.repository.BookRepository;
import com.leo.liblog.repository.UserRepository;
import com.leo.liblog.service.BookService;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
public class BookController {
	@Autowired
	private final BookRepository bookRepository;
	@Autowired
	private final BookService bookService;

	
	@PostMapping("/users/posting")
	@ResponseBody
	ResponseEntity<String> appendPost(@RequestBody Map<String, String> formData) {
		bookService.appendPostSerive(formData);
		return ResponseEntity.status(200).body("축하합니다. 책을 출판하셨네요!");
	}
	@PostMapping("/users/editing")
	@ResponseBody
	ResponseEntity<String> editPost(@RequestBody Map<String, String> formData) {
		bookService.editPostService(formData);
		return ResponseEntity.status(200).body("수정 완료");
	}
	@DeleteMapping("/post-delete")
	@ResponseBody
	ResponseEntity<String> deletePost(@RequestParam("docid") Long docid) {
		bookRepository.deleteById(docid);
		return ResponseEntity.status(200).body("삭제 완료");
	}
	@GetMapping("/postLists")
	@ResponseBody
	List<Book> getBookData(){
		List<Book> result = bookRepository.findAll();
		return result;
	}
	@GetMapping("/post-edit/{id}")
	@ResponseBody
	Optional<Book> getBookEditData(@PathVariable("id") Long id){
		Optional<Book> result = bookRepository.findById(id);
		System.out.println(id);
		return result;
	}
	@GetMapping("/post-detail/{id}")
	@ResponseBody
	Optional<Book> getBookDetailData(@PathVariable("id") Long id){

		Optional<Book> result = bookRepository.findById(id);
		return result;
	}
}
