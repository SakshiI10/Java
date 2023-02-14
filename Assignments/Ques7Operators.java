//Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
import java.util.Scanner;

public class Ques7Operators {
    public static void main(String[] args){
        Scanner si = new Scanner(System.in);
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);

        grade = (char) (grade - 8);
        System.out.print(grade);
    }   
}