package com.rcv.pkg1;

public class ClassAA {

    public static void main(String[] args) {

        ClassA ca = new ClassA ();        // creando objetos puedo acceder a los métodos y variables de otra clase, pero del mismo paquete,
                                        // siempre que no sean "Private".

        ca.protectedMethod();
    }

        public void methodAA()
        {
            System.out.println("methodAA");
        }

}
