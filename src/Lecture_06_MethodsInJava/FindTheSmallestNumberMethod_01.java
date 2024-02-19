package Lecture_06_MethodsInJava;

public class FindTheSmallestNumberMethod_01 {
    public static void main(String[] args) {

        //1. Write a Java method to find the smallest number among three numbers

        int num1 = 12;
        int num2 = -1;
        int num3 = 8;

        int smallestNumber = findSmallestNumber(num1, num2, num3);

        System.out.println("The smallest number is: " + smallestNumber);
    }

    // Method to find the smallest number among three numbers
    public static int findSmallestNumber(int num1, int num2, int num3) {
        int smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        return smallest;

    }
}
