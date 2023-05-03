package com.github.aldiego.graphql.entrypoint;

import com.github.aldiego.graphql.model.Book;
import com.github.aldiego.graphql.service.BookService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BookGraphQL implements GraphQLMutationResolver, GraphQLQueryResolver {

  private final BookService bookService;

  public Optional<Book> findBook(String isbn) {
    return bookService.findBook(isbn);
  }

  public Book createBook(Book book, String email) {
    return bookService.create(book, email);
  }
}
