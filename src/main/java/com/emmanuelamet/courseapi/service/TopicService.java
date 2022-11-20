package com.emmanuelamet.courseapi.service;

import com.emmanuelamet.courseapi.model.Topic;
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

    public void updateTopic(String id, Topic topic){
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i, topic);
                return;
            }
        }
        topics.add(topic);
    }

    public void removeTopic(String id){
        topics.removeIf(t -> t.getId().equals(id));
    }

}
