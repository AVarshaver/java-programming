//package day41_arrays_continue;
//import java.util.*;
//public class ArrayAsList {
//    public static void main(String[] args) {
//        List<Integer>  nums =  Arrays.asList( 23, 1, 34,54, 654);
//        System.out.println("nums = "+ nums);
//        //nums.add(100); UnsupportedOperationException
//        //nums.remove(0); UnsupportedOperationException
//        //nums.clear(); UnsupportedOperationException
//
//        List<Integer> numsList = new ArrayList <>(Arrays.asList(4, 2, 4, 23, 5344, 100));
//       numsList.add(33);
//        numsList.add(56);
//        System.out.println("numsList = "+numsList);
//        numsList.remove(0);
//        numsList.remove(new Integer(23));
//        System.out.println("numsList = "+ numsList);
//
//        /**
//         * List STring srinksWithCaffeine -> coffee, tea, monster, red bull, coke, pepsi, mdew, kombucha
//         * int caffeineAmount = 0;
//         * monster, red bul, celsius:
//         * caffeineAmount = 150
//         * coffee, kombucha:
//         * caffeineAmount = 112
//         * tea, coke, pepsi, mdew:
//         * caffeineAmount = 35
//         */
//
//        List<String> drinksWithCaffeine = new ArrayList<> (Arrays.asList("coffee","tea","monster", "red bull", "coke", "pepsi", "mdew", "kombucha"));
//        System.out.println(drinksWithCaffeine);
//
//        int caffeineAmount = 0;
//        for (String drink : drinksWithCaffeine) {
//            if(drink.equals("monster") || drink.equals("red bull") || drink.equals("celcius")) {
//                caffeineAmount = 150;
//                System.out.println(drink + " - - > " + caffeineAmount);
//            }else if (drink.equals("coffee") || drink.equals("kombucha")) {
//                caffeineAmount = 112;
//                System.out.println(drink + "  -- > "+caffeineAmount);
//            }else if (drink.equals("tea")|| drink.equals("coke")||drink.equals("pepsi") || drink.equals("mdew")) {
//                caffeineAmount = 35;
//                System.out.println(drink+ "  -- >" + caffeineAmount);
//            }
//        }
//
//        for (String drink : drinksWithCaffeine){
//            switch (drink) {
//                case "monster": case "red bull": case "celcius":
//            caffeineAmount = 150;
//                    System.out.println(drink +" + --> "+ caffeineAmount);
//                    break;
//
//                case"coffee": case "kombucha":
//                    caffeineAmount = 112;
//                    System.out.println(drink +" + --> "+ caffeineAmount);
//                    break;
//
//                case "tea": case "coke": case "pepsi": case "mdew":
//                    caffeineAmount = 35;
//                    System.out.println(drink +" + --> "+ caffeineAmount);
//                    break;
//
//            }
//        }
//        drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase());
//        drinksWithCaffeine.forEach(each -> {
//            System.out.println("this is ForEach Block");
//
//        });
//
//    }
//}
