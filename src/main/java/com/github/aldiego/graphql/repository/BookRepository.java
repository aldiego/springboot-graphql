package com.github.aldiego.graphql.repository;

import com.github.aldiego.graphql.model.Book;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
  Optional<Book> findByIsbn(String isbn);
}
