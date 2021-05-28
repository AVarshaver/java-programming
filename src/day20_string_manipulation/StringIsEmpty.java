package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        if (jobTitle.isEmpty()) {
            System.out.println("JobTitle is missing, please resend");
        } else {
            System.out.println("Job title looks good");
        }
        if (jobTitle.length() == 0) {
            System.out.println("jobTitle is empty");
        } else {
            System.out.println("job title is not empty");
        }
        System.out.println(jobTitle.equals(""));

    }
}
