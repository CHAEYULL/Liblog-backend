package com.leo.liblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leo.liblog.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
