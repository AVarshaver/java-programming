package day35_methods_with_param;

public class VoidMethods {
    public static void main(String[] args) {
        printAtoZ();
        printAtoZ();
    }
        /**
         * method name: printAtoZ
         * desc: prints English alphabet in all uppercase
         */
        public static void printAtoZ() {
            for (char i = 'A'; i <= 'Z'; i++) {
                System.out.println(i + " ");
            }
            System.out.println();
        }

    /**
     * method name: displayUSFlag
     * displays flag of the USA
     */
    public static void displayUSFlag() {

    }
}

