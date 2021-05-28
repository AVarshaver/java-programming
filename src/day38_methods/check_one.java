package day38_methods;

public class check_one {
    public static void main(String[] args) {
    System.out.print(lake(4, 7));

    }

    public static String lake (int num1, int num2) {
        int sum = num1 + num2;
        if (sum > 5) {
            return "putin";
        }else{
            return "yanukovich";
        }
    }

    public static String lake(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        if (sum >20) {
            return "putin";
        }else{
            return "yanukovich";
        }
    }
}
