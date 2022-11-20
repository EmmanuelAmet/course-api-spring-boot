package com.emmanuelamet.courseapi.service;

import com.emmanuelamet.courseapi.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "spring-framework", "this is a great web framework"),
                new Topic("java", "java-lang", "this is a great language"),
                new Topic("kotlin", "spring-framework", "this is a great web framework")
        ));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream()
                .filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }

    public void updateTopic(Topic topic){

        topics.add(topic);
    }
}
