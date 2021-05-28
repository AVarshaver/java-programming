package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for (int stars = 1; stars <= 15; stars++) {
            System.out.print("\uD83C\uDF1F ");
        }
        System.out.println();// it's empty println so we could start a new line
        String myStars = "";
        //for loop: fill 5 stars to mySTars variable
        for(int stars = 1; stars <= 5; stars++) {
            //myStars = myStars + "* "   - we could do that but there is a shorter version:
            myStars += "* ";
        }
        System.out.println("my stars = " + myStars.trim()); // * * * * *

    }
}
