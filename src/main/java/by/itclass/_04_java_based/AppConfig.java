package by.itclass._04_java_based;

import org.springframework.context.annotation.Bean;

import java.util.List;

public class AppConfig {
    @Bean("message")
    public String mes() {
        return "Hello World!!!";
    }

    @Bean
    public List<Book> books() {
        return List.of(
                new Book("Title1", 100),
                new Book("Title2", 200),
                new Book("Title3", 300)
        );
    }

    @Bean
    public Library library() {
        return new Library(1, "Leninka");
    }
}
