package Inheritance;

// There are different types of Inheritance: single, Multilevel, hierarchical, Multiple and Hybrid.
public class Truck extends Vehicle{ // this is Single Inheritance
    public static void main(String[] args) {

        Vehicle ve = new Vehicle();
        ve.start();
                                        // puedo crear métodos de ambas clases, porque una es hija de la otra.
        Truck tr = new Truck();
        tr.start();

    }

    public void loadCapacity()
    {
        System.out.println("Load Capacity");
    }


}




