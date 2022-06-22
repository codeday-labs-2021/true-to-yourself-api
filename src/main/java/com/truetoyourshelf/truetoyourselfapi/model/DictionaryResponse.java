package com.truetoyourshelf.truetoyourselfapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DictionaryResponse {

    private String syns;
}
