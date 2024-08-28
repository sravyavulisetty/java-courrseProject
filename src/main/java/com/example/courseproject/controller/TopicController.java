package com.example.courseproject.controller;
import com.example.courseproject.Lesson;
import com.example.courseproject.ResponseTopic;
import com.example.courseproject.Services.LessonService;
import com.example.courseproject.Topic;
import com.example.courseproject.Services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    public TopicService topicService;
    @Autowired
    public LessonService lessonService;

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopics(@RequestBody Topic topic){
        topicService.addTopics(topic);
    }
    @RequestMapping(method = RequestMethod.GET, value = "/topics")
    public List<ResponseTopic> getAllTopics(){
       return topicService.getAllTopics();
    }
}
