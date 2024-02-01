package W01_FirstSteps_Exercises;

import java.util.Scanner;

public class AreaOfATriangleWithScanner_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sideA = Double.parseDouble(scanner.nextLine());
        double hightA = Double.parseDouble(scanner.nextLine());

        double areaOfATriangle = (sideA * hightA) / 2;

        System.out.println(areaOfATriangle);
    }
}
