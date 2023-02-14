//Create an array of 5 floats and calculate their sum.
import java.util.Scanner;

public class Ques26Array{
    public static void main(String[] args){
        Scanner si = new Scanner(System.in);
        float[] arr = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        float sum = 0;
        for (float element: arr) {
            sum = sum + element;
        }
        System.out.print(sum);
}
}