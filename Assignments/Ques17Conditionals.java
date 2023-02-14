//Write a Java program to find out the day of the week given the number
import java.util.Scanner;

public class Ques17Conditionals {
    public static void main(String[] args){
        Scanner si = new Scanner(System.in);
        System.out.print("Enter number from 1 to 7: ");
        int num = si.nextInt();
        if(num == 1){
            System.out.print("Monday");
        }
        else if(num == 2){
            System.out.print("Tuesday");
        }
        else if(num == 3){
            System.out.print("Wednesday");
        }
        else if(num == 4){
            System.out.print("Thursday");
        }
        else if(num == 5){
            System.out.print("Friday");
        }
        else if(num == 6){
            System.out.print("Saturday");
        }
        else if(num == 7){
            System.out.print("Sunday");
        }
    }
}
