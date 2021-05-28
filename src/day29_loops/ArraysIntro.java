package day29_loops;

public class ArraysIntro {
    public static void main(String[] args) {
        int num = 10; //single variable
        int[] nums = new int[3]; //array variable
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 7;
        //

        int i = 0;
        System.out.println(nums[i]);
        i++;
        System.out.println(nums[i]);

        //how to findout the size of the arrau
        System.out.println("number of elements = " + nums.length);
        //store length of array into len variable
        int len = nums.length;
        System.out.println("len = " + len);

        //change values in the array:
        nums[0] = 100;
        nums[1] = 300;
        nums[2] = nums[1];

        System.out.println("nums[0] = "+ nums[0]);
        System.out.println("nums[1] = "+ nums[1]);
        System.out.println("nums[2] = "+ nums[2]);
    }
}
