package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {

        Car car1 =  new Car();
        //ERROR BELOW: year and model -> are PRIVATE and cannot be accessed
//        car1.model = "Nissan Altima";
//        car1.year = 2020;
        car1.setModel("Nissan Altima");
        System.out.println("car1.model = "+ car1.getModel());

        car1.setYear(2020);
        System.out.println("car1.year = "+car1.getYear());

        car1.setMileage(45230);
        System.out.println("car1.getMileage() = "+car1.getMileage());

        System.out.println(car1.toString());
        System.out.println(car1); //automatically calls toString method

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Alfa Romeo Giulia Ti AWD");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(16604);
    }
}
