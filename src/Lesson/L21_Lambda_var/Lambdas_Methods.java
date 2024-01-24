package Lesson.L21_Lambda_var;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Lambdas_Methods {

}

interface FunctionalInterfaces {
    void abc1();

    default void def1() {
    }

    default void def2() {
    }

    static void def3() {
    }
}

class Car {
    String model;
    String color;
    double engine;

    Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String toString() {
        return "Our car is " + model + ", color ist " + color + " and engine " + engine;
    }
}

class Test15 {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSupplier.get());
        }
        return al;
    }

    public static void changeCar(Car car, Consumer<Car> consumer) {
        consumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan", "silver metalic", 1.6));
        System.out.println("ourCars: " + ourCars);

        changeCar(ourCars.get(0), car -> {
            car.color = "red";
            car.engine = 2.4;
            System.out.println("updated car1: " + car);
        });

        Consumer<Car> consumer=car -> {
            car.color = "black";
            car.engine = 3.3;
            System.out.println("updated car2: " + car);
        };
        consumer.accept(ourCars.get(1));

        System.out.println("ourCars: " + ourCars);

    }
}