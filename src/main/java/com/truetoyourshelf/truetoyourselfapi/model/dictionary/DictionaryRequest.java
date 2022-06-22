package com.truetoyourshelf.truetoyourselfapi.model.dictionary;

public class DictionaryRequest {

    private String emotionInput;
    private String apiKey;

    public String getEmotionInput() {
        return emotionInput;
    }

    public void setEmotionInput(String emotionInput) {
        this.emotionInput = emotionInput;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public String toString() {
        return "DictionaryRequest{" +
                "emotionInput='" + emotionInput + '\'' +
                '}';
    }
}
