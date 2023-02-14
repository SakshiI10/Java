//*****Write a function to find the average of a set of numbers passed as arguments.

import java.util.Scanner;
public class Ques38Method {
    static void avg(int n){
        Scanner si = new Scanner(System.in);
        int[] marks = {};
        System.out.print("Enter numbers: ");
        int a = si.nextInt();
        float avg = 0;
        int sum = 0;
        for (int i : marks) {
            sum = sum + i;
            avg = sum/marks.length;            
        }
        System.out.print("Average: "+avg);
    }
    
    public static void main(String[] args){
        System.out.print("Avg: ");
        avg(5);
    }
}
