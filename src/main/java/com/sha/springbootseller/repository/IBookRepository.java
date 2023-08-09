package com.sha.springbootseller.repository;

import com.sha.springbootseller.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface IBookRepository extends JpaRepository<Book,Long> {
}
