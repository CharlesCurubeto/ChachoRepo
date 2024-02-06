package Prueba;

public class DoWhileLoop {

    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i); // primero se corre el statement
            i++;
        }   while (i <= 10) ; // mientras la condición sea true vuelve a correr el statement
        System.out.println("Outside Do While Loop");
    }
}
