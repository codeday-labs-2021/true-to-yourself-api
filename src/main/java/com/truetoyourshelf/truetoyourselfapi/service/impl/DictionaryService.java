package com.truetoyourshelf.truetoyourselfapi.service.impl;

import com.truetoyourshelf.truetoyourselfapi.client.IDictionaryClient;
import com.truetoyourshelf.truetoyourselfapi.model.DictionaryRequest;
import com.truetoyourshelf.truetoyourselfapi.model.DictionaryResponse;
import com.truetoyourshelf.truetoyourselfapi.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService {

    private final IDictionaryClient dictionaryClient;

    @Autowired
    public DictionaryService(final IDictionaryClient dictionaryClient) {
        this.dictionaryClient = dictionaryClient;
    }

    @Override
    public DictionaryResponse findSynonyms(DictionaryRequest dictionaryRequest) {
        return dictionaryClient.retrieveSynonyms(dictionaryRequest.getEmotionInput(), dictionaryRequest.getApiKey());
    }

}
