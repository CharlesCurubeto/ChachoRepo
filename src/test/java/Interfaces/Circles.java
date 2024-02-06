package Interfaces;

public class Circles implements Shapes {  // para usar los metodos y variables de una interface se usa la palabra "implements". Se pueden implementar varias interfaces.
    public static void main(String[] args) {
        Circles c= new Circles();
        c.colorShape();

    }

    @Override
    public void drawShape() {
        System.out.println("Drawing circle");
    }

    @Override
    public void colorShape() {
        System.out.println("Coloring circle");
    }

    @Override
    public void moveShape() {
        System.out.println("Moving circle");
    }
}






