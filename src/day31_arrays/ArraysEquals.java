package day31_arrays;
import java.util.*;
public class ArraysEquals {
    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        int[] num2 = {1,2,3,4};
        System.out.println("num == num2 - " + Arrays.equals(num, num2));

        if(Arrays.equals(num,num2)) {
            System.out.println("num and num1 match");
        }else{
            System.out.println("num and num1 mismatch");
        }

    }
}
