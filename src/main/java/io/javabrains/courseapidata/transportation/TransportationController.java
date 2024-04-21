package io.javabrains.courseapidata.transportation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransportationController {

    @Autowired
    private TransportationService transportationService;

    @RequestMapping("/transportations")
    public List<Transportation> getAllTransportations() {
        return transportationService.getAllTransportations();
    }

    @RequestMapping("/transportations/{id}")
    public Transportation getTransportation(@PathVariable String id) {
        return transportationService.getTransportation(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/transportations")
    public Transportation addTransportation(@RequestBody Transportation transportation) {
        return transportationService.addTransportation(transportation);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/transportations/{id}")
    public Transportation updateTransportation(@RequestBody Transportation transportation, @PathVariable String id) {
        return transportationService.updateTransportation(id, transportation);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/transportations/{id}")
    public void deleteTransportation(@PathVariable String id) {
        transportationService.deleteTransportation(id);
    }
}
