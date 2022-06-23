package com.truetoyourshelf.truetoyourselfapi.model.library;

public class BookRequest {

    public String searchWord;

    public String type;

    public String fields;

    public String language;

    public Integer pageSize;

    public String apiKey;

    public String getSearchWord() {
        return searchWord;
    }

    public void setSearchWord(String searchWord) {
        this.searchWord = searchWord;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public String toString() {
        return "BookRequest{" +
                "searchWord='" + searchWord + '\'' +
                '}';
    }

    public BookRequest() {
    }

    public BookRequest(String searchWord, String type, String fields, String language, Integer pageSize, String apiKey) {
        this.searchWord = searchWord;
        this.type = type;
        this.fields = fields;
        this.language = language;
        this.pageSize = pageSize;
        this.apiKey = apiKey;
    }
}
