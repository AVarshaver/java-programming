package day21_string_manipulation;

public class StringReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub","lab"));
        System.out.println("word = " + word);

        word = word.replace("hub", "lab");
        System.out.println("word = " + word);

        //gitlab
        //i->o a-i --> gotlib
        System.out.println(word.replace('i', 'o').replace('a','i'));

        String sentence = "java is fun";
        String withNoSpaces = sentence.replace(" ","");
        System.out.println("withNoSpace = " + withNoSpaces);
        //"java" -> "selenium", "fun" -> "a lot of fun"
        sentence = sentence.replace("java","selenium").replace("fun","a lot of fun");
        System.out.println("sentence = " + sentence);

        String result = "1-48 of over 4,000 results for java book";
        result = result.replace("1-48 of over ","")
                       .replace(",","")
                       .replace(" results for java book","");
        System.out.println("result = " + result);
    }
}
