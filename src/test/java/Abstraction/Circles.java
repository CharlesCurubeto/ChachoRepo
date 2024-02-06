package Abstraction;

public class Circles extends Shapes{
    public static void main(String[] args) {

        Circles c = new Circles();
        c.drawShape();
        c.colorShape();
        c.moveShape();
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
