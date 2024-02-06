package Inheritance;

public class Car extends Vehicle{ // Car sería como una hermana de Truck, comparten el mismo padre (Vehicle). Esto se refiere el Hierarchical Inheritance.
    public static void main(String[] args) {

        Car ca = new Car();
        ca.start();
        ca.stop();

    }
}
