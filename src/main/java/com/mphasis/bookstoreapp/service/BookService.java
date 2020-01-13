package com.mphasis.bookstoreapp.service;

import java.util.List;
import java.util.Optional;

import com.mphasis.bookstoreapp.model.Book;


public interface BookService {
	
public Optional<Book> findByBookId(Integer id);
	
	public List<Book> findByBookTitle(String title);
	
	public List<Book> findAll();
	
	public Book save(Book book);
}
