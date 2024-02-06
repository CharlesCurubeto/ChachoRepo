package Polymorphism;

public class Cat extends Animals {
    public static void main(String[] args) {

        Cat c= new Cat();
        c.makeNoise();
    }

    public void makeNoise() // aca uso el mismo método que en Animals, o sea que lo sobreescribo, y corre el metodo de esta clase.
    {
        System.out.println("Cat meows");
    }

}
