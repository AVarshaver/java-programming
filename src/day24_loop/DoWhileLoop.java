package day24_loop;

public class DoWhileLoop {
    public static void main(String[] args) {
        int counter = 1;
        do {
            System.out.println("counter = "+counter);
            counter+=100;
        }while  (counter <= 10);
    }
}
