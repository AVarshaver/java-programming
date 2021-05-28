package day32;

public class CountUsingSplit {
    public static void main(String[] args) {
        String cats = "bengal cats tabby cat persian cat no cat here some other cat";
        String[] catsArray = cats.split("cat");
        System.out.println("number of 'cat' = "+ (catsArray.length-1));
    }
}
