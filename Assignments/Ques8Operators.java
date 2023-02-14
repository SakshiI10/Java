//Use comparison operators to find out whether a given number is greater than the user entered number or not.
import java.util.Scanner;

public class Ques8Operators {
    public static void main(String[] args){
        Scanner si = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = si.nextInt();
        System.out.print(num>10);
}
}