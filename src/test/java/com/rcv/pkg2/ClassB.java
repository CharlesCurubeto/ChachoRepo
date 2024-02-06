package com.rcv.pkg2;

import com.rcv.pkg1.*; // Aca se importó el paquete.
//Si quisiera importar todas las clases de un paquete usaría asterisco: import com.rcv.pkg1.*, sino pongo una clase en particular del paquete;
//Esto porque la clase es public.
// Si la clase no fuera public (es decir default) no pueden importar clases de otros paquetes, solo del mismo paquete.

public class ClassB extends ClassA  // Con el key words extends la classB se volvío hija de la ClassA, y puedo acceder a las variables y métodos "Protected" (ademas del public, obvio).
{
    public static void main(String[] args) {

        ClassA ca = new ClassA ();        // Si la clase es Publica, puedo acceder desde otros paquetes. Pero se tiene que importar el paquete.
                                            // Para acceder a variables o métodos de otros paquetes, estos (las variables y métodos) tienen que ser public.
                                            // El resto de modifiers no se pueden acceder, salvo el Protected, pero para eso la clase tiene que ser declarada como hija de la clase que tiene el metodo a llamar.
        ca.protectedMethod();

        ClassAA caa = new ClassAA();
        caa.methodAA();


        ClassB cb= new ClassB ();
        cb.protectedMethod(); // puedo acceder a las variables y métodos "Protected" porque hice la clase hija de la otra (ClassA).>> Inheritance
    }
}
