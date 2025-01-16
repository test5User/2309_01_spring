package by.itclass._05_annotation_configuration;

import by.itclass._05_annotation_configuration.entities.ConnectionManager;
import by.itclass._05_annotation_configuration.entities.Controller;
import by.itclass._05_annotation_configuration.entities.Dao;
import by.itclass._05_annotation_configuration.entities.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(ConnectionManager.class, Controller.class,
                Dao.class, Service.class);
        var ctx_right = new AnnotationConfigApplicationContext("by/itclass/_05_annotation_configuration/entities");
//        var cm = ctx_right.getBean(ConnectionManager.class);
//        var dao = ctx_right.getBean(Dao.class);
//        var service = ctx_right.getBean(Service.class);
//        var controller = ctx_right.getBean(Controller.class);
//
//        System.out.println(cm);
//        System.out.println(dao);
//        System.out.println(service);
//        System.out.println(controller);

        var controller = ctx_right.getBean(Controller.class);
        System.out.println(controller);

        controller.print();
    }
}
