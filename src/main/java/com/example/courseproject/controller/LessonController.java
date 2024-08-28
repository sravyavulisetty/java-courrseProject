package com.example.courseproject.controller;
import java.util.*;
import com.example.courseproject.Lesson;
import com.example.courseproject.Services.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LessonController {

    @Autowired
    public LessonService lessonService;

    @RequestMapping(method = RequestMethod.GET, value = "/lessons")
    public List<Lesson> getAllLessons(){
        return lessonService.getAllLessons();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/lessons")
    public void addLesson(@RequestBody Lesson lesson){
        lessonService.addLesson(lesson);
    }
}
