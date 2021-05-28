package day23_string_manipulation_while_loop;

public class FirstLoop {
    public static void main(String[] args) {
        int i =65;
        while (i<= 5) {
            System.out.println("lapulya"); //while the condition is true it will keep printing(infinite loop)
        }
            int apples = 0;
            while (apples <= 3) {
                System.out.println("apple -> " + apples);
                apples++;
            }
            System.out.println("apples = " + apples);

    }
}
