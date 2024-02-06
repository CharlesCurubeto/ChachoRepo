package Prueba;

public class Variables {

    int j = 15; // las variables que están dentro de clase se llaman "Instance".
    // Todos los métodos dentro de esta clase puede usar esta variable.

    public static void main(String[] args) {
        //type variable name = value

        int myNumber = 10;
        int secondNumber = 10;
        char ch = 'A';
        String str1 = "Algo";
        // Estas variables estan dentro del medoto Main (Se llaman "Locals").

        //Para concatenar se usa el signo +

        System.out.println(str1 + " " + ch + " " + myNumber); // Aca concatena numeros con strings
        System.out.println( secondNumber + myNumber); // Aca hace la suma
    }

    // las variables que están fuera del main son "Static"
    public void myMethod() {
        int i = 20;
    }
}
