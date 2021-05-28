package day30_arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ArrayLoopWithCondition {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
        //print all numbers from prices
        System.out.println("----- prices more than 100-----");
        for (double eachPrice : prices) {
            if (eachPrice > 100.0) {
                System.out.print(eachPrice + " ");
            }
        }
        System.out.println("\n---- prices between 10 and 70 inclusive----");
        for (double price : prices) {
            if (price >= 10 && price <= 70) {
                System.out.print(price + " ");
            }
        }


    }
}
