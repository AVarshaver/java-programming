package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
    //PRE-INCREMENT
    int num1 = 10;
        int num2 = num1;
    System.out.println("num1 = "+num1);
    System.out.println("num2 = "+num2);
    num2 = num1++; // try to change lines #10 and #11 to understand how they change
    //num2 = ++num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    // --------------

        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);




}
}
