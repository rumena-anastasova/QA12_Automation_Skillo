package Lecture_04_Operators_Expression_ConditionalStatements_Loops;

import java.util.Scanner;

public class TheRevenueFromSale_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double productPrice = Double.parseDouble(scanner.nextLine());
        int productQuantity = Integer.parseInt(scanner.nextLine());

        double totalSum = productQuantity * productPrice;

        if (productQuantity >= 100 && productQuantity <= 120) {
            totalSum = totalSum * 0.85;
        } else if (productQuantity > 120) {
            totalSum = totalSum * 0.80;
        }

        System.out.printf("The revenue from sale: %.2f$", totalSum);

    }
}
