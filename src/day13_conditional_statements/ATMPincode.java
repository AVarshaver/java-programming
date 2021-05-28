package day13_conditional_statements;

public class ATMPincode {
    public static void main(String[] args) {
        System.out.println("**** Welcome to TD Bank ATM ****");
        int secretPinCode = 2233;
        int inputPinCode = 2233;
        if (secretPinCode == inputPinCode) {
            System.out.println("Welcome to your account!");
            System.out.println("You can withdraw, check your balance, deposit");
        } else {
            System.out.println("Incorrect pincode! " + inputPinCode);
            System.out.println("Please try again!");
        }
    }
}
