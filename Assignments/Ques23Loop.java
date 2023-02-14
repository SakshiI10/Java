//Write a program to print a multiplication table of 10 in reverse order.
import java.util.Scanner;

public class Ques23Loop {
    public static void main(String[] args){
        Scanner si = new Scanner(System.in);
        int n = 10;
        // int i;
        // int num = 0;
        // for(i=10; i>0; i--){
        //         num = n * i;
        //         System.out.print(n+" * "+i+" = "+(num)+"\n");
        //     }
            
        int i=10;
        int num = 0;
        while(i>0){
            num = n * i;
            System.out.print(n+" * "+i+" = "+(num)+"\n");   
            i--;
        }
    }
}
