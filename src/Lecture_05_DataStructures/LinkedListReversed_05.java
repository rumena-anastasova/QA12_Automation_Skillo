package Lecture_05_DataStructures;

import java.util.LinkedList;

public class LinkedListReversed_05 {
    public static void main(String[] args) {

        //Reverse the order of the elements in a LinkedList using algorithm
        //Създаваме LinkedList
        LinkedList<Integer> listOfNumbers = new LinkedList<>();
        listOfNumbers.add(1);
        listOfNumbers.add(2);
        listOfNumbers.add(3);
        listOfNumbers.add(4);
        listOfNumbers.add(5);
        listOfNumbers.add(7);
        listOfNumbers.add(8);

        //Принт на оригиналния линкедлист
        System.out.println("Original LinkkedList: " + listOfNumbers);

        //Algorithm:
        // 1. Create a linked list with n elements
        // 2. Run the loop for n - 1 times where ‘n’ is the number of elements in the LinkedList (size()).
        // 3. On each iteration: get and remove the last element ( pollLast() ). Replace the
        // current element with the removed one
        for (int i = 0; i < listOfNumbers.size() -1 ; i++) {
            int lastElem = listOfNumbers.pollLast();
            listOfNumbers.add(i, lastElem);
        }

        System.out.println(listOfNumbers);

    }
}
