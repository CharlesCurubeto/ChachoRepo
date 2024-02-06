package Prueba;

public class ThisKeyWord {

    int x;  // los valores de estas variables pasan a traves del constructor.
    int y;

    String s= "Algo";

    public ThisKeyWord (){
        System.out.println("default");  // constructor sin parametros
    }

    public ThisKeyWord (int x, int y){

        this.x=x;  // aca uso el "this" para inicializar las variables de la clase.
        this.y=y;
        System.out.println(x+y);
        System.out.println("parametric"); // constructor con parametros
    }


    public static void main(String[] args) {
        ThisKeyWord tkw = new ThisKeyWord (5,9); // estos valores pasan al contructor.
        tkw.getData();
    }

    public void getData ()
    {
        int x=50;
        int y=40;

        System.out.println(this.x + this.y); // aca hago referencia a lar variables de la clase.
        System.out.println(x + y);
        getData1(); // yo puedo meter un método en otro método. En este, el "this" está implicito.
    }

    public void getData1 ()
    {
        int x=50;
        int y=40;

        System.out.println(this.x + this.y);
        System.out.println(x + y);
    }

}
