package com.emmanuelamet.courseapi.controllers;

import com.emmanuelamet.courseapi.model.Topic;
import com.emmanuelamet.courseapi.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/api/v1/topics")
    public List<Topic> getAllTopic(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/api/v1/topics/{id}")
    public Optional<Topic> getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/api/v1/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/api/v1/topics/{id}")
    public void updateTopic(@PathVariable String id, @RequestBody Topic topic){
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/api/v1/topics/{id}")
    public void removeTopic(@PathVariable String id){
        topicService.removeTopic(id);
    }
}
