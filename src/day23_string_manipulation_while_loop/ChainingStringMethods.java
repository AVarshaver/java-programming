package day23_string_manipulation_while_loop;

public class ChainingStringMethods {
    public static void main(String[] args) {
        //remove spaces first then print everything uppercase

        // selenium.findElement(By.id.("hi")).click();

        String city = "kAbUl";
                             //read 1st letter.makeUcase     + read 2nd till last.make lowercase
        System.out.println(city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase());
        String capitalized = city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase();
        System.out.println("capitalized = " + capitalized);

        //.isEmpty().toUpperCase() Does not work since isEmpty is boolean


    }
}
