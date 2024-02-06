package Lecture04_Operators_Expression_ConditionalStatements_Loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Vacation_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfTheVacation = scanner.nextLine();
        int budgetPerDayPerPerson = Integer.parseInt(scanner.nextLine());

        switch (typeOfTheVacation) {
            case "Beach":
                if (budgetPerDayPerPerson < 50) {
                    System.out.println("We recommend Bulgaria as a destination.");
                }
                else {
                    System.out.println("We recommend a destination Outside Bulgaria.");
                }
                break;
            case "Mountain":
                if (budgetPerDayPerPerson < 30) {
                    System.out.println("We recommend Bulgaria as a destination.");
                }
                else {
                    System.out.println("We recommend a destination Outside Bulgaria.");
                }
                break;
            default:
                System.out.println("There is no information about this type of vacation.");
        }
    }
}
