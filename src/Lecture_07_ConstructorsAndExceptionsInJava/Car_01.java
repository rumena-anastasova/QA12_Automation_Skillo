package Lecture_07_ConstructorsAndExceptionsInJava;
//Create a Car class which has 5 elements name / color / release year / horse power / second hand tick.
//Name and color must be from string type / release year and horse power to be integers / second hand is boolean

//Requirements:
//If name or color is not specified set N/A as value
//If release year or horse power is not specified set -1 as value
//If second hand is not specified set false as value

//Create a constructors of Car class for the following cases:
//Create a car by provided name / color / release year / horse power / second hand
//Create a car by provided name / color / second hand
//Create a car by provided name / color / release year / horse power
//Create a car by provided name / release year / horse power / second hand
//Create a car by provided nothing
//Create Car object using each constructor

public class Car_01 {
    private String name;
    private String color;
    private  int releaseYear;
    private  int horsePower;
    private boolean secondHandTick;

    public Car_01(String name, String color, int releaseYear, int horsePower, boolean secondHandTick) {
        this.name = validateName(name);
        this.color = validateColor(color);
        this.releaseYear = validateReleaseYear(releaseYear);
        this.horsePower = validateHorsePower(horsePower);
        this.secondHandTick = secondHandTick;
    }
    private String validateName(String name) {
        if (name != null && !name.isEmpty()) {
            return name;
        } else {
            return "N/A";
        }
    }

    private String validateColor(String color) {
        if (color != null && !color.isEmpty()) {
            return color;
        } else {
            return "A/N";
        }
    }

    private int validateReleaseYear(int releaseYear) {
        if (releaseYear > 0) {
            return releaseYear;
        } else {
            return -1;
        }
    }

    private  int validateHorsePower(int horsePower) {
        if (horsePower > 0) {
            return horsePower;
        } else {
            return -1;
        }
    }

    public Car_01(String name,String color,boolean secondHandTick) {
        this.name = validateName(name);
        this.color = validateColor(color);
        this.releaseYear = -1;
        this.horsePower = -1;
        this.secondHandTick = secondHandTick;
    }

    public Car_01(String name, String color, int releaseYear,int horsePower) {
        this.name = validateName(name);
        this.color = validateColor(color);
        this.releaseYear = validateReleaseYear(releaseYear);
        this.horsePower = validateHorsePower(horsePower);
        this.secondHandTick = false;
    }

    public Car_01(String name, int releaseYear, int horsePower, boolean secondHandTick) {
        this.name = validateName(name);
        this.color =  "N/A";
        this.releaseYear = validateReleaseYear(releaseYear);
        this.horsePower = validateHorsePower(horsePower);
        this.secondHandTick = secondHandTick;
    }

    public Car_01() {
        this.name = "N/A";
        this.color = "N/A";
        this.releaseYear = -1;
        this.horsePower = -1;
        this.secondHandTick = false;
    }

//За тестване на класа, добавяме toString метод, който позволява
//да изведем информация за обектите от класа в четим формат.
//Mетодът връща текстов низ, представляващ информацията за обекта, което може да бъде полезно при тестването на класа.
    @Override
    public String toString() {
        return "Car_01{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", releaseYear=" + releaseYear +
                ", horsePower=" +horsePower +
                ", secondHandTick=" +secondHandTick +
                '}';
    }

    //Накравя създаваме обекти от класа Car_01 в main метода, за да използваме различните конструктори,
    // като предоставяме различни комбинации от данни. Напр.
//    public class main {
        public static void main(String[] args) {
            Car_01 car1 = new Car_01("Mitsubishi", "Gray", 2005, 200, true);
            Car_01 car2 = new Car_01("Ford", "Red", true);
            Car_01 car3 = new Car_01("Toyota", "Yellow", 2018, 180);
            Car_01 car4 = new Car_01("Subaru",2010, 150, true);
            Car_01 car5 = new Car_01();

            System.out.println(car1);
            System.out.println(car2);
            System.out.println(car3);
            System.out.println(car4);
            System.out.println(car5);

        }
    }
//}
