package com.example.courseproject;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Topic {
    @Id
    private String id;
    private String name;
    private String description;

    @ElementCollection
    private List<String> lessons;

    public Topic(){

    }
    public Topic(String id, String name, String description, List<String> lessons){
        this.id = id;
        this.name = name;
        this.description = description;
        this.lessons = lessons;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public List<String> getLessons(){
        return lessons;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setLessons(List<String> lessons){
        this.lessons = lessons;
    }

}
