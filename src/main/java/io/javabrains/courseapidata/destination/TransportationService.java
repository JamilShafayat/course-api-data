package io.javabrains.courseapidata.destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransportationService {
    @Autowired
    private TransportationRepository transportationRepository;

    public List<Transportation> getAllTransportations() {
        List<Transportation> transportations = new ArrayList<>();
        transportationRepository.findAll().forEach(transportations::add);
        return transportations;
    }

    public Transportation getTransportation(String id) {
        return transportationRepository.findById(id).get();
    }

    public Transportation addTransportation(Transportation transportation) {
        transportationRepository.save(transportation);
        return transportation;
    }

    public Transportation updateTransportation(String id, Transportation transportation) {
        transportationRepository.save(transportation);
        return transportation;
    }

    public void deleteTransportation(String id) {
        transportationRepository.deleteById(id);
    }
}
