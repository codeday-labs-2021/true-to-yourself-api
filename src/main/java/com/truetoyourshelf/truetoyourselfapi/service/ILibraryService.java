package com.truetoyourshelf.truetoyourselfapi.service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.truetoyourshelf.truetoyourselfapi.model.library.BookRequest;
import com.truetoyourshelf.truetoyourselfapi.model.library.BookResponse;
import java.util.ArrayList;

public interface ILibraryService {

    ArrayList<BookResponse> extractData(BookRequest bookRequest) throws JsonProcessingException;
}
