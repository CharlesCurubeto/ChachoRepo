package Polymorphism;

public class MethodOverloading {


    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        {
            mo.login("ignaciocbt","pass123");
        }

    }
// Method Overloading ( tambien llamado Early Binding o Static Binding) es cuando usas un mismo método pero con diferentes tipos de parámetros (ej string e int).
// Cuando lo invoques, dependiendo de los parámetros que ingreses va a ejecutar uno u otro metodo.
// Tambien funcionaría si agrego un parámetro adicional

    public void login (String s, String p )
    {
        System.out.println("Login Successful using username and password");
    }

    public void login (int s, String p )
    {
        System.out.println("Login Successful using phone number and password");
    }

}
