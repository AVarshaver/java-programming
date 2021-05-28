package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0.0;
        double salesAmount = 2000.35;
        if (salesAmount <= 2000) {
            System.out.println("Good job, you're qualified for bonus!");
            bonus = 50;
        } else {
            System.out.println("Great job, you're qualified for full bonus!");
            bonus = 100;
        }
        System.out.println("Your total bonus is: " + bonus);


        double price = 130.44;
        boolean isAffordable = price <= 200.0;
        System.out.println("isAffordable = " + isAffordable);
        if (isAffordable) {
            System.out.println("I can afford it, lets buy!");
        } else {
            System.out.println("Too expensive, lets keep coding java");
        }
    }
}
