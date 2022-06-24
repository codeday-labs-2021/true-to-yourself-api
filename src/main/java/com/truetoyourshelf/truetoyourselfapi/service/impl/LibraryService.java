package com.truetoyourshelf.truetoyourselfapi.service.impl;

import com.truetoyourshelf.truetoyourselfapi.Book;
import com.truetoyourshelf.truetoyourselfapi.client.ILibraryClient;
import com.truetoyourshelf.truetoyourselfapi.model.dictionary.DictionaryRequest;
import com.truetoyourshelf.truetoyourselfapi.model.dictionary.DictionaryResponse;
import com.truetoyourshelf.truetoyourselfapi.model.library.BookRequest;
import com.truetoyourshelf.truetoyourselfapi.model.library.BookResponse;
import com.truetoyourshelf.truetoyourselfapi.service.ILibraryService;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.websocket.OnError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

@Service
public class LibraryService implements ILibraryService {

    private final ILibraryClient libraryClient;
    private Object LinkedHashMap;

    @Autowired
    public LibraryService(final ILibraryClient libraryClient) { this.libraryClient = libraryClient;}

    @Override
    public BookResponse extractData(BookRequest bookRequest){

        ArrayList<?> fullResponse = libraryClient.retrieveBooks(bookRequest.getSearchWord(), bookRequest.getType(), bookRequest.getFields(), bookRequest.getLanguage(), bookRequest.getPageSize(), bookRequest.getApiKey());
        ArrayList<HashMap<String,?>> fullFirstResponse = (java.util.ArrayList<HashMap<String,?>>) ((ArrayList<HashMap<String,?>>)fullResponse.get(0)).get(0).get("docs");
        return
    }

    @Override
    public ArrayList<String> findBooks(BookResponse bookResponse) {
        return null;
    }

//    @Override
//    public ArrayList<?> findBook(BookResponse bookResponse){
//
//    }




    private BookResponse toBookResponse( ArrayList fullFirstResponse){
        BookResponse bookResponse = new BookResponse();
        bookResponse.setType((String) fullFirstResponse.get("sourceResource.type"));
        bookResponse.setTitle((String) fullFirstResponse.get("sourceResource.title"));
        bookResponse.setCreator((String) fullFirstResponse.get("sourceResource.creator"));
        bookResponse.setSubject((ArrayList<?>) fullFirstResponse.get("sourceResource.subject"));
//        bookResponse.setType((String) fullFirstResponse.get("sourceResource.type.name")); ???
        return bookResponse;
    }





}
