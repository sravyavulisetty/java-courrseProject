package com.example.courseproject.Services;
import java.util.*;
import com.example.courseproject.Lesson;
import com.example.courseproject.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {
    @Autowired
    public LessonRepository lessonRepository;
    public List<Lesson> getAllLessons(){
        List<Lesson> lessons = new ArrayList<>();
        lessonRepository.findAll().forEach(lessons::add);
        return lessons;
    }

    public void addLesson(Lesson lesson){
        lessonRepository.save(lesson);
    }
}
