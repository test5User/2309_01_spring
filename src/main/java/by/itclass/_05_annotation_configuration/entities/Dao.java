package by.itclass._05_annotation_configuration.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dao {
    private ConnectionManager connectionManager;

    @Autowired
    public void setConnectionManager(ConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }

    @Override
    public String toString() {
        return "Dao , Connection manager " + connectionManager;
    }

    public void print() {
        System.out.println("Hello");
    }
}
