package com.truetoyourshelf.truetoyourselfapi.client;

import com.truetoyourshelf.truetoyourselfapi.model.dictionary.DictionaryResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.LinkedHashMap;

@FeignClient(name = "dictionary", url = "${dictionary.url}")
public interface IDictionaryClient {

    @GetMapping(value = "/api/v3/references/ithesaurus/json/{emotion}", produces = MediaType.APPLICATION_JSON_VALUE)
    ArrayList<?> retrieveSynonyms(@PathVariable("emotion") String emotion,
                                   @RequestParam(name= "key") String key);
}
