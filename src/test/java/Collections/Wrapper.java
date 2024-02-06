package Collections;

public class Wrapper {


    public static void main(String[] args) {

        int i= 10;
        Integer int1= new Integer(i);  // esto se llama Wrapping (lo englobo en un objeto) (autoboxing)
        System.out.println(int1);

        int j= int1 ; // esto se llama Unwrapping  ( y aca lo saco del objeto). (auto unboxing)
        System.out.println(j);
    }
}
