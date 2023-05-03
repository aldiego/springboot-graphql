package com.github.aldiego.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.github.aldiego.graphql.model")
@EnableJpaRepositories(basePackages = "com.github.aldiego.graphql.repository")
public class GraphqlApplication {

  public static void main(String[] args) {
    SpringApplication.run(GraphqlApplication.class, args);
  }
}
