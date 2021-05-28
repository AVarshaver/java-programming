package day39_wrapper_classes;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        //autoboxing example - convert from primitive to Wrapper
        //primitive > wrapper class object
        int num1 = 500;
        Integer num2 = num1;
        Integer num3 = 234;

        // Un-boxing: object > primitive
        Double d1 = new Double(100.5); //here Double d1 is Wrapper Class Object
        double d2 = d1; //d1 is primitive, it's gor cut from object to primitive
        double d3 = new Double(345.3);//this is unboxing
    }
}