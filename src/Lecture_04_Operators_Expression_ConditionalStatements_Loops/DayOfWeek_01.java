package Lecture_04_Operators_Expression_ConditionalStatements_Loops;

import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayOfTheWeek = Integer.parseInt(scanner.nextLine());

        switch (dayOfTheWeek) {
            case 1:
                System.out.printf("The %d-st day of the week is Monday", dayOfTheWeek);
                break;
            case 2:
                System.out.printf("The %d-nd day of the week is Tuesday", dayOfTheWeek);
                break;
            case 3:
                System.out.printf("The %d-rd day of the week is Wednesday", dayOfTheWeek);
                break;
            case 4:
                System.out.printf("The %d-th day of the week is Thursday", dayOfTheWeek);
                break;
            case 5:
                System.out.printf("The %d-th day of the week is Friday", dayOfTheWeek);
                break;
            case 6:
                System.out.printf("The %d-th day of the week is Saturday", dayOfTheWeek);
                break;
            case 7:
                System.out.printf("The %d-th day of the week is Sunday", dayOfTheWeek);
                break;
            default:
                System.out.println("Error");
                break;

        }
    }
}
