package com.truetoyourshelf.truetoyourselfapi.model.library;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BookResponse {

    private String title;
    private String creator;
    private String description;
    private String object;


    public String getTitle(){return title;}

    public String getCreator(){return creator;}

    public String getDescription() {
        return description;
    }

    public String getObject() {
        return object;
    }

    public void setTitle(){this.title = title;}

    public void setCreator(){this.creator = creator;}

    public void setDescription(String description) {
        this.description = description;
    }

    public void setObject(String object) {
        this.object = object;
    }

}
