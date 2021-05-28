package day32;

public class SentenceSplit {
    public static void main(String[] args) {
        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] results = googleResult.split(" ");
        System.out.println("Count = " + results[1]);
        System.out.println("Seconds = " + results[3]);

        String[] lol = googleResult.split("t");
    }
}
