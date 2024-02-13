package Lecture_05_DataStructures;

import java.util.Scanner;

public class MultidimensionalArraysWithScanner_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Print elements of a given 2-d matrix with dynamic rows and columns taken from user input
        //Input
        System.out.print("Enter the number of rows: ");
        int rows = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the number of columns: ");
        int columns = Integer.parseInt(scanner.nextLine());

        // Declare a 2D array with the specified number of rows and columns
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display the matrix elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();// Move to the next row
        }
    }
}
