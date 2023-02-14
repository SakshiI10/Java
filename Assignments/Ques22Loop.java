//Write a program to print the multiplication table of a given number n.
import java.util.Scanner;

public class Ques22Loop {
    public static void main(String[] args){
        Scanner si = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = si.nextInt();
        int i;
        int num = 0;
        for(i=1; i<=10; i++){
                num = n * i;
                System.out.print(n+" * "+i+" = "+(num)+"\n");
            }
        // int i=1;
        // int num;
        // while(i<=10){
        //     num=n*i;
        //     System.out.print(n+" x "+i+" = "+(num)+"\n");
        //     i++;
        // }
    }
}