package com.truetoyourshelf.truetoyourselfapi.service;

import com.truetoyourshelf.truetoyourselfapi.model.dictionary.DictionaryRequest;
import com.truetoyourshelf.truetoyourselfapi.model.dictionary.DictionaryResponse;

import java.util.ArrayList;

public interface IDictionaryService {

    DictionaryResponse extractData(DictionaryRequest dictionaryRequest);

    ArrayList<String> findSynonyms(DictionaryResponse dictionaryResponse)  ;
}
