package com.project.nhasach.springboot.service;

import com.project.nhasach.springboot.dto.BookDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBookService {
    BookDTO save(BookDTO bookDTO);

    void delete(Long id);
    List<BookDTO> findAll(Pageable pageable);

    int totalItem();
}
