package com.truetoyourshelf.truetoyourselfapi.controller;
import com.truetoyourshelf.truetoyourselfapi.model.library.BookRequest;
import com.truetoyourshelf.truetoyourselfapi.model.library.BookResponse;
import com.truetoyourshelf.truetoyourselfapi.model.library.Emotions;
import com.truetoyourshelf.truetoyourselfapi.service.ILibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Controller
public class MainController {

    private ILibraryService libraryService;

    @Autowired
    public MainController(ILibraryService libraryService) {this.libraryService = libraryService;}

    @GetMapping("/emotion-request")
    public ResponseEntity<ArrayList<BookResponse>> bookUrl(Emotions query,
                                                           Integer pageSize,
                                                           String apiKey) {
        BookRequest bookRequest = new BookRequest(Emotions.getEmotion(query),
                                                    pageSize,
                                                    apiKey);

        ArrayList<BookResponse> bookResponse = libraryService.extractData(bookRequest);

        return ResponseEntity.ok(bookResponse);
    }


    @GetMapping("/emotions")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Emotions[]> getEmotionsOptions(){
        return ResponseEntity.ok(Emotions.values());

    }

}
