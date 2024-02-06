package Constructors; // Hay distintos tipos de Constructors

public class ConstructorsExamples {

    public  ConstructorsExamples(){ // este sería un constructor sin argumentos. No tiene retorno. Mantiene el nombre de la Clase.
       System.out.println("No arguments constructor");
    }

    public  ConstructorsExamples(int i){ // este sería un constructor con 1 argumento/ parámetro. Mantiene el nombre de la Clase.
        System.out.println("Integer constructor");
    }

    public  ConstructorsExamples(int i,int y){ // este sería un constructor con 2 argumentos/ parámetro.Mantiene el nombre de la Clase.
        System.out.println("2 Integer constructor");
    }

    public  ConstructorsExamples(String S){ // este sería un constructor con 1 argumento/ parámetro.Mantiene el nombre de la Clase.
        System.out.println("String constructor");
    }

    public static void main(String[] args) {
        ConstructorsExamples ce = new ConstructorsExamples(5,7); // dependiendo que parámetro le pongo (ninguno, un int, 2 ints o un string, me va a llamar al constructor correspondiente).


    }
}
