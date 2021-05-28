package day16_switch;

public class CapuccinoBuyer {
    public static void main(String[] args) {
        String size = "venti";
        double price = 0.0;
        int calories = 0;

        if (size.equals("tall")) { //lines 11-12 are exactly the same whay line 9
        }
        switch(size) {
            case "tall":
                System.out.println("Tall capuccino please");
                price = 3.69;
                calories = 90;
            break;
            case "grande":
                System.out.println("Grande capuccino please");
                price = 3.99;
                calories = 120;
            break;
            case "venti":
                System.out.println("Venti capuccino please");
                price = 4.29;
                calories = 150;
            break;
            default:
                System.out.println("we dont have that "+size+" capuccino");
            break; //optional if defailt is at the end
        }
        System.out.println("Total price: $" + price);
        System.out.println("You will consume " + calories + " cals of energy");
    }
}
