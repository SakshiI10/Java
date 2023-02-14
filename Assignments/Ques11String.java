//Write a Java program to convert a string to lowercase.
import java.util.Scanner;

public class Ques11String {
    public static void main(String[] args){
        Scanner si = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = si.nextLine();
        System.out.print("Lowercase: "+str.toLowerCase());
    }
}
