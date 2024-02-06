package Lecture04_Operators_Expression_ConditionalStatements_Loops;

import java.util.Scanner;

public class ForLoopArrayNumbersDivisibleByFive_06 {
    public static void main(String[] args) {

        //Given a list iterate it and display numbers which are divisible by 5 and if you find number greater than 150 stop
        //the loop iteration list1 = [12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200]

        int[] array = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        //for (int number : array)
        for (int i = 0; i < array.length; i++) {
           if (array[i] % 5 == 0) {
               System.out.println("Divisible be 5: " + array[i]);
                    if (array[i] > 150) {
                        System.out.println("Number greater than 150 found. Stopping the loop.");
                        break;
                    }
           }
        }

    }
}
