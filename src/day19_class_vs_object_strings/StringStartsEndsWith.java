package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("i"));//true
        System.out.println(word.startsWith("in"));
        System.out.println(word.startsWith("intellij"));
        /**
         * Safura Taghiyeva — Today at 4:25 PM
         * <@!767133106318213170> What if we put the whole word for startsWith and endsWith?
         */
        System.out.println(word.startsWith("intellij idea"));
        System.out.println("java".startsWith("j"));

        System.out.println(word.startsWith("Int")); //false. case sensitive

        System.out.println(word.endsWith("idea"));
        System.out.println(word.endsWith("a"));

        String name = "Irina";
        if(name.endsWith("a")) {
            System.out.println("Maybe, it is a female name");
        }

        /**
         * Mr. -> Man
         * Dr. -> Doctor
         * Mrs.-> Married woman
         * Ms. -> Single woman
         * Sr. -> Senior
         */

        String firstName = "Dr. Nadir";


    }
}
