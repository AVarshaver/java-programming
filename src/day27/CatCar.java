package day27;

public class CatCar {
    public static void main(String[] args) {
        String list = "cat,car,black cat,red car";
        for(int i = 0; i < list.length()-2; i++) {
            String part = list.substring(i, i+3);
            System.out.println("part = " + part);
            if(part.equals("cat") || part.equals("car")) {
                System.out.println("cat ot car found");
            }
        }
    }
}
