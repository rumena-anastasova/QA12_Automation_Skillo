package Lecture_04_Operators_Expression_ConditionalStatements_Loops;

public class ReversedList_07 {
    public static void main(String[] args) {
        int [] list1 = { 10, 20, 30, 40, 50 };
        int index = 4;
        while (index >= 0) {
            System.out.print(list1[index] + " ");
            index--;
        }

        //Second solution
        //for (int i = list1.length - 1; i >= 0; i--) {
        //System.out.print(list1[i] + " ");
        //}
    }
}
