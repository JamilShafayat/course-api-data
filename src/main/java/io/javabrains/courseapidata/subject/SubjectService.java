package io.javabrains.courseapidata.subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> getAllTopics() {
        List<Subject> subjects = new ArrayList<>();
        subjectRepository.findAll().forEach(subjects::add);
        return subjects;
    }

    public Subject getTopic(String id) {
        return subjectRepository.findById(id).get();
    }

    public Subject addTopic(Subject subject) {
        subjectRepository.save(subject);
        return subject;
    }

    public Subject updateTopic(String id, Subject subject) {
        subjectRepository.save(subject);
        return subject;
    }

    public void deleteTopic(String id) {
        subjectRepository.deleteById(id);
    }
}
