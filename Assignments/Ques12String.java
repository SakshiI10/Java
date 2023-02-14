//Write a Java program to replace spaces with underscores.
import java.util.Scanner;

public class Ques12String {
    public static void main(String[] args)    {
        Scanner si = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = si.nextLine();
        System.out.print("After Replacement: "+str.replace('a','b'));
    }
}
