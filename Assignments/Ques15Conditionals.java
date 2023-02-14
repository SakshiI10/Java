//Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.

import java.util.Scanner;

public class Ques15Conditionals {
    public static void main(String[] args){
        Scanner si = new Scanner(System.in);
        System.out.print("Enter your marks in M3: ");
        int S1 = si.nextInt();
        System.out.print("Enter your marks in DSA: ");
        int S2 = si.nextInt();
        System.out.print("Enter your marks in PPL: ");
        int S3 = si.nextInt();
        float avg = S1+S2+S3/30;

        if(avg>=40 && S1>=33 && S2>=33 && S3>=33){
            System.out.print("You are passed");
        }
        else{
            System.out.print("Try again");
        }
    }
}
