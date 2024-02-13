package Lecture_05_DataStructures;

public class SumOfArrayElements_01 {
    public static void main(String[] args) {

        //Write program to print sum of a given array elements
        int[] array = {2, 5, 8, 6, 9, 4};

        //създаваме променлива, за да съхраним сумата
        int sum = 0;

        for (int i = 0; i < array.length ; i++) {
            sum += array[i];
            //sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
