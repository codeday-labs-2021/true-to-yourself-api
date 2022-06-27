package com.truetoyourshelf.truetoyourselfapi.controller;
import com.truetoyourshelf.truetoyourselfapi.model.library.BookRequest;
import com.truetoyourshelf.truetoyourselfapi.model.library.BookResponse;
import com.truetoyourshelf.truetoyourselfapi.model.library.Emotions;
import com.truetoyourshelf.truetoyourselfapi.service.ILibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;

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
}
