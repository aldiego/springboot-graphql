package com.github.aldiego.graphql.service;

import com.github.aldiego.graphql.model.Author;
import com.github.aldiego.graphql.repository.AuthorRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthorService {

  private final AuthorRepository authorRepository;

  public Author create(Author author) {
    return authorRepository.save(author);
  }

  public Optional<Author> findAuthorByEmail(String email) {
    return authorRepository.findByEmail(email);
  }
}
