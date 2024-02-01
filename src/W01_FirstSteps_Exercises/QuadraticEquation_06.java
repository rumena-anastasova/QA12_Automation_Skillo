package W01_FirstSteps_Exercises;

public class QuadraticEquation_06 {
    public static void main(String[] args) {

        double a = 1.0;
        double b = -3.0;
        double c = 2.0;

        double descriminant = b * b - 4 * a * c;
        double root1 = (-b + Math.sqrt(descriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(descriminant)) / (2 * a);

        System.out.printf("Root 1 is %.2f %n", root1);
        System.out.printf("Root 2 is %.2f", root2);

    }
}
