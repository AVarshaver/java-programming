package day47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress = new Address();
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3300");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipcode("22182");

        System.out.println("Cybertek School address: " + cybertekAddress.toString());

        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3200");

        System.out.println();
    }
}
