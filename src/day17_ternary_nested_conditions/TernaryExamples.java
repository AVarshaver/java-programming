package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String [] args) {
        int score1 = 75;
        String result1;
        if (score1>60) {
            result1 = "pass";
        } else {
            result1 = "fail";
        }
        System.out.println(result1);


        int score2 = 70;
        String result = (score2>60) ? "pass" : "fail";
        System.out.println(result);

        String quality = "good";
        int x = (quality.equals("good")) ? 100 : 0;
        System.out.println(x);

        char grade = (score2>90) ? 'A' : 'B';
        System.out.println(grade);

        String evenOdd = (score2%2==0) ? "even" : "odd";
        System.out.println(evenOdd);
    }
}
