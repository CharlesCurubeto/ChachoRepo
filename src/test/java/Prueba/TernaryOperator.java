package Prueba;

public class TernaryOperator {
    public static void main(String[] args) {

        //Variable = (Condition)? TrueExpression: FalseExpression
        // Ejemplo: asi es el If and Else
int num1= 20;
int num2= 40;

if (num1>num2) {
            System.out.println("num1>num2");
        }
else   {
    System.out.println("num1 not >num2");
}

// Si quiero hacer lo mismo pero con Ternary

       String result=  (num1>num2)? "num1>num2": "num1 not >num2";
        System.out.println(result);

        // Otros ejemplos con otros data types

        int result2=  (num1>num2)? 1:2;
        System.out.println(result2);

       boolean result3=  (num1>num2)? true: false;
       System.out.println(result3);

    }
}
