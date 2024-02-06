package FinalKeyWord;

public class Child extends Parent{

    public final int i= 10; // la palabra final se usa para restringir que la variable pueda ser modificada.

    public static void main(String[] args) {
        Child c = new Child ();
        System.out.println(c.i);

       // c.i=20;  // puedo cambiar la variable de la clase dentro del método, salvo que la variable de la clase tenga el "final".

       System.out.println(c.i);
    }

   // public void setData ()  // Puedo sobreescribir la variable del método, siempre y cuando el método del Parent no esté como Final.
    //{
      //  System.out.println(i);
    //}
}
