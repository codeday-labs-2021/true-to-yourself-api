package com.truetoyourshelf.truetoyourselfapi;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.json.simple.*;

//import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloWorldController {

    //get
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World from HWC!";
    }

    @GetMapping("/emotion-request/{emotion}")
    public String Emotion(@PathVariable String emotion) {
        String URL = "https://api.dp.la/v2/items?q=" + emotion + "&sourceResource.type=%22text%22&fields=sourceReso[…]ame=English&page_size=1&api_key=c44b31886102636bcb386abc55a62211";
        RestTemplate restTemplate = new RestTemplate();

        // Get Object Return
//        List<Array> testing = restTemplate.getForObject(URL, List.class);

        return "testing";

    }

}
