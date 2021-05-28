package day17_ternary_nested_conditions;

public class moreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = (hourlyRate > 45) ? "accept" : "deny";
        System.out.println(reply);

        String todayClass = "java";
        String teacher = (todayClass.equals("java")) ? "Saim|Murodil" : "Nadir";
        System.out.println("Today's teacher = " + teacher);


        boolean isEligibleToDrive = true;
    // have DL, Can drive  "No DL, cannot drive"
        String driving = isEligibleToDrive ? "yes, have DL, can drive" : "no DL, cannot drive";
        System.out.println("driving = " + driving);
    }
}
