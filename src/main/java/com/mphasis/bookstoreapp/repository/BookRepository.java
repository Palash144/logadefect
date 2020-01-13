package com.mphasis.bookstoreapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.bookstoreapp.model.Book;

@Repository(value = "bookRepository")
public interface BookRepository extends JpaRepository<Book, Integer> {

	public List<Book> findByBookTitleContaining(String booktitle);
}
