package day36_methods_with_returns;
import java.util.*;
public class Info {
    public static void main(String[] args) {
    fullName();
        System.out.println("Full name = " + fullName());
        System.out.println("isMarried = " + isMarried());
        System.out.println("Age = " + getAge());
        System.out.println("Birth year = " + getRandomYear()); //dynamic. different year each time

        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + fullName());
        System.out.println("married = " + isMarried());
        System.out.println("age = " + getAge());
        System.out.println("year = " + year);
    }

    public static String fullName() {
        System.out.println("inside fullName method"); //that means that we can prin tinside called method but I didnt understand
        return "Mike Smith";

    }

    public static boolean isMarried() {
        return false;
    }

    public static int getAge() {
        int age = 35;
        return 35;
    }

    public static int getRandomYear() {
        Random random = new Random();
            int randomYear = random.nextInt(2021);
            return randomYear;

    }
}
