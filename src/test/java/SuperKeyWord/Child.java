package SuperKeyWord;
// el super key word sirve para poder acceder a las variables, metodos y constructores de otra clase (parent), llamandose igual a las que tengo en la clase child.
public class Child extends Parent {

   public Child ()
   {
       super(1); // Aca estoy invocando al constructor de la clase Parent. Si le dejo vacio el parametro uso uno, y se le pongo un int, uso el otro constructor.
   }
    String empName = "Nacho";
    int empNo= 6666 ;
    public static void main(String[] args) {

        Child ch = new Child();
        ch.getData();
    }

    public void getData()
    {
       super.getData(); // con ese super Key word lo que hago es que el metodo y las variables que uso para el objeto Child es de la clase Parent, y no el de Child.

        // Tambien se puede usar el super para referirse a las variables. En este caso va a tomar las variables de la clase Parent, y no Child.
        // System.out.println(super.empName);
        //System.out.println(super.empNo);
    }
}

// En sintesis, cuando en 2 clases hay metodos y variables llamados de la misma manera, y una es hija de otra, en la hija puedo o bien usar los metodos y variables de ella misma o de la Parent.