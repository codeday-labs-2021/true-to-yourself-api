package com.truetoyourshelf.truetoyourselfapi;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class MainController {

    //get
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World!";
    }

    @GetMapping("/emotion-request/{emotion}")
    public String Emotion() {

        Book bookList = new Book();
        bookList.getListBooks("sad");



        return "testing";

    }

}
