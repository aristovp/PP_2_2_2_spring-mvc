package web.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {

    private String name;
    private int model;
    private String color;

    public Car(String name, int model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }
    public Car() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getModel() == car.getModel() && Objects.equals(getName(), car.getName()) && Objects.equals(getColor(), car.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getModel(), getColor());
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model=" + model +
                ", color='" + color + '\'' +
                '}';
    }
}
