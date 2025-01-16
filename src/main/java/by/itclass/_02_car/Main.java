package by.itclass._02_car;

import by.itclass._02_car.entities.ComplexCar;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("02_car.xml");
        var cars = List.of(
                ctx.getBean("car1"),
                ctx.getBean("car2"),
                ctx.getBean("car3"),
                ctx.getBean("car4"),
                ctx.getBean("car5")
        );
        cars.forEach(System.out::println);

        System.out.println(ctx.getBean("car6", ComplexCar.class));
    }
}
