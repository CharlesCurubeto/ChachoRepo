package Prueba;

public class Operators {
    public static void main(String[] args) {
        // Assignment operatios (asignar valores a la variable)

        int myNumber = 10;
        String str = "String Demo";

// Arithmetic Operators

        int number1 = 10;
        int number2 = 20;

        //Example
        System.out.println(number1 + number2);
        System.out.println(number1 * number2);
        System.out.println(number2 / number1);
        System.out.println(number1 + str);
// Unary Operators

        int number3 = 1;
        ++number3; // este es incremental, suma 1 a la variable
        --number3;// este es decremental, resta 1 a la variable

        System.out.println(number3);

        boolean bool = true ;
        System.out.println(bool);

// Equality and Relational Operators
        if (number1== number2) // Para decir que algo es distinro se usa el !=
        {
            System.out.println("Numbers al equal");
        }
        else
        {
            System.out.println("Numbers al different");
        }
// Otro ejemplo
        if (number1> number2)
        {
            System.out.println("Number1 es mayor que Number2");
        }
        if (number2> number1)
        {
            System.out.println("Number2 es mayor que Number1");
        }
        else
        {
            System.out.println("Number1 es igual que Number2");
        }

        // Conditional Operators (And - Or)
// Ar
        if ((number1==10) && (number2==20)) // Ojo que aca hay doble paréntesis. El && significa "and"
        {
            System.out.println("Se cumplen ambas condiciones");
        }
        else
        {
            System.out.println("No se cumplen ambas condiciones");
        }
//Or
        if ((number1==10) || (number2==1)) // Ojo que aca hay doble paréntesis. El && significa "and"
        {
            System.out.println("Se cumple alguna condicion");
        }
        else
        {
            System.out.println("No se cumple ninguna condicion");
        }


    }


}
