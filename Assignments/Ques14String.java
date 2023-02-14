//Write a Java program to detect double and triple spaces in a string.
import java.util.Scanner;

public class Ques14String {
    public static void main(String[] args){
        Scanner si = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String a = si.nextLine();
        System.out.println(a.indexOf("  "));
        System.out.println(a.indexOf("   "));
    }
}
