package day32;
import java.util.*;
public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        System.out.println("---- Starting deployment of etsy app to AWS zones......");
        String[] zonesToDeploy = zones.split(",");
        System.out.println(zonesToDeploy[1]);
        System.out.println(Arrays.toString(zonesToDeploy));

        for ( String eachZone : zonesToDeploy) {
            System.out.println(eachZone);
        }
    }
}
