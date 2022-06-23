package com.truetoyourshelf.truetoyourselfapi.service.impl;

import com.truetoyourshelf.truetoyourselfapi.client.ILibraryClient;
import com.truetoyourshelf.truetoyourselfapi.model.dictionary.DictionaryRequest;
import com.truetoyourshelf.truetoyourselfapi.model.dictionary.DictionaryResponse;
import com.truetoyourshelf.truetoyourselfapi.model.library.BookRequest;
import com.truetoyourshelf.truetoyourselfapi.model.library.BookResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class LibraryService {

    private final ILibraryClient libraryClient;
    private Object LinkedHashMap;

    @Autowired
    public LibraryService(final ILibraryClient libraryClient) { this.libraryClient = libraryClient;}

//    @Override
//    public BookResponse extractData(BookRequest bookRequest) {
//        ArrayList<?> fullResponse = libraryClient.retrieveBooks(bookRequest.getSearchWord(),
//                                                                bookRequest.getType(),
//                                                                bookRequest.getFields(),
//                                                                bookRequest.getLanguage(),
//                                                                bookRequest.getPageSize(),
//                                                                bookRequest.getApiKey());
//
//        java.util.LinkedHashMap<?, ?> fullFirstResponse = (java.util.LinkedHashMap<?, ?>) ((LinkedHashMap)fullResponse.get(0)).get("meta");
//        return convertResponseToBookResponse(fullFirstResponse);
//    }

//    @Override
//    public ArrayList<String> findBooks(BookResponse bookResponse) {
//        ArrayList<String> books = new ArrayList<>();
//        bookResponse.getBooks().forEach(index -> index.forEach(book -> books.add(book)));
//        return books;
//    }

//    private BookResponse convertResponseToBookResponse(LinkedHashMap fullFirstResponse) {
//        DictionaryResponse dictionaryResponse = new DictionaryResponse();
//        dictionaryResponse.setId((String) fullFirstResponse.get("id"));
//        dictionaryResponse.setSyns((ArrayList<ArrayList<String>>) fullFirstResponse.get("syns"));
//        dictionaryResponse.setAnts((ArrayList<ArrayList<String>>) fullFirstResponse.get("ants"));
//        dictionaryResponse.setOffensive((Boolean) fullFirstResponse.get("offensive"));
//        return dictionaryResponse;
//    }


}
