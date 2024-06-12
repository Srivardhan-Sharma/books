package com.project.books.services;

import com.project.books.domain.Book;
import java.util.List;
import java.util.Optional;

public interface BookService {

  boolean isBookExists(Book book);

  Book save(Book book);

  Optional<Book> findById(String isbn);

  List<Book> listBooks();

  void deleteBookById(String isbn);
}