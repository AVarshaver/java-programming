package day07_arithmetic_operations;

public class StringConcat {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 8;
        System.out.println(num1 + num2);
        System.out.println(num1 + " " + num2);
        System.out.println(num1+""+num2);

        char char1 = 'a'; //in char ascii table a is 97
        char char2 = 'b'; //in char ascii table a is 98
        System.out.println(char1 +char2); // in brackets it's gonna be just a sum
        System.out.println(char1 + "" +char2); //but adding empty quotes means that you add string,thus it prints ab

    }
}
