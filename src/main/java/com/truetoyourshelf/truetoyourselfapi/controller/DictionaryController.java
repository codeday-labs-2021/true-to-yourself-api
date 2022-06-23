package com.truetoyourshelf.truetoyourselfapi.controller;

import com.truetoyourshelf.truetoyourselfapi.model.dictionary.DictionaryRequest;
import com.truetoyourshelf.truetoyourselfapi.model.dictionary.DictionaryResponse;
import com.truetoyourshelf.truetoyourselfapi.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class DictionaryController {

    private IDictionaryService dictionaryService;

    @Autowired
    public DictionaryController(IDictionaryService dictionaryService) {
        this.dictionaryService = dictionaryService;
    }

    @GetMapping("emotion")
    public ResponseEntity<ArrayList<String>> emotion(String emotion, String apiKey) {
        DictionaryRequest dictionaryRequest = new DictionaryRequest();
        dictionaryRequest.setEmotionInput(emotion);
        dictionaryRequest.setApiKey(apiKey);
        DictionaryResponse dictionaryResponse = dictionaryService.extractData(dictionaryRequest);
        ArrayList<String> synonyms = dictionaryService.findSynonyms(dictionaryResponse);
        return ResponseEntity.ok(synonyms);
    }

}
