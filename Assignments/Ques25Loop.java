//Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
import java.util.Scanner;

public class Ques25Loop {
    public static void main(String[] args){
        Scanner si = new Scanner(System.in);
        int i;
        int n = 8;
        int table = 0;
        int sum = 0;
        for(i=1; i<=10; i++){
            table = n * i;
            sum = sum + table;
            System.out.print(n+" * "+i+" = "+ table +"\n");
        }
        System.out.print("Sum: "+sum);
    }
}
