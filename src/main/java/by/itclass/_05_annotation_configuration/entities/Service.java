package by.itclass._05_annotation_configuration.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
    private Dao dao;

    @Autowired
    public void setDao(Dao dao) {
        this.dao = dao;
    }

    @Override
    public String toString() {
        return "Service, Dao: " + dao;
    }

    public void print() {
        dao.print();
    }
}
