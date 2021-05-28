package day28_loops;
import java.util.*;
public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghigklmnopqrstuvwxyz0123456789_!@#$%^&*";
        Random random = new Random();//helps to generate random number
        String password = "";

        for(int i = 1; i <= 8; i++) {
            int index = random.nextInt(71); //random num 0-70 because we counted that source has 71 chars
            System.out.print(source.charAt(index));
            //add the char to password variable using +=
            //password = password + source.charAt(index);
            password += source.charAt(index);
        }
        System.out.println("\nYour pasword = " + password);
    }
}
