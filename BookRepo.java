package com.example.mongodb.repository;

//Java Program to Illustrate BookRepo File

import com.example.mongodb.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<Book, Integer> {
}


