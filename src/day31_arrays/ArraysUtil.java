package day31_arrays;
import java.util.*;
public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums = {100, 5, 1, 7, 0, -4, 44, 33};
        //print all nums in the same line
        System.out.println(Arrays.toString(nums));
        //sort nums
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("min value = " + nums[0]);
        System.out.println("max value = " + nums[nums.length - 1]);

        //Arrays.sort(nums, Comparator.reverseOrder());
        String[] words = {"Java", "C#", "C++", "Kotlin", "Python", "Ruby", "assembly"};
        System.out.println(Arrays.toString(words)); // we do this to print all the words
        System.out.println("[" + String.join(", ", words) + "]");  //2nd option to print all the words -
        // string.join works only with Strings

        //how can we sort those words in alphabetic and ASCII order? see the following:
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));


        //sort words in reverse order:
        Arrays.sort(words, Collections.reverseOrder()); //it comes from util
        System.out.println(Arrays.toString(words));
    }
}
