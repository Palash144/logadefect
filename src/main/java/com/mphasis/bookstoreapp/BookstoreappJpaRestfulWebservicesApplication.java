package com.mphasis.bookstoreapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mphasis.bookstoreapp.repository.BookRepository;

@SpringBootApplication
public class BookstoreappJpaRestfulWebservicesApplication implements CommandLineRunner  {

	@Autowired 
	@Qualifier("bookRepository")
	BookRepository bookRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreappJpaRestfulWebservicesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(bookRepo.findAll());
	}
}
