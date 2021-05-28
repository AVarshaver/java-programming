package day34;

public class FirstMethod {
    public static void main(String[] args) {
        displayMessage();//call the method - how you call it? you just put the name
        displayMessage();//when you put it for the 2nd time - it will be printed out twicely

        for (int i = 1; i <= 100; i++){
            System.out.print(i + " - ");
            displayMessage();
        }
    }
    //first custom reusable method
    public static void displayMessage() {
        System.out.println("Hello B22 Friends");
    }
}
