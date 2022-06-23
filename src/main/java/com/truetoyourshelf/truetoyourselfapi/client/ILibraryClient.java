package com.truetoyourshelf.truetoyourselfapi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@FeignClient(name = "library", url = "${library.urll}")
public interface ILibraryClient {

    @GetMapping(value = "/v2/items", produces = MediaType.APPLICATION_JSON_VALUE)
    ArrayList<?> retrieveBooks(@RequestParam(name="q") String emotion,
                               @RequestParam(name="sourceResource.type") String text,
                               @RequestParam(name="fields") String allFields,
                               @RequestParam(name="sourceResource.language.name") String language,
                               @RequestParam(name="page_size") Integer size,
                               @RequestParam(name="api_key") String key);

}
