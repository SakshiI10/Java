/*Write a program to print the following pattern :
* * * *
* * *
* *
*       */

public class Ques20Loop {
    public static void main(String[] args){
        int i,j;
        for(i=4; i>0; i--){
            for(j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
