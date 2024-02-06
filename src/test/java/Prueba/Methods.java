package Prueba;

public class Methods {
    public static void main(String[] args) {

        Methods md = new Methods();

        md.doLogin();
        md.doLogout();
        System.out.println(md.addNumbers(5,10));
        diffParameters("hola",2,4);

    }

    public void doLogin() {// Start of the method
        // Code
        System.out.println("Login succesfully");

    }// End of the method

    public void doLogout() {
        System.out.println("Logout succesfully");

    }

    public int addNumbers(int x, int y) // se puede asignar parámetros en el método. Cuando se llama al método y se hace referencia a esos parámetros, se pasa a llamar "Argumentos".
    {
        int z = x + y;
        return z; // como puse return (o sea que devuelve algo) el metodo no es "void" sino el tipo de dato (en este caso int).
    }

    /*
Metodo static vs no static: si no es static necesito si o si crear un objeto para invocar al método.
En cambio si le pongo static puedo llamarlo sin crear un objeto.
 */
    // Ejemplo (ver arriba diffParameters("hola",2,4);)
    public static void diffParameters(String s, int i, float f)
    {
        // Code
        System.out.println(s);
        System.out.println(i);
        System.out.println(f);
    }

}


