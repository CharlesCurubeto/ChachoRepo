package Constructors;

/*En este ejemplo, la clase Persona tiene un constructor que toma dos parámetros (nombre y edad) y los utiliza para
 inicializar los atributos de la clase. Luego, se crea una instancia de la clase Persona en el método main utilizando
 este constructor. Cuando se llama al método obtenerInformacion(), devuelve una cadena que describe la persona con el
 nombre y la edad proporcionados al constructor. Finalmente, esa información se imprime en la consola.
 */
public class Persona {
    // Atributos de la clase
    private String nombre;
    private int edad;

    // Constructor de la clase Persona
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Otros métodos de la clase...

    // Método para obtener información de la persona
    public String obtenerInformacion() {
        return "Nombre: " + nombre + ", Edad: " + edad + " años";
    }

    // Método principal para ejecutar el ejemplo
    public static void main(String[] args) {
        // Crear una instancia de la clase Persona usando el constructor
        Persona persona1 = new Persona("Ignacio", 42);

        // Llamar al método para obtener información de la persona
        String informacion = persona1.obtenerInformacion();

        // Imprimir la información en la consola
        System.out.println(informacion);
    }
}

/*
Cuando uso this.nombre en el ejemplo, estoy haciendo referencia a la variable de instancia nombre que pertenece a la clase.
La palabra clave this se utiliza en Java para referirse a la instancia actual de la clase, lo que permite diferenciar entre
la variable de instancia y un parámetro con el mismo nombre que se pasa al constructor.

En el constructor de la clase Persona:
this.nombre hace referencia al atributo nombre de la instancia actual de la clase Persona.
nombre (sin el this) se refiere al parámetro nombre que se pasa al constructor.
En resumen, this.nombre se utiliza para distinguir la variable de instancia nombre de la clase del parámetro nombre
 que se recibe como argumento en el constructor.
 */