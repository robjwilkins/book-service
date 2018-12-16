package com.wilkins.demo.controllers;

import com.wilkins.demo.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController("book")
public class BookController {

    @GetMapping
    public List<Book> getBooks() {
        Book warAndPeace = new Book("War and Peace", "Leo Tolstoy");
        Book theHobbit = new Book("The Hobbit", "JRR Tolkein");
        return Arrays.asList(warAndPeace, theHobbit);
    }
}
