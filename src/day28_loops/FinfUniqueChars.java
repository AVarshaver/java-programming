package day28_loops;

public class FinfUniqueChars {
    public static void main(String[] args) {
        String word = "jaavva";
        String unique = "";

        for(int i = 0; i < word.length(); i++) {
            //if word.charAt(i) is not contain in unique
            //add to unique
            if(!unique.contains(word.charAt(i)+"")) {
                unique += word.charAt(i);
            }
        }
        System.out.println(unique );
    }
}
