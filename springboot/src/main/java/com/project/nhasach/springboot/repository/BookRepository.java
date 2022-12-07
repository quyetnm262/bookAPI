package com.project.nhasach.springboot.repository;

import com.project.nhasach.springboot.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
