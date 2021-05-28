package day30_arrays;

import java.util.Locale;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
        student1[0] = "AD1234";
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = "202-543-1234";
        //we can do it shorter way
        String[] student2 = {"MK4421", "Mike", "Bloomberg", "B22", "703-345-6789"};

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student 1 first name = " + student1[1]);
        System.out.println("student 1 last name = " + student1[2]);
        System.out.println("student 1 batch num = " + student1[3]);
        System.out.println("student 1 mobile num = " + student1[4]);

        System.out.println("student data length: " + student1.length);

        //check if student data array contains  items
        // true: PASS: data array has correct length
        // false: FAIL: data array has incorrect length

        if (student1.length == 5) {
            System.out.println("PASS: data array has correct length");
        } else {
            System.out.println("false: FAIL: data array has incorrect length");
        }

        /**
         * check if student1 and student2 arrays have same number of data
         true: PASS: data arrays length match
         false: FAIL: data arrays length mismatch
         */
        if (student1.length == student2.length) {
            System.out.println("true: PASS: data arrays length match");
        } else {
            System.out.println("false: FAIL: data arrays length mismatch");
        }

        System.out.println(student1[1].toUpperCase() + " " + student2[2].toUpperCase());

        String mobileNum = student1[4]; //PHONE NUMBER - YOU ALWAYS TREAT IT AS STRING, NOT INT

    }
}