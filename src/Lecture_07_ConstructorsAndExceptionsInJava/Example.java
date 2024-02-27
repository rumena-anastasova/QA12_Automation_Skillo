package Lecture_07_ConstructorsAndExceptionsInJava;

public class Example {

        String model;
        int maxSpeed;

        public Example(String model, int maxSpeed) {
            this.model = model;
            this.maxSpeed = maxSpeed;
        }

        public static void main(String[] args) {
            Example bugatti = new Example("Bugatti Veyron", 378);
            System.out.println(bugatti.model);
            System.out.println(bugatti.maxSpeed);
        }

    }
