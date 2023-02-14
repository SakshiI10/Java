/*Write a program using functions to print the following pattern:
*
**
***
****        */

public class Ques34Method {
    static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
        System.out.print("\n");
        }
    }
    public static void main(String[] args){
        pattern(4);
    }
}
