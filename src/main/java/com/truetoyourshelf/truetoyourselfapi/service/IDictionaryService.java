package com.truetoyourshelf.truetoyourselfapi.service;

import com.truetoyourshelf.truetoyourselfapi.model.DictionaryRequest;
import com.truetoyourshelf.truetoyourselfapi.model.DictionaryResponse;

public interface IDictionaryService {

    DictionaryResponse findSynonyms(DictionaryRequest dictionaryRequest);
}
