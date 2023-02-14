//Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
import java.util.Scanner;

public class Ques28Array {
    public static void main(String[] args){
        Scanner si = new Scanner(System.in);
        int[] marks = {6,7,8,9,10};
        float avg = 0;
        int sum = 0;
        for(int element: marks){
            sum = sum + element;
            avg = sum/marks.length;
        }
        System.out.print("Average: "+ avg);
    }
}
