//*****Create a Java program to add two matrices of size 2x3.
import java.util.Scanner;

public class Ques29Array {
    public static void main(String[] args){
        Scanner si = new Scanner(System.in);
        int[][] mat1 = {{1,3,5},{7,9,11}};
        int[][] mat2 = {{0,2,4},{6,8,10}};
        int[][] result = {{0,0,0},{0,0,0}};

        System.out.print(mat1.length);
        System.out.print(mat2.length);

        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++){
                result[i][j] = mat1[i][j] +mat2[i][j];
            }
        }

        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // Prints a new line
        }
    }
}
