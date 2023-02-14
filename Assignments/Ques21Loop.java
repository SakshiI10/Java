//*****Write a program to sum first n even numbers using a while loop.

import java.util.Scanner;

public class Ques21Loop {
    public static void main(String[] args){
        Scanner si = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = si.nextInt();
        int i = 0;
        int sum=0;

        // while(i<=num){
        //      sum=sum+i;
        //      i++;
        // }
        // System.out.print("Sum: "+sum);

        for(i=1; i<=num; i++){
            sum=sum+i;
        }
        System.out.print("Sum: "+sum);
    }   
}