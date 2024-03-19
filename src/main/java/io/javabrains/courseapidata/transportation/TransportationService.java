package io.javabrains.courseapidata.transportation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransportationService {
    @Autowired
    private TransportationRepository courseRepository;

    public List<Transportation> getAllCourses(String topicId) {
        List<Transportation> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }

    public Transportation getCourse(String id) {
        return courseRepository.findById(id).get();
    }

    public Transportation addCourse(Transportation course) {
        courseRepository.save(course);
        return course;
    }

    public Transportation updateCourse(Transportation course) {
        courseRepository.save(course);
        return course;
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
