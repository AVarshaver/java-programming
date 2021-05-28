package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(10);
        count(5);

        int num2 = 999;
        count(num2);

        String word = "wooden spoon";
        count(word.length());

        printAge(1996);
    }
        public static void count(int num) {
            for (int i = 0; i <= num; i++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    /**
     * method name: printAge
     * @param/input: int year
     * Birth year. Age 37
     */

    public static void printAge(int year) {
        int age = 2021 - year;
        System.out.println("Age: "+age);
    }
}

