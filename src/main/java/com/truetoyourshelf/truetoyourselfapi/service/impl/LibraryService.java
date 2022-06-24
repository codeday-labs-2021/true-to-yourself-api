package com.truetoyourshelf.truetoyourselfapi.service.impl;
import com.truetoyourshelf.truetoyourselfapi.client.ILibraryClient;
import com.truetoyourshelf.truetoyourselfapi.model.library.BookRequest;
import com.truetoyourshelf.truetoyourselfapi.model.library.BookResponse;
import com.truetoyourshelf.truetoyourselfapi.service.ILibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;

@Service
public class LibraryService implements ILibraryService {

    private final ILibraryClient libraryClient;

    @Autowired
    public LibraryService(final ILibraryClient libraryClient) { this.libraryClient = libraryClient;}

    @Override
    public ArrayList<BookResponse> extractData(BookRequest bookRequest){

        HashMap<?,?> fullResponse = libraryClient.retrieveBooks(bookRequest.getSearchWord(), bookRequest.getType(), bookRequest.getFields(), bookRequest.getLanguage(), bookRequest.getPageSize(), bookRequest.getApiKey());

        ArrayList<BookResponse> books = (ArrayList<BookResponse>) fullResponse.get("docs");

        return books;
    }

//    private HashMap<?,?> toBookResponse( HashMap<?,?> books){
//        HashMap<?,?> bookResponse = new BookResponse();
//        bookResponse.setType((String) fullFirstResponse.get("sourceResource.type"));
//        bookResponse.setTitle((String) fullFirstResponse.get("sourceResource.title"));
//        bookResponse.setCreator((String) fullFirstResponse.get("sourceResource.creator"));
//        bookResponse.setSubject((ArrayList<?>) fullFirstResponse.get("sourceResource.subject"));
////        bookResponse.setType((String) fullFirstResponse.get("sourceResource.type.name")); ???
//        return bookResponse;
//    }

}
