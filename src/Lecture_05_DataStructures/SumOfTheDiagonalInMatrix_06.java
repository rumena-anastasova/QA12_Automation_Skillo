package Lecture_05_DataStructures;

public class SumOfTheDiagonalInMatrix_06 {
    public static void main(String[] args) {

        int[][] matrix2d = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int sumDiagonal1 = 0;
        int sumDiagonal2 = 0;
        for(int i = 0; i < matrix2d.length; i++) {
            for(int j = 0; j < matrix2d[i].length; j++) {
                //първият диагонал - ако i == j, т.е. 0 == 0(1), 1 == 1(6), 2 == 2(11), 3 == 3(16)
                if (i == j) {
                    sumDiagonal1 += matrix2d[i][j];
                }
                //вторият диагонал - ако i + (j+1) == matrix2d.length, т.е. 0+1+3(4), 1+1+2(4), 2+1+1(4), 3+1+0(4)
                if (i + (j + 1) == matrix2d.length) { //if (i + j) = (matrix2d.length - 1)
                    sumDiagonal2 += matrix2d[i][j];
                }
            }
        }
        System.out.println("The sum of the first diagonal is: " + sumDiagonal1);
        System.out.println("The sum of the second diagonal is: " + sumDiagonal2);

    }
}
