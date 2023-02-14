//Write a program to sum three numbers in Java.
import java.util.Scanner;

public class Ques1Basics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of Sub 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter marks of Sub 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter marks of Sub 3: ");
        int m3 = sc.nextInt();
        float a = ((m1 + m2 + m3)/300.0f) * 100;
        System.out.print("Percentage: "+ a);
        // System.out.print(a);
    }
}