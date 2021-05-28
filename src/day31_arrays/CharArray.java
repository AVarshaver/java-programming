package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};

        //print each letter using a loop
        for (char eachChar : letters){
            System.out.print(eachChar + " ");
        }

        String sentence = new String(letters);
        System.out.println("\nsentence = " + sentence);


            String item = "wooden soon";
            char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length() = " + item.length());


        String[] languages = {"java", "python", "c++", "sql", "ruby", "javascript"};
        System.out.println(String.join("", languages));
        System.out.println(String.join("##",languages));
        String joinedLanguages = String.join(" >< ", languages);
        System.out.println("joinedLanguages = "+ joinedLanguages);
    }
}
