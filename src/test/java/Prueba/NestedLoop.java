package Prueba;

public class NestedLoop {
/*
Meto un While dentro de un For. Lo que hace es: si el for es valido corre el while las veces
que corresponda. Cuando termina, vuelve al loop del for y se resetea el While. Itinera hasta
que se termina el for. Tambien se puede meter un for adetro del while.
 */
    public static void main(String[] args) {
    int count=0;
        for (int i = 1; (i <= 4); i++) {
            int j = 1;
            while (j <= 5){

                for (int x=1; (x<=2);x++)
                {
                    System.out.println("value of i is " + i + " value of j is " + j+ " value of x is " + x);
                    count++; // esto es para contar cuantas iteraciones se hace.

                }
                j++;


            }
        }
        System.out.println(count);
    }
}
