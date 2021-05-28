package assesment_test_2;

public class Assescheck {
    public static void main(String[] args) {
        String s = "the game was tied at 2-2";
        String s2 = s.substring(5);

        int index1 = s.indexOf("game");
        int index2 = s2.indexOf("game");

        if (index1 == index2) {
            System.out.print(index1);
        }else{
            System.out.print(index2);
        }
    }
}
