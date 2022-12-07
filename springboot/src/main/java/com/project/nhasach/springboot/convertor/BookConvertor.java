package com.project.nhasach.springboot.convertor;

import com.project.nhasach.springboot.dto.BookDTO;
import com.project.nhasach.springboot.entity.BookEntity;
import org.springframework.stereotype.Component;

@Component
public class BookConvertor {
    public BookEntity toEntity(BookDTO bookDTO){

        BookEntity bookEntity = new BookEntity();
        bookEntity.setId(bookDTO.getId());
        bookEntity.setAuthor(bookDTO.getAuthor());
        bookEntity.setCategory(bookDTO.getCategory());
        bookEntity.setTile(bookDTO.getTile());
        bookEntity.setPublisher(bookDTO.getPublisher());
        bookEntity.setPublishYear(bookDTO.getPublishYear());
        bookEntity.setPrice(bookDTO.getPrice());
        bookEntity.setAmount(bookDTO.getAmount());

        return bookEntity;

    }
    public BookEntity toEntity(BookDTO bookDTO, BookEntity bookEntity){

        bookEntity.setId(bookDTO.getId());
        bookEntity.setAuthor(bookDTO.getAuthor());
        bookEntity.setCategory(bookDTO.getCategory());
        bookEntity.setTile(bookDTO.getTile());
        bookEntity.setPublisher(bookDTO.getPublisher());
        bookEntity.setPublishYear(bookDTO.getPublishYear());
        bookEntity.setPrice(bookDTO.getPrice());
        bookEntity.setAmount(bookDTO.getAmount());

        return bookEntity;

    }
    public BookDTO toDTO(BookEntity bookEntity){


        BookDTO bookDTO = new BookDTO();
        bookDTO.setId(bookEntity.getId());
        bookDTO.setAuthor(bookEntity.getAuthor());
        bookDTO.setCategory(bookEntity.getCategory());
        bookDTO.setTile(bookEntity.getTile());
        bookDTO.setPublisher(bookEntity.getPublisher());
        bookDTO.setPublishYear(bookEntity.getPublishYear());
        bookDTO.setPrice(bookEntity.getPrice());
        bookDTO.setAmount(bookEntity.getAmount());
        return bookDTO;

    }

}
