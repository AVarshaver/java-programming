package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {

        System.out.println(100 == 100);
        System.out.println(1000 >= 100);
        System.out.println(99.8 < 569);
        System.out.println(10>11);
        System.out.println(-100 != 40);

        int d = 200;
        int f = 356;
        System.out.println(d>=f);
        System.out.println(d!=f);
        System.out.println(d<f);

//-----------------------------------
        boolean result = 5 ==5;
        System.out.println("RESULT = " + result);  // use SHORTCUT soutv

        result = 33 > 45;
        System.out.println("result = " + result);

        result = 10>=10;
        System.out.println("result = " + result);

        String city = "Seattle";
        System.out.println(city == "Seattle");
        System.out.println(city == "Baku");
        System.out.println(city != "London");

        String name = "Nadir";
        boolean checkName = name == "Nadir";
        System.out.println("checkName = " + checkName);
    }
}
