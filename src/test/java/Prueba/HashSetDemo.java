package Prueba;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {


        // creo un objeto de la clase HashSet
        HashSet<Integer> hsetdemo = new HashSet <Integer> ();

        //Agrego valores. Estos valores no son accesibles mediante index (como sí las listas). Por otro lado los valores no son repetibles. Por ej 40 lo agrego 2 veces, pero solo va a figurar 1 vez.

        hsetdemo.add(10);
        hsetdemo.add(20);
        hsetdemo.add(30);
        hsetdemo.add(40);
        hsetdemo.add(40);
        System.out.println(hsetdemo);

        // remover valores

        hsetdemo.remove(10);

        System.out.println(hsetdemo);

        // acceder a los datos con interfaz Iterator y While
        Iterator itr= hsetdemo.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        //Acceder a los datos con un For

        for (Integer intdemo : hsetdemo)
        {
            System.out.println(hsetdemo);
        }
    }
}
