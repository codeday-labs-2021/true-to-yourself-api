package com.truetoyourshelf.truetoyourselfapi.controller;

import com.truetoyourshelf.truetoyourselfapi.model.DictionaryRequest;
import com.truetoyourshelf.truetoyourselfapi.model.DictionaryResponse;
import com.truetoyourshelf.truetoyourselfapi.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DictionaryController {

    private IDictionaryService dictionaryService;

    @Autowired
    public DictionaryController(IDictionaryService dictionaryService) {
        this.dictionaryService = dictionaryService;
    }

    @GetMapping("emotion")
    public ResponseEntity<DictionaryResponse> emotion(String emotion, String apiKey) {
        DictionaryRequest dictionaryRequest = new DictionaryRequest();
        dictionaryRequest.setEmotionInput(emotion);
        dictionaryRequest.setApiKey(apiKey);
        DictionaryResponse dictionaryResponse = dictionaryService.findSynonyms(dictionaryRequest);
        return ResponseEntity.ok(dictionaryResponse);
    }

}
