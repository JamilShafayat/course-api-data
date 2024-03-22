package io.javabrains.courseapidata.destination;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DestinationRepository extends CrudRepository<Destination, String> {
    public List<Destination> findByTopicId(String topicId);
}
