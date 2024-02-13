package Lecture_04_Operators_Expression_ConditionalStatements_Loops;

import java.util.Scanner;

public class EligibleToWork_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());

        if (age >= 16) {
            System.out.println("You are eligible to work.");
        }
        else
            System.out.println("You are not eligible to work.");
    }
}
