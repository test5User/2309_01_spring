package by.itclass._02_car.entities;

import java.util.StringJoiner;

public class ComplexCar {
    private int id;
    private String model;
    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public ComplexCar() {
    }

    public ComplexCar(int id, String model, Engine engine) {
        this.id = id;
        this.model = model;
        this.engine = engine;
    }

//    public ComplexCar(Engine engine) {
//        this.engine = engine;
//    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ComplexCar.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("model='" + model + "'")
                .add("engine=" + engine)
                .toString();
    }
}
