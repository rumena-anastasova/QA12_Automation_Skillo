package Lecture_05_DataStructures;

import java.util.Scanner;

public class BiggestElementOfAnArray_04 {
    public static void main(String[] args) {

        //Find biggest element of an array and print it in the console
        int[] array = {1, 100, 400, -1000, -1001 };
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The biggest number in the array is: " + max);

//            int[] arr = {-1, 200, 5, 6 ,203, -500, 300000};
//            int max = arr[0];
//
//            for (int elem: arr) {
//                if (elem > max ) {
//                    max = elem;
//                }
//            }
//            System.out.println("The biggest number in the array is: " + max);

    }
}

