package Lecture_06_MethodsInJava;

import java.util.Scanner;

public class IsPalindrome_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (IsIntPalindrome(number)) {
            System.out.println(number + " is palindrome");
        } else {
            System.out.println(number + " is not palindrome");
        }

    }
    public static boolean IsIntPalindrome(int number) {
        String numberStr = Integer.toString(number);
        int length = numberStr.length();

        //Използваме две индексни променливи - i и j, които се стартират от началото и края на низа съответно.
        //По този начин, всяка итерация на цикъла обработва два символа - един от началото и един от края на низа.
        //i стартира от началото на низа (0), а j - от края на низа (length - 1).
        //Условието i < j гарантира, че цикълът ще се изпълнява докато i е по-малко от j, т.е. докато не стигнем до средата на низа.
        //Вътре в цикъла проверяваме дали символите на позиции i и j съвпадат. Ако не, връщаме false - числото не е палиндром.
        //С инкрементирането на i и декрементирането на j във всяка итерация на цикъла,
        // той продължава да проверява останалите символи в двете половини на числото.
        //Ако не се върне false през цикъла, това означава, че всички символи са съпадащи, и методът връща true - числото е палиндром.

        for (int i = 0, j = length - 1; i < j; i++, j--) {
            if (numberStr.charAt(i) != numberStr.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
