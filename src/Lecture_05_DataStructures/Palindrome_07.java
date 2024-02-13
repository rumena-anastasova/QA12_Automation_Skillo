package Lecture_05_DataStructures;

import java.util.Scanner;

public class Palindrome_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program which validate whether given string is palindrome
        // (A palindrome is a sequence of characters which reads
        //the same backward as forward, such as madam or racecar)

        String word = "level"; //radar, hello
        int wordLength = word.length();
        boolean isPalindrom = true;

         //Solution: check if the word and the reversed word are the same
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }
        isPalindrom = word.equals(reversedWord);

// Another solution: perform a check by comparing the characters
//        for (int i = 0; i < wordLength / 2; i++) {
//            if (word.charAt(i) != word.charAt(wordLength - 1 - i)) {
//                isPalindrom = false;
//                break;
//            }
//        }

// Another solution: use the StringBuilder class
//        String reversed = new StringBuilder(word).reverse().toString();
//        isPalindrom = word.equalsIgnoreCase(reversed);

        if (isPalindrom) {
            System.out.println("The word \"" + word + "\" is a palindrom");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a palindrom");
        }

    }
}
