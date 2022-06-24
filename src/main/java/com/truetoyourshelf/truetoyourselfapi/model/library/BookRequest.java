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
        return "text";
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFields() {
        return "sourceResource.description,object,sourceResource.title,sourceResource.creator";
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getLanguage() {
        return "English";
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

    public BookRequest(String searchWord, Integer pageSize, String apiKey) {
        this.searchWord = searchWord;
        this.pageSize = pageSize;
        this.apiKey = apiKey;
    }
}
