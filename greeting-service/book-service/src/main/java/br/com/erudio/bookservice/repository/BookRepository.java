package br.com.erudio.bookservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.erudio.bookservice.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
