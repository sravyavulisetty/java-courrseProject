package com.example.courseproject.Services;

import com.example.courseproject.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    public TopicRepository topicRepository;

    @Autowired
    public LessonRepository lessonRepository;


    public void addTopics(Topic topic) {
        List<String> lessonIds = new ArrayList<>();
        lessonRepository.findAll().forEach(lesson -> lessonIds.add(lesson.getId()));
        topic.setLessons(lessonIds);
        topicRepository.save(topic);
    }
    public List<ResponseTopic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        List<ResponseTopic> responseTopics = new ArrayList<>();
        for(Topic t : topics){
            ResponseTopic newTopic = new ResponseTopic();
            newTopic.setId(t.getId());
            newTopic.setName(t.getName());
            newTopic.setDescription(t.getDescription());
            List<Lesson> lessons = new ArrayList<>();
            for(String l : t.getLessons()){
                lessonRepository.findById(l).stream().forEach(lessons ::add);
                newTopic.setLessons(lessons);
            }
            responseTopics.add(newTopic);
        }
       return responseTopics;
    }
}
