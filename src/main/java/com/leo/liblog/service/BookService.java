package com.leo.liblog.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.leo.liblog.model.Book;
import com.leo.liblog.repository.BookRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService {
	
	private final BookRepository bookRepository;
	
	public void appendPostSerive(Map<String, String> formData) {
		Book book = new Book();
		book.setBookTitle(formData.get("bookTitle"));
		book.setBookContent(formData.get("bookContent"));
 		bookRepository.save(book);
	}

}
