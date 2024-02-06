package Inheritance;

public class Iveco extends Truck{  // al ser hija de Truck y Truck es hija de Vehicle, entonces Iveco puede usar los metodos y variables de Vehicle.
    // This is Multilevel Inheritance.
    public static void main(String[] args) {

        Iveco iv= new Iveco();
        iv.loadCapacity();

        iv.start();
    }
}
