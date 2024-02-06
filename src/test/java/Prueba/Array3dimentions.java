package Prueba;

public class Array3dimentions {
    public static void main(String[] args) {

        int[][][] myMulDimArray3 = {{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}, {{13, 14, 15, 16}, {17, 18, 19, 20}, {21, 22, 23, 24}}};

        // System.out.println(myMulDimArray3[0][1][3]);

        System.out.println(myMulDimArray3.length);
        System.out.println(myMulDimArray3 [0].length);
        System.out.println(myMulDimArray3 [0][0].length);
        int count= 0;

        for (int a = 0; a < myMulDimArray3.length; a++) {
            for (int b = 0; b < myMulDimArray3[a].length; b++) {
                for (int c = 0; c < myMulDimArray3[a][b].length; c++)
                {
                    System.out.println(myMulDimArray3[a][b][c]);
                    count++;

                }
            }
        }
        System.out.println(count);
    }
}
