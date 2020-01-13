package com.mphasis.bookstoreapp.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mphasis.bookstoreapp.model.Book;
import com.mphasis.bookstoreapp.repository.BookRepository;

@Service(value = "bookServiceImpl")
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	@Qualifier("bookRepository")
	private BookRepository bookRepo;
	
	@Override
	public Optional<Book> findByBookId(Integer id) {
		return bookRepo.findById(id);
	}

	@Override
	public List<Book> findByBookTitle(String title) {
		return bookRepo.findByBookTitleContaining(title);
	}

	@Override
	public List<Book> findAll() {
		return bookRepo.findAll();
	}

	@Override
	public Book save(Book book) {
		return bookRepo.save(book);
	}

}
