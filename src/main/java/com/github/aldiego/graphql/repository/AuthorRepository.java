package com.github.aldiego.graphql.repository;

import com.github.aldiego.graphql.model.Author;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
  Optional<Author> findByEmail(String email);
}
