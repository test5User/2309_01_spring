package by.itclass._04_java_based;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.StringJoiner;

public class Library {
    private int id;
    private String name;
    //@Autowired
    private List<Book> books;

    public Library(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Autowired
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Library.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("books=" + books)
                .toString();
    }
}
