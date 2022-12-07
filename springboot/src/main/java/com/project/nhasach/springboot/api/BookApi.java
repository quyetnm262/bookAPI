package com.project.nhasach.springboot.api;

import com.project.nhasach.springboot.api.output.BookOutput;
import com.project.nhasach.springboot.convertor.BookConvertor;
import com.project.nhasach.springboot.dto.BookDTO;
import com.project.nhasach.springboot.service.impl.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookApi {

    @Autowired
    BookService bookService;

    @Autowired
    BookConvertor bookConvertor;

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    @ResponseBody
    public BookDTO addBook(@RequestBody BookDTO bookDTO){ // Create method
        return bookService.save(bookDTO);
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public BookDTO updateBook(@RequestBody BookDTO bookDTO, @PathVariable Long id){ //Update method
        bookDTO.setId(id);
        return bookService.save(bookDTO);
    }

    @RequestMapping(value = "/book", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteBook(@RequestBody Long id){ // Delete method
        bookService.delete(id);
    }

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    @ResponseBody
    public BookOutput showBook(@RequestParam("page") int page,
                               @RequestParam("limit") int limit){
        BookOutput bookOutput = new BookOutput();

        Pageable pageable = new PageRequest(page-1,limit);
        bookOutput.setPage(page);
        bookOutput.setListResult(bookService.findAll(pageable));
        bookOutput.setTotalPage((int) Math.ceil(bookService.totalItem()/limit));

        return bookOutput;
    }

}
