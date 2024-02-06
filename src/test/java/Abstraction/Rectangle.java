package Abstraction;

public class Rectangle extends Shapes{
    public static void main(String[] args) {
        Rectangle c = new Rectangle();
        c.drawShape();
        c.colorShape();
        c.moveShape();
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing rectangle");
    }

    @Override
    public void colorShape() {
        System.out.println("Coloring rectangle");
    }

    @Override
    public void moveShape() {
        System.out.println("Moving rectangle");
    }
}
