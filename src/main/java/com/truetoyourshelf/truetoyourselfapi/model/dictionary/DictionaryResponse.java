package com.truetoyourshelf.truetoyourselfapi.model.dictionary;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DictionaryResponse {

    private String id;
    private ArrayList<ArrayList<String>> syns;
    private ArrayList<ArrayList<String>> ants;
    private Boolean offensive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<ArrayList<String>> getSyns() {
        return syns;
    }

    public void setSyns(ArrayList<ArrayList<String>> syns) {
        this.syns = syns;
    }

    public ArrayList<ArrayList<String>> getAnts() {
        return ants;
    }

    public void setAnts(ArrayList<ArrayList<String>> ants) {
        this.ants = ants;
    }

    public Boolean getOffensive() {
        return offensive;
    }

    public void setOffensive(Boolean offensive) {
        this.offensive = offensive;
    }
}
