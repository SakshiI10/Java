//Write a Java program to detect whether a number entered by the user is an integer or not.
import java.util.Scanner;

public class Ques5Basics {
    public static void main(String[] args){
        Scanner si = new Scanner(System.in);
        System.out.print("Enter a number: ");
        System.out.print(si.hasNextInt());
    }
}
