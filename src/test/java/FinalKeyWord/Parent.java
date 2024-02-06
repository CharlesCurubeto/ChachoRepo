package FinalKeyWord;

public class Parent {  // si a la clase le pongo "final" no puedo hacer una subclase (child) para heredar metodos y variables. O sea no permite la herencia.

    public final int i= 20;

    public final void setData ()  // me tira un problema porque en la clase Child lo estoy invocando y quiriendo modificar. No me deja porque le puse Final.
    {
        System.out.println(i);
    }

}


/*
Resumen del uso de final key word:

-Si se usa en la variable, no te permite cambiar el valor de la variable.
-Si se usa en el método, no se puede sobreescribir ese metodo en particular en la clase Child.
-Si se usa en la clase, no permite la herencia (inheritance).
 */