package com.example.graphqlspringboottutorial.repository;

import com.example.graphqlspringboottutorial.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}
