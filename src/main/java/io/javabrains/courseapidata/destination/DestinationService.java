package io.javabrains.courseapidata.destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DestinationService {
    @Autowired
    private DestinationRepository courseRepository;

    public List<Destination> getAllCourses(String topicId) {
        List<Destination> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }

    public Destination getCourse(String id) {
        return courseRepository.findById(id).get();
    }

    public Destination addCourse(Destination course) {
        courseRepository.save(course);
        return course;
    }

    public Destination updateCourse(Destination course) {
        courseRepository.save(course);
        return course;
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
