package day12_comparison_examples;

public class IfElseStatement {
    public static void main(String[] args) {
        if(10>5) {
            System.out.println("CONDITION IS TRUE");
        } else {
            System.out.println("CONDITION IS FALSE");
        }

        int count = 25;
        // check if count is more than 30. If yes, print "count is more than 30"
        // otherwise  print "count is less than 30"
        if (count > 30) { //false
            System.out.println("count is more than 30");
        }else {
            System.out.println("count is less than 30");
        }

    }
}
