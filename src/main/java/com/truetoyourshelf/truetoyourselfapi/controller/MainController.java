package com.truetoyourshelf.truetoyourselfapi.controller;

import com.truetoyourshelf.truetoyourselfapi.Book;
import com.truetoyourshelf.truetoyourselfapi.model.library.BookRequest;
import com.truetoyourshelf.truetoyourselfapi.model.library.BookResponse;
import com.truetoyourshelf.truetoyourselfapi.service.ILibraryService;
import com.truetoyourshelf.truetoyourselfapi.service.impl.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import java.lang.reflect.Array;
import java.util.ArrayList;


@Controller
public class MainController {

    private ILibraryService libraryService;

    @Autowired
//    public MainController(ILibraryService libraryService) {this.libraryService = libraryService}

    //get
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World!";
    }

    @GetMapping("/emotion-request")
    public ResponseEntity<ArrayList<String>> bookUrl(String query,
                                                     String type,
                                                     String fields,
                                                     String language,
                                                     Integer pageSize,
                                                     String apiKey) {
        BookRequest bookRequest = new BookRequest(query,
                                                    type,
                                                    fields,
                                                    language,
                                                    pageSize,
                                                    apiKey);

        BookResponse bookResponse = libraryService.extractData(bookRequest);
        ArrayList<String> books = libraryService.findBooks(bookResponse);
        return ResponseEntity.ok(books);
    }

}
