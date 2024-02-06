package com.rcv.pkg1;

// Hay 4 tipos de modifiers: public, default, private y protected.
public class ClassA { // la clase solo puede ser Public o Default (Sin el public). No puede ser private o protected.

    // Dentro de la misma clase se puede acceder a todas las variables y métodos, sea cual sea su modifier.

    // las variables pueden tener diferentes modifiers
    public int publicVariable=1;
    int defaultVariable= 2;
    private int privateVariable=3;
    protected int protectedVariable=4;

    // los métodos pueden tener diferentes modifiers

    public static void main(String[] args) {

        ClassA ca = new ClassA ();        // creando objetos puedo acceder a todas las variables y métodos de la clase.

        ca.publicMethod();

    }
    public void publicMethod() {
        System.out.println("Public Method");
    }

     void defaultMethod() {
        System.out.println("Default Method");
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }

    public void protectedMethod() {
        System.out.println("Protected Method");
    }


}
