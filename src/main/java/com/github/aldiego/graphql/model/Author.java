package com.github.aldiego.graphql.model;

import static jakarta.persistence.GenerationType.IDENTITY;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "authors")
@Getter
@Setter
public class Author {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;

  private String fullname;
  private String email;

  @OneToMany(mappedBy = "author", fetch = FetchType.EAGER)
  private List<Book> books = new ArrayList<>();
}
