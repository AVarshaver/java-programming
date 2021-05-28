package day12_comparison_examples;

public class ComparisonExamples2_sDanei {
    public static void main(String[] args) {
        int speedLimit = 5_5;
        int currentSpeed = 4_5;
        System.out.println(currentSpeed > speedLimit);
        System.out.println(speedLimit < currentSpeed);
        System.out.println(speedLimit == currentSpeed);

        speedLimit += 10;
        System.out.println(speedLimit);
        speedLimit --;
        System.out.println(speedLimit);
        --speedLimit;
        System.out.println(speedLimit);

        currentSpeed = speedLimit--;

        System.out.println(currentSpeed);
        System.out.println(speedLimit);
        System.out.println(speedLimit++);
        System.out.println(speedLimit);


    }
}
