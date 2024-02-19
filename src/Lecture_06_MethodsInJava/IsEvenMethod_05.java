package Lecture_06_MethodsInJava;

import java.util.Scanner;

public class IsEvenMethod_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //4. Write a method named isEven that accepts an int argument. The method should return true if the
        //argument is even, or false otherwise.

        int number = Integer.parseInt(scanner.nextLine());

        if (IsEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    //Метод, който проверява дали цялото число е четно
    public static boolean IsEven(int number) {
        return number % 2 == 0;
    }
}
