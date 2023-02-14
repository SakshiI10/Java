//Write a Java program to find the maximum element in an array.
import java.util.Scanner;

public class Ques31Array {
    public static void main(String[] args){
        Scanner si = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        boolean IsSorted = true;

        for(int i=0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                IsSorted = false;
                break;
            }
        }
        if (IsSorted) {
            System.out.print("Sorted\n");
            System.out.print("Maximum element: "+arr[arr.length-1]);
        }
        else{
            System.out.print("Unsorted");
        }
    }
}
