package com.example.courseproject;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Lesson {
    @Id
    private String id;
    private String name;
    private String description;
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public void setId(){
        this.id = id;
    }
    public void setName(){
        this.name = name;
    }
    public void setDescription(){
        this.description = description;
    }

}
