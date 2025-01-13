package by.itclass._02_car.entities;

import java.util.StringJoiner;

public class SimpleCar {
    private int id;
    private String model;

    public SimpleCar() {
        model = "Default model";
    }

    public SimpleCar(String model) {
        this.model = model;
    }

    public SimpleCar(int id, String model) {
        this.id = id;
        this.model = model;
    }

    public SimpleCar(String model, int id) {
        this.id = id;
        this.model = model;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SimpleCar.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("model='" + model + "'")
                .toString();
    }
}
