package Prueba;

public class ForLoop {

    public static void main(String[] args) {
        //Sintax: for (initialization variable; condition; update)
        //   {
        //   Statement
        //    }

        for (int i=1; (i <= 10); i++) {
            System.out.println(i); // primero se corre el statement
        }
        System.out.println("Outside Do While Loop");

    /*
    Tambien se podría haber inicializado afuera:
    int i=1
     for (; (i <= 10); ) Pero los ";" tienen que permanecer en la función.
            System.out.println(i);
            i++;

            When to use the differents types of Loops:
            While: when you don´t know the number of iterations.Ej: tener que encontrar cuantos links están disponibles. Y no sabes cuantos links hay.
            Do While: when you don´t know the number of iterations, but you want to execute the code at least once, irrespective what ever the condition is
            For:  when you do know the number of iterations.

     */
    }


}
