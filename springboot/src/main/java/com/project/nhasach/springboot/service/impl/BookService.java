package com.project.nhasach.springboot.service.impl;

import com.project.nhasach.springboot.convertor.BookConvertor;
import com.project.nhasach.springboot.dto.BookDTO;
import com.project.nhasach.springboot.entity.BookEntity;
import com.project.nhasach.springboot.repository.BookRepository;
import com.project.nhasach.springboot.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService implements IBookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookConvertor bookConvertor;
    @Override
    public BookDTO save(BookDTO bookDTO) {
        BookEntity bookEntity;
        if (bookDTO.getId() != null){
            BookEntity oldBookEntity = bookRepository.findById(bookDTO.getId()).orElse(null);
            bookEntity = bookConvertor.toEntity(bookDTO, oldBookEntity);
        }else {
            bookEntity = bookConvertor.toEntity(bookDTO);
        }

        bookRepository.save(bookEntity);
        return bookConvertor.toDTO(bookEntity);
    }

    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public List<BookDTO> findAll(Pageable pageable) {
        List<BookDTO> result = new ArrayList<>();
        List<BookEntity> bookEntities  = bookRepository.findAll(pageable).getContent();
        for (BookEntity bookEntity:bookEntities) {
            result.add(bookConvertor.toDTO(bookEntity));
        }
        if (result.size() == 0) return null;
        return result;
    }

    @Override
    public int totalItem(){
        return (int) bookRepository.count();
    }
}
