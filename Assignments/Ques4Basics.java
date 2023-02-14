//Write a Java program to convert Kilometers to miles.
import java.util.Scanner;

public class Ques4Basics {
    public static void main(String[] args){
        Scanner si = new Scanner(System.in);
        System.out.print("Enter distance in km: ");
        float km = si.nextFloat();
        float miles = 0.621f * km;
        // double miles = 0.621f * km;
        System.out.print("Miles: "+ miles);
    }
}
