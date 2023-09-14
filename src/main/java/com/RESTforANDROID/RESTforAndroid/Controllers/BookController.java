package com.RESTforANDROID.RESTforAndroid.Controllers;

import com.RESTforANDROID.RESTforAndroid.Model.book.Book;
import com.RESTforANDROID.RESTforAndroid.Model.book.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookDAO bookDAO;

    @GetMapping
    public List<Book> getAllBooks(){

        return bookDAO.getAllBooks();
    }
}
