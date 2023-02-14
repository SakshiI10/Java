//Write a program to find out whether a given integer is present in an array or not.
import java.util.Scanner;

public class Ques27Array {
    public static void main(String[] args)    {
        Scanner si = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.print("Enter a number: ");
        int num = si.nextInt();
        boolean IsInArray = false;
        for(int element: arr){
            if(num == element){
                IsInArray = true;
                break;
            }
            }
            if(IsInArray){
                System.out.print("Present");
            }
            else{
                System.out.print("Absent");
            }
        }
   }
