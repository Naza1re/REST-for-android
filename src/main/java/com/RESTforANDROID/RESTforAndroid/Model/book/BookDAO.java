package com.RESTforANDROID.RESTforAndroid.Model.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookDAO {

    @Autowired
    private BookRepository bookRepository;

    public void save(Book book){
        bookRepository.save(book);
    }
    public void delete(Book book){
        bookRepository.delete(book);
    }
    public List<Book> getAllBooks(){
        List<Book> allBooks = new ArrayList<>();
        allBooks = (List<Book>) bookRepository.findAll();
        return allBooks;
    }



}
