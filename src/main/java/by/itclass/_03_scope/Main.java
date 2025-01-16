package by.itclass._03_scope;

import by.itclass._02_car.entities.ComplexCar;
import by.itclass._02_car.entities.SimpleCar;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("03_scope.xml");
        var car1 = ctx.getBean("car", SimpleCar.class);
        var car2 = ctx.getBean("car", SimpleCar.class);
        var car3 = ctx.getBean("car", SimpleCar.class);

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());

        System.out.println(ctx.getBean("complexCar", ComplexCar.class));
    }
}
