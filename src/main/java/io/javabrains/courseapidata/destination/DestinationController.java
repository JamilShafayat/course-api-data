package io.javabrains.courseapidata.destination;

import io.javabrains.courseapidata.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DestinationController {

    @Autowired
    private DestinationService courseService;

    @RequestMapping("/destinations/{id}/courses")
    public List<Destination> getAllCourses(@PathVariable String id) {
        return courseService.getAllCourses(id);
    }

    @RequestMapping("/destinations/{topicId}/courses/{id}")
    public Destination getCourse(@PathVariable String id) {
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/destinations/{topicId}/courses")
    public Destination addCourse(@RequestBody Destination course, @PathVariable String topicId) {
        course.setTopic(new Topic(topicId, "", ""));
        return courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/destinations/{topicId}/courses/{id}")
    public Destination updateCourse(@RequestBody Destination course, @PathVariable String topicId, @PathVariable String id) {
        course.setTopic(new Topic(topicId, "", ""));
        return courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/destinations/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable String id) {
        courseService.deleteCourse(id);
    }
}
