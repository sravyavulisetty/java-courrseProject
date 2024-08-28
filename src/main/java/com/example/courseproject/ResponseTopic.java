package com.example.courseproject;

import java.util.List;


public class ResponseTopic {

    private String id;
    private String name;
    private String description;

    private List<Lesson> lessons;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLessons(List<Lesson> lesson) {
        this.lessons = lesson;
    }

    public String getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public List<Lesson> getLessons(){
        return lessons;
    }
}
