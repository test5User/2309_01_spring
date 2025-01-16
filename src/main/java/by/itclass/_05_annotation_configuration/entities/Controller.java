package by.itclass._05_annotation_configuration.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {
    private Service service;

    @Autowired
    public void setService(Service service) {
        this.service = service;
    }

    public void print() {
        service.print();
    }

    @Override
    public String toString() {
        return "Controller, service: " + service;
    }
}
