package com.github.aldiego.graphql.entrypoint;

import com.github.aldiego.graphql.model.Author;
import com.github.aldiego.graphql.service.AuthorService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AuthorGraphQL implements GraphQLMutationResolver, GraphQLQueryResolver {

  private final AuthorService authorService;

  public Optional<Author> findAuthor(String email) {
    return authorService.findAuthorByEmail(email);
  }

  public Author createAuthor(Author author) {
    return authorService.create(author);
  }
}
