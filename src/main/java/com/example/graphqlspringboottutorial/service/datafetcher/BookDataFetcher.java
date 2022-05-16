package com.example.graphqlspringboottutorial.service.datafetcher;

import com.example.graphqlspringboottutorial.model.Book;
import com.example.graphqlspringboottutorial.repository.BookRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookDataFetcher implements DataFetcher<Book> {
    @Autowired
    private BookRepository bookRepository;

    public Book get(DataFetchingEnvironment dataFetchingEnvironment) throws Exception {
        String isn  =dataFetchingEnvironment.getArgument("isn");
        return bookRepository.findById(isn).orElseThrow(() -> new Exception("Book not found"));
    }
}
