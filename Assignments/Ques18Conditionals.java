//Write a Java program to find whether a year entered by the user is a leap year or not.
import java.util.Scanner;

public class Ques18Conditionals {
    public static void main(String[] args){
        Scanner si = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = si.nextInt();
        if(year%4 == 1){
            System.out.print("Not a leap year");
        }
        else{
            System.out.print("Leap Year");
        }
    }
}
