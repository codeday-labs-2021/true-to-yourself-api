package com.truetoyourshelf.truetoyourselfapi.model.library;

public enum Emotions {

    STRONG("strong"),
    HAPPY("happy"),
    CONTENT("content"),
    FUNNY("funny"),
    ROMANTIC("romantic"),
    INSPIRED("inspired"),
    OPTIMISTIC("optimistic"),
    SILLY("silly"),
    RELAXED("relaxed"),
    IMAGINATIVE("imaginative"),
    FESTIVE("festive"),
    EAGER("eager"),
    CURIOUS("curious"),
    SURPRISED("surprised"),
    OVERWHELMED("overwhelmed"),
    UNSUCCESSFUL("unsuccessful"),
    PESSIMISTIC("pessimistic"),
    ANXIOUS("anxious"),
    INTROSPECTIVE("introspective"),
    MOURNING("mourning"),
    FEARFUL("fearful"),
    CONFUSED("confused"),
    UNORGANIZED("unorganized"),
    FRUSTRATION("frustration"),
    LONELY("lonely"),
    SAD("sad"),
    ANGRY("angry"),
    BLAND("bland"),
    STRESSED("stressed"),
    DISCOURAGED("discouraged");

    private final String name;

    Emotions(String name) {
        this.name = name;
    }

    public static String getEmotion(Emotions emotion){
        return emotion.name;
    }
}
