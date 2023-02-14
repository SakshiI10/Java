//Write a program to find the factorial of a given number using for loops.
import java.util.Scanner;

public class Ques24Loop {
    public static void main(String[] args){
        Scanner si = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = si.nextInt();
        int fact = 1;
        
        // for(int i=num; i>0; i--){
        //     fact = fact * i;
        //  }
        // System.out.println("Factorial: "+ fact);
        
        int i=num;
        while(i>0){
           fact = fact*i;
           i--;
        }
        System.out.println("Factorial: "+ fact);
    }
}
 