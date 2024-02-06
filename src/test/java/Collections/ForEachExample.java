package Collections;
import java.util.ArrayList;
import java.util.List;
public class ForEachExample {
    public static void main(String[] args) {

        // Crear una lista de números
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        // Usar forEach para imprimir cada elemento de la lista
        System.out.println("Elementos de la lista:");
        numeros.forEach(numero -> System.out.println(numero));

        // Otra forma más compacta con referencia a método
        // numeros.forEach(System.out::println);

    }
}
