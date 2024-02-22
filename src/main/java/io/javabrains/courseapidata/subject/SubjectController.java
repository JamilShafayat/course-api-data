package io.javabrains.courseapidata.subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/topics")
    public List<Subject> getAllTopics() {
        return subjectService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Subject getTopic(@PathVariable String id) {
        return subjectService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public Subject addTopic(@RequestBody Subject subject) {
        return subjectService.addTopic(subject);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public Subject updateTopic(@RequestBody Subject subject, @PathVariable String id) {
        return subjectService.updateTopic(id, subject);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        subjectService.deleteTopic(id);
    }
}
