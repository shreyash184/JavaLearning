package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> ArrayList;
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Spring", "Spring Framework", "Spring Framwork Description"),
            new Topic("Java", "Spring Framework", "Spring Framwork Description"),
            new Topic("Spring", "Spring Framework", "Spring Framwork Description"),
            new Topic("JavaScript", "Spring Framework", "Spring Framwork Description"),
            new Topic("Python", "Spring Framework", "Spring Framwork Description")
    ));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        for(int i=0;i<topics.size();i++){
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id){
        topics.removeIf(t->t.getId().equals(id));
    }
}
