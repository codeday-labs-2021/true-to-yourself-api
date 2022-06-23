package com.truetoyourshelf.truetoyourselfapi.service;

import com.truetoyourshelf.truetoyourselfapi.model.library.BookRequest;
import com.truetoyourshelf.truetoyourselfapi.model.library.BookResponse;

import java.util.ArrayList;

public interface ILibraryService {

    BookResponse extractData(BookRequest bookRequest);

    ArrayList<String> findBooks(BookResponse bookResponse);
}
