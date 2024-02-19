package Lecture_06_MethodsInJava;

import java.util.Scanner;

public class MiddleCharacterOfAString_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //3. Write a Java method to display the middle character of a string.
        //Note:
        //a) If the length of the string is even there will be two middle characters.
        //b) If the length of the string is odd there will be one middle character.
        //Write a Java method to count all words in a string.

                String str = scanner.nextLine();
                System.out.println(displayMiddleCharacter(str));

            }

            // Method to display the middle character(s) of a string
            public static String displayMiddleCharacter(String str) {
                int length = str.length();
                String result;

                if (length % 2 == 0) {
                    // If the length is even, there are two middle characters
                    int middle1 = length / 2 - 1;
                    int middle2 = length / 2;
                    result = "Middle characters: " + str.charAt(middle1) + " and " + str.charAt(middle2);
                } else {
                    // If the length is odd, there is one middle character
                    int middle = length / 2;
                    result = "Middle character: " + str.charAt(middle);
                }

                return result;
            }
}

