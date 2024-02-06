package Prueba;

public class Demo1 {

    public static void main(String[] args) {

        // Aca arrancamos a aprender Java
        /*
        Asi se puede agregar más comentarios
         */
        System.out.println("A ver que me pone");

        /*
        Estos son los tipos de datos, guardados en variables
        Empezando por los primitivos
         */
        byte bt = 127;
        short sht = 32767;
        int myInt = 764765;
        long lg = 765737L;

        float myFloat = 1.456568f;
        double myDouble = 1.456568d;
        boolean bl = true;
        char ch = 'c';
/*
No primitivos (definidos por el usuario)
El string sería uno de ellos.

en el este ejemplo el primer Demo1 es un tipo de dato String
dtd es la variable

*/

        // Esta es una  forma, directamente poner el string, sin crear objeto, sino asociandolo
        // directamente a la variable.

        String str1 = "AAA";

// esta es otra forma de crear el string, a traves de un objeto (new String).
        String str2 = new String ("AAA");

        // la diferencia es la siguiente. Si quiero imprimir esto...
        System.out.println(str1==str2); // Esto me da falso
        System.out.println(str1.equals(str2)); // esto da verdadero. Por que en stt2 creo un objeto que puede
        // ser comparado con un metodo (función).

        // si creo otra variable de string directa, ej  String str3 = new String ("AAA");
        // y hago System.out.println(str1==str3); esto me va a dar True, porque al ser el
        // mismo string (igual palabra) Java reutiliza el mismo espacio de memoria para los 2.
        // en cambio, el str2 como objeto nuevo, creo un nuevo espacio de memoria.




        // Demo1 de = new Demo1();
        // new Demo1()
        //new Demo1()
        //new Demo1()
        //new Demo1()
    }
}
