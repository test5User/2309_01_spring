package by.itclass._01_base;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("01_hello_world.xml");
        var defaultMessage = ctx.getBean("default-message", String.class);
        System.out.println(defaultMessage);
        var message = ctx.getBean("message", String.class);
        System.out.println(message);
    }
}
