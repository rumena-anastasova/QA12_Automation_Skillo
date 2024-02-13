package Lecture_02_FirstStepsInJava_Exercises;

public class QuadraticEquationWithIfElseCheck_06 {
    public static void main(String[] args) {

        //Квадратното уравнение има следния вид: ax2 + bx + c = 0
        //където a,b,c са реални числа, и a ≠ 0. Всяко квадратно уравнение може да има 0, 1 или 2 реални корена
        //получени по следната формула:
        // double root1 = (-b + Math.sqrt(descriminant)) / (2 * a);
        // double root1 = (-b - Math.sqrt(descriminant)) / (2 * a);
        //Числото D = b2 - 4ac се нарича дискриминанта.
        //double descriminant = b * b - 4 * a * c;
        //Ako D < 0, квадратното уравнение няма реални корени.
        //Ako D = 0, уравнението има 1 реален корен
        //Ako D > 0, квадратното уравнение има 2 реални корена.


        double a = 1.0;
        double b = -3.0;
        double c = 2.0;

        double descriminant = b * b - 4 * a * c;

        if (descriminant >= 0) {
            double root1 = (-b + Math.sqrt(descriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(descriminant)) / (2 * a);

            System.out.printf("Root 1 is %.2f, %n", root1);
            System.out.printf("Root 2 is %.2f", root2);
        } else {
            System.out.println("No real roots.");
        }
    }
}
