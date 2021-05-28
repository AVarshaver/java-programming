package day43_list_custom_classes;

public class WithDanya {
    public static void main(String[] args) {
        getDigits(1,6,9);
        System.out.println(getBool("king", 'n' ));
        System.out.println(getDigits(3,4, "lol"));
        System.out.println(getDigits(1,2,"cat"));
    }

    public static void getDigits (int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        System.out.println(sum);
    }

    public static boolean getBool (String word1, char letter1){
        if(word1.contains(""+letter1)){
            return true;
        }else{
            return false;
        }
    }

    public static Integer getDigits (int num1, int num2, String str){
        int sum = num1 + num2 + str.length();
        getDigits(45,87,98);
                return sum;

    }
}
