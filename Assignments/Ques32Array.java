//Write a Java program to find whether an array is sorted or not.
import java.util.Scanner;

public class Ques32Array {
    public static void main(String[] args){
        Scanner si = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        boolean IsSorted = true;
        
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                IsSorted = true;
                break;
            }
        }
        if (IsSorted) {
            System.out.print("Sorted\n");
        }
        else{
            System.out.print("Unsorted");
        }
    }
}
