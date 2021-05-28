package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 7; //TRY TO INPUT NUMBERS < 10 AND > 10 - WILL BE DIFF RESULTS
        /**
         * * if number is less than 1 or more than 10
         * print "ER"
         */
        if(number < 1 || number > 10) {
            System.out.println("ERROR: invalid input");
            return;
        }
        for(int i = 1; i<=10; i++){
            System.out.println(number + " x " + i + " = " + (number*i) );
        }

    }
}
