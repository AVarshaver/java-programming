package day17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        double price = 30;
        boolean isPrimeMember = true;
        if (isPrimeMember) {
            System.out.println("Eligible for free 2 day shipping");
        }else {
            if (price >= 25.0) {
                System.out.println("Eligible for free 2 day shipping");
            }else {
                System.out.println("not Eligible for free 2 day shipping");
            }
        }
    }
}
