package day12_comparison_examples;

import java.util.Scanner;

public class ComparisonExamples_sDanei {
    public static void main(String[] args) {
        Scanner item = new Scanner(System.in);

        double accountBalance = 250.25;
        double itemPrice = item.nextDouble();
        System.out.println("can I afford? - " + (accountBalance >= itemPrice));

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("can afford =" + canAfford);


    }
}
