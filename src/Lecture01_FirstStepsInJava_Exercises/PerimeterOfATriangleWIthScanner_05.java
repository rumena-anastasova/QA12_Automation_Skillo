package Lecture01_FirstStepsInJava_Exercises;

import java.util.Scanner;

public class PerimeterOfATriangleWIthScanner_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sideA = Integer.parseInt(scanner.nextLine());
        int sideB = Integer.parseInt(scanner.nextLine());
        int sideC = Integer.parseInt(scanner.nextLine());

        int perimeterOfATriangle = sideA + sideB + sideC;

        System.out.println(perimeterOfATriangle);
    }
}
