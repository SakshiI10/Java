//Write a function to convert Celsius temperature into Fahrenheit.

import java.util.Scanner;

public class Ques39Method {
    static void conver(int n){
        Scanner si = new Scanner(System.in);
        int Cel = si.nextInt();
        float Fahren=((9*Cel) + 160)/5.0f;
        System.out.print(Fahren);
    }
    
    public static void main(String[] args){
        System.out.print("Celsius into Fahrenheit: ");
        conver(1);
    }
}
