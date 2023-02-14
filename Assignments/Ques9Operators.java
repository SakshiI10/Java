//Write the following expression in a java program:
import java.util.Scanner;

public class Ques9Operators {
    public static void main(String[] args){
        Scanner si = new Scanner(System.in);
        System.out.print("Enter final speed: ");
        int v = si.nextInt();
        System.out.print("Enter previous speed: ");
        int u = si.nextInt();
        System.out.print("Enter acceleration: ");
        int a = si.nextInt();
        System.out.print("Enter distance: ");
        int s = si.nextInt();

        float b = (v*v - u*u)/2*a*s;

        System.out.print("The value of the Expression: "+b);
}
}