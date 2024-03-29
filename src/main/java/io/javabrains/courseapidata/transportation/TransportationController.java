package io.javabrains.courseapidata.transportation;

import io.javabrains.courseapidata.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransportationController {

    @Autowired
    private TransportationService transportationService;

    @RequestMapping("/topics/{id}/courses")
    public List<io.javabrains.courseapidata.transportation.Destination> getAllCourses(@PathVariable String id) {
        return transportationService.getAllCourses(id);
    }

    @RequestMapping("/topics/{topicId}/courses/{id}")
    public io.javabrains.courseapidata.transportation.Destination getCourse(@PathVariable String id) {
        return transportationService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
    public io.javabrains.courseapidata.transportation.Destination addCourse(@RequestBody io.javabrains.courseapidata.transportation.Destination course, @PathVariable String topicId) {
        course.setTopic(new Topic(topicId, "", ""));
        return transportationService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
    public io.javabrains.courseapidata.transportation.Destination updateCourse(@RequestBody io.javabrains.courseapidata.transportation.Destination course, @PathVariable String topicId, @PathVariable String id) {
        course.setTopic(new Topic(topicId, "", ""));
        return transportationService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable String id) {
        transportationService.deleteCourse(id);
    }
}
