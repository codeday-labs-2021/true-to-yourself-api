package com.truetoyourshelf.truetoyourselfapi.service.impl;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.truetoyourshelf.truetoyourselfapi.client.ILibraryClient;
import com.truetoyourshelf.truetoyourselfapi.model.library.BookRequest;
import com.truetoyourshelf.truetoyourselfapi.model.library.BookResponse;
import com.truetoyourshelf.truetoyourselfapi.service.ILibraryService;
import io.micrometer.core.instrument.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

@Service
public class LibraryService implements ILibraryService {

    private final ILibraryClient libraryClient;

    @Autowired
    public LibraryService(final ILibraryClient libraryClient) { this.libraryClient = libraryClient;}

    @Override
    public ArrayList<BookResponse> extractData(BookRequest bookRequest) {

        String searchableQueryString = wireUpEmotionsMap(bookRequest.getSearchWord());

        HashMap<?,?> fullResponse = libraryClient.retrieveBooks(searchableQueryString.toUpperCase(Locale.ROOT), bookRequest.getType(), bookRequest.getFields(), bookRequest.getLanguage(), bookRequest.getPageSize(), bookRequest.getApiKey());

        ArrayList<BookResponse> books = (ArrayList<BookResponse>) fullResponse.get("docs");

        return books;
    }

    private static String wireUpEmotionsMap(String emotion) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            HashMap emotionsMap = mapper.readValue(getJson("EmotionsMap.json"), HashMap.class);
            String searchable = String.valueOf(emotionsMap.get(emotion));
            return searchable;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return "There was a json processing issue.";
    }

    public static String getJson(String filename) throws Exception {
        return new String(Files.readAllBytes(Paths.get(JsonUtils.class.getClassLoader()
                                                                      .getResource(filename)
                                                                      .toURI())));
    }
}
