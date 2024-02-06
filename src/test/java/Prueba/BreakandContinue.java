package Prueba;

public class BreakandContinue {

    public static void main(String[] args) {
        for (int i=1; (i <= 10); i++) {

            if (i==7)
            {break;   // puedo meterle una condicion, y decirle que si es true salga del loop.
            }
            System.out.println(i);
        }
        System.out.println("Outside Do While Loop");

        // Si en vez de break uso continue, pasa de largo y no ejecuta el metodo, pero sigue el loop.

        for (int i=1; (i <= 10); i++) {

            if (i==7)
            {continue;
            }
            System.out.println(i);
        }
        System.out.println("Outside Do While Loop");

    }

}
