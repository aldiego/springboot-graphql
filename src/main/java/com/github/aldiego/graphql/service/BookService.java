package com.github.aldiego.graphql.service;

import com.github.aldiego.graphql.model.Book;
import com.github.aldiego.graphql.repository.BookRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {

  private final BookRepository bookRepository;
  private final AuthorService authorService;

  public Book create(Book book, String email) {
    book.setAuthor(authorService.findAuthorByEmail(email).get());
    return bookRepository.save(book);
  }

  public Optional<Book> findBook(String isbn) {
    return bookRepository.findByIsbn(isbn);
  }
}
