package com.leo.liblog.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;
@Entity
@Getter
@ToString
public class PostDetail {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = true)
	private String bookTitle;
	@Column(nullable = true)
	private String bookContent;
	
	private String bookIntro;
	private String bookHashtag;
	private Date bookPostDate;
	private Date bookModifyDate;
	private Long writerId;
	
	public String getBookTitle() {
		return bookTitle;
	}
	public String getBookContent() {
		return bookContent;
	}
	public String getBookHashtag() {
		return bookHashtag;
	}
	public String getBookIntro() {
		return bookIntro;
	}
	public Date getBookPostDate() {
		return bookPostDate;
	}
	public Date getBookModifyDate() {
		return bookModifyDate;
	}
	public Long getWriterId() {
		return writerId;
	}
	
	
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public void setBookContent(String bookContent) {
		this.bookContent = bookContent;
	}
	public void setBookHashtag(String bookHashtag) {
		this.bookHashtag = bookHashtag;
	}
	public void setBookIntro(String bookIntro) {
		this.bookIntro = bookIntro;
	}
	public void setBookModifyDate(Date bookModifyDate) {
		this.bookModifyDate = bookModifyDate;
	}
	
	
	
	
	
	
	
	
	
	
	
}
