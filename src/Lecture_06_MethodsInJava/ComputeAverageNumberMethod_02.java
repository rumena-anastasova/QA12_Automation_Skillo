package Lecture_06_MethodsInJava;

import java.util.Scanner;

public class ComputeAverageNumberMethod_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a Java method to compute the average of three numbers. (R.A. Ще го направя със скенер)

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        double num3 = Double.parseDouble(scanner.nextLine());

        double averageNumber = computeAverageNumber(num1, num2, num3);

        System.out.println("The average number ot given three is " + averageNumber);

      }

    // Method to compute the average of three numbers
    public static double computeAverageNumber(double number1, double number2, double number3) {
        return (number1 + number2 + number3) / 3.0;
    }
}
