package assesment_test_2;

public class Checkkk {
    public static void main(String[] args) {
        String str = "The whole time it was raining.";

        do {
            System.out.println(str.charAt(0));
            str = str.substring(3);
        }while(!str.isEmpty());
    }
}
