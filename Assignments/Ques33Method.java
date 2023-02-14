//Write a Java method to print the multiplication table of a number n.

import java.util.Scanner;

public class Ques33Method {
    static void mul(int n){
        for(int i=1; i<=10; i++){
            int x=n*i;
            System.out.format("%d x %d = %d\n",n,i,x);
        }
    }

    public static void main(String[] args){
        Scanner si = new Scanner(System.in);
        mul(2);
    }
}