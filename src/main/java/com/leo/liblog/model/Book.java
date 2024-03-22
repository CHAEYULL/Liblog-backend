package com.leo.liblog.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.ToString;

@Entity
@ToString
@Getter
public class Book {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookId;
	
	@Column(nullable = false)
	private String bookTitle;
	@Column(nullable = false)
	private String bookContent;
//	@Column(nullable = false,columnDefinition = "TEXT" )
//	private Date bookPostDate;
	
	public Long getBookId() {
		return bookId;
	}
//	public Date getBookPostDate() {
//		return bookPostDate;
//	}
	public void setBookTitle( String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public void setBookContent(String bookContent) {
		this.bookContent = bookContent;
	}
	
}
