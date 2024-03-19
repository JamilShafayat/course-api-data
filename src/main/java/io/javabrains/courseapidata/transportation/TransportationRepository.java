package io.javabrains.courseapidata.transportation;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransportationRepository extends CrudRepository<Transportation, String> {
    public List<Transportation> findByTopicId(String topicId);
}
