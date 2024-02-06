package Prueba;
// esta clase se relaciona con la clase Common
public class CreateBox {
    public static void main(String[] args) {

    Common cm= new Common();

        //  int l= cm.length= 10;  // aca paso las variables directo. Pero solo funciona si las variables son public. Como se cambiaron a Private no se puede acceder.
        // int w= cm.width=20;
        //int h= cm.height=30;

        int l= cm.setLength(10);  // De esta manera accedo indirectamente a las variables. Y paso los parámetros.
        int w= cm.setWidth(20);
        int h= cm.setHeight(30);

    cm.setBoxDimension(l,w,h);

        System.out.println(cm.getWidth());  // aca puedo obtener los parámetros ingresados.
        System.out.println(cm.getHeight());
        System.out.println(cm.getLength());




    }
}
