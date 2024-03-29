package io.javabrains.courseapidata.transportation;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransportationRepository extends CrudRepository<Destination, String> {
    public List<Destination> findByTopicId(String topicId);
}
