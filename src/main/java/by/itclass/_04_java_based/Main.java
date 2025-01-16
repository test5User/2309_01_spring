package by.itclass._04_java_based;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        //System.out.println(ctx.getBean("message"));

        var library = ctx.getBean("library", Library.class);
        System.out.println(library);
    }
}
