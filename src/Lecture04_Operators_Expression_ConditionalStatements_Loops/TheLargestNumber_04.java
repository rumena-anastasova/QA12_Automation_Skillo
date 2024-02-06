package Lecture04_Operators_Expression_ConditionalStatements_Loops;

public class TheLargestNumber_04 {
    public static void main(String[] args) {

        //4. Find the largest number from a given array and print it in a console.
        // Hint: use for loop

        // Example array
        int[] array = {10, 5, 8, 20, 15};

        // Initialize the variable 'largest' with the first element of the array
        int largest = array[0];

        // Iterate through the array starting from the second element (index 1)
        for (int i = 1; i < array.length; i++) {
            // Compare the current array element to 'largest'
            if (array[i] > largest) {
                // If the current element is greater, update 'largest'
                largest = array[i];
            }
        }

        // Log the largest element to the console
        System.out.println("The largest element in the array is: " + largest);
    }
}
