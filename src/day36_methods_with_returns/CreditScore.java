package day36_methods_with_returns;

public class CreditScore {
    public static void main(String[] args) {

        //System.out.println(checkEligible(711)); ERROR - CANNOT PRINT VOID METHOD
        System.out.println(getCreditScore());
        System.out.println("Score = " + getCreditScore());

        checkEligible(760);
        checkEligible(815);
        checkEligible(400);

    }

    public static int getCreditScore () {
        return 800;
    }


        public static void checkEligible ( int creditScore){
            if (creditScore >= 700) {
                System.out.println("You are eligible for leasing this car");
            } else {
                System.out.println("Sorry, you are not eligible for leasing");
            }

        }
        }


