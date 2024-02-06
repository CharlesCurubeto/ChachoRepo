package Prueba;

public class ArrayOneDimentional {
    public static void main(String[] args) {


        int myInt = 2;
        int [] myIntArray = new int [10]; // asi se define el array

        // Esta es una forma de asignar los valores.
        myIntArray[0]= 10; // defino el valor de cada posicion. La primera posición es 0.
        myIntArray[1]= 20;
        myIntArray[2]= 30;
        myIntArray[3]= 40;

        System.out.println(myIntArray[2]);
        System.out.println(myIntArray.length);

        // Otra forma de asignar los valores es directamente asi:

        int [] myIntArray1 = {10,20,30,40};
        System.out.println(myIntArray1[0]);
        System.out.println(myIntArray1.length); // le puedo aplicar funciones a la variable.

// el primer corchete se podría haber puesto adelante del nombre de la variable: int myIntArray1 []= {10,20,30,40}; Pero no se recomienda.
    // Por otro lado, se puede armar arrays de cualquier data type (string, float, boolean, etc).

    }

}
