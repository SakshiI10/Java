import java.util.Scanner;

public class Factorial {
    // static int fact(int n){
    //     if(n==0 || n==1){
    //         return 1;
    //     }
    //     else{
    //         return fact(n-1)* n;
    //     }
    // }

    public static void main(String[] args){
    //     System.out.println("Factorial: "+fact(5));
    // }
    
    Scanner si = new Scanner(System.in);
    System.out.print("Enter a num: ");
    int n = si.nextInt();
    if(n==0 || n==1){
        System.out.print("Factorial: 1");
    }
    else{
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact= fact*i;
        }
        System.out.println(fact);
    }
}
}
 