package com.emmanuelamet.courseapi.controllers;

import com.emmanuelamet.courseapi.Topic;
import com.emmanuelamet.courseapi.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/api/v1/topics")
    public List<Topic> getAllTopic(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/api/v1/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/api/v1/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/api/v1/topics")
    public void updateTopic(@RequestBody Topic topic){
        topicService.updateTopic(topic);
    }
}
