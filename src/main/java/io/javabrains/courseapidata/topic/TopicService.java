package io.javabrains.courseapidata.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

    //    private List<Topic> topics = new ArrayList<>(Arrays.asList(
    //            new Topic("1", "Java framework", "Java framework description"),
    //            new Topic("2", "Node framework", "Node framework description"),
    //            new Topic("3", "React framework", "React framework description")
    //    ));

    public List<Topic> getAllTopics() {
        //        return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        //        return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).get();
    }

    public Topic addTopic(Topic topic) {
        //        topics.add(topic);
        topicRepository.save(topic);
        return topic;
    }

    public Topic updateTopic(String id, Topic topic) {
        //        for (int i = 0; i < topics.size(); i++) {
        //            Topic t = topics.get(i);
        //            if (t.getId().equals(id)) {
        //                topics.set(i, topic);
        //                break;
        //            }
        //        }
        //        return topic;
        topicRepository.save(topic);
        return topic;
    }

    public void deleteTopic(String id) {
        //        topics.removeIf(topic -> topic.getId().equals(id));
        //        return topics;
        topicRepository.deleteById(id);
    }
}
