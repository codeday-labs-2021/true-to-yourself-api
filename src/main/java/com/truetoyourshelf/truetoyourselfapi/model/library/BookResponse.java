package com.truetoyourshelf.truetoyourselfapi.model.library;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.truetoyourshelf.truetoyourselfapi.client.ILibraryClient;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BookResponse {

    private String type;
    private String title;
    private String creator;
//    private ArrayList<HashMap<String, String>> subject;
//    private ArrayList<String> subject;
    private ArrayList<?> subject;

    public String getType(){return type;}

    public String getTitle(){return title;}

    public String getCreator(){return creator;}

    public ArrayList<?> getSubject(){return subject;}

    public void setType(){this.type = type;}

    public void setTitle(){this.title = title;}

    public void setCreator(){this.creator = creator;}

    public void setSubject(ArrayList<?> subject){this.subject = subject;}

}
