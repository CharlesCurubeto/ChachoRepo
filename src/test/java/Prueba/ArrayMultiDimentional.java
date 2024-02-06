package Prueba;

public class ArrayMultiDimentional {
    public static void main(String[] args) {

        // For loop used with Array

        int[] myIntArray1 = {10, 20, 30, 40, 50};

        for (int i = 0; i < myIntArray1.length; i++) {
            System.out.println(myIntArray1[i]);
        }

    /*
    Multimedimentional: Array within other Array. Se usa doble []
     */

        int[][] myMulDimArray = new int[2][3]; // el primer corchete define la cantidad de Arrays, el 2do la cantidad de Indexes de cada Array
        myMulDimArray[0][0] = 2;
        myMulDimArray[0][1] = 3;
        myMulDimArray[0][2] = 5;
        myMulDimArray[1][0] = 6;
        myMulDimArray[1][1] = 8;
        myMulDimArray[1][2] = 9;

        System.out.println(myMulDimArray[0][1]);
        ;

        // O sino de la otra forma

        int[][] myMulDimArray1 = {{2, 3, 5}, {6, 8, 9}};

        //System.out.println(myMulDimArray1[1][2]);

          for(int s=0; s < myMulDimArray1.length; s++)
        {
            for(int j=0; j< myMulDimArray1[s].length;j++)

            {
                System.out.println(myMulDimArray1[s][j]);
            }
        }

    }
}
