package Lecture_05_DataStructures;

public class MultidimensionalArrays_02 {
    public static void main(String[] args) {

        //Print elements of a given 2-d matrix with 4 rows and 3 columns
        //https://www.softwaretestinghelp.com/multidimensional-arrays-in-java/
        //declaring and initializing 2D array
        int arr[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        //printing 2D array
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
       }

//        //declaring and initializing 2D array
//        int[][] arr = new int[4][3]; //4 row and 3 column
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;
//        arr[2][0] = 7;
//        arr[2][1] = 8;
//        arr[2][2] = 9;
//        arr[3][0] = 10;
//        arr[3][1] = 11;
//        arr[3][2] = 12;
//
//        for(int i = 0; i < 4; i++){
//            for(int j = 0; j < 3; j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}

