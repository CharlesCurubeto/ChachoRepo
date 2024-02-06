package Prueba;

public class ifElse {
    public static void main(String[] args) {

        // Sitaxis= if (expression)
        //{

            //}

        //else

        int num1= 40;
        int num2= 30;
        int num3= 20;


        if (num1> num2) // Para decir que algo es distinro se usa el !=
        {
            System.out.println("Number 1 is greater than number 2");

            if (num2> num3) // Puedo meter un if else anidado.
            {
                System.out.println("nested: Number 2 is greater than number 3");
            }
            else
            {
                System.out.println("nested: Number 2 is not greater than number 3");
            }

        }
        else if (num1== num2)
        {
            System.out.println("Number 1 is equal than number 2");
        }

        else
        {
            System.out.println("Number 2 is greater than number 1");
        }

    }
}
