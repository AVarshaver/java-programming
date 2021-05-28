package day16_switch;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 3;
        if (floorNum == 1) {
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
        } else if (floorNum == 2) {
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        } else if (floorNum == 3) {
            System.out.println("Floor 3 selected. Companies: Lyft, Bofa");
        } else {
            System.out.println("Invalid floor - " + floorNum);
        }
        System.out.println("=======SWITCH STATEMENT VERSION=======");


        floorNum = 2;
        switch (floorNum) {
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break; //EXIT SWITCH AFTER EACH CASE
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                break; //exit the switch statement
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, Bofa");
                break;
            default:
                System.out.println("Invalid floor - " + floorNum);
                break;
        }
    }
}