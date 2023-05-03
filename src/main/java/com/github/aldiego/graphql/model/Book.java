package com.github.aldiego.graphql.model;

import static jakarta.persistence.GenerationType.IDENTITY;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "books")
@Where(clause = "is_active = true")
@Getter
@Setter
public class Book {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;

  private String isbn = UUID.randomUUID().toString();
  private String title;
  private String subject;
  @ManyToOne private Author author;
  private LocalDate createdAt = LocalDate.now();

  @Column(name = "is_active")
  private boolean active = true;
}
