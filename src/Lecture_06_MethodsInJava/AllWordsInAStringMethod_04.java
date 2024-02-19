package Lecture_06_MethodsInJava;

import java.util.Scanner;

public class AllWordsInAStringMethod_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //4.Write a Java method to count all the words in a string

        String inputString = scanner.nextLine();

        // Извикваме метода за броене на думите и отпечатваме резултата
        int wordCount = countWordsInAString(inputString);
        System.out.println("Брой думи в низа: " + wordCount);
    }

    // Метод за броене на думи в низ
    public static int countWordsInAString(String text) {
        if (text == null || text.isEmpty()) {
            return 0; // Връща 0, ако низът е null или празен
        }

        int wordCount = 1; // Започва с 1, защото първата дума няма интервал пред нея

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i); //Достъп до символите (char c = text.charAt(i);):
                                     // text.charAt(i) извлича символа на текущия индекс i от низа text.
                                    //Извлеченият символ се запазва в променливата c.

            // Проверете дали символът е интервал
            if (c == ' ') {
                wordCount++; // Увеличете броя на думите за всяко интервал
            }
        }

        return wordCount; // Върнете крайния брой думи
    }
}


// public static int countWordsInAString2(String text) {
//        if (text == null || text.isEmpty()) {
//            return 0;
//        }
//        String[] words = text.split(" ");
//        return words.length;
//    }