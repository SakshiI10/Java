import java.util.Scanner;

public class Ques2Basics {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter num 1: ");
        float a = sc.nextFloat();
        System.out.print("Enter num 2: ");
        float b = sc.nextFloat();
        System.out.print("Enter num 3: ");
        float c = sc.nextFloat();
        float d=a+b+c;
        System.out.print("Summation of three numbers: "+ d);
        // System.out.print(d);
    }
}
