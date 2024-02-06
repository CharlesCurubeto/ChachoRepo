package Interfaces;

public interface Shapes { // en las interfaces los métdos no pueden ser concretos (tener body). Siempre tienen que ser abstractos.
    public static void main(String[] args) {


    }

    public abstract void drawShape(); // estos serían "abstract" methods. No tienen body.

    public abstract void colorShape();

    public abstract void moveShape();


}

