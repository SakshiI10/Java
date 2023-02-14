//Write a function to print the nth term of the Fibonacci series using recursion.
//0, 1, 1, 2, 3, 5, 8, 13, 21, ....

public class Ques37Method {
    static int fibo(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args){
        int x = fibo(5);
        System.out.print(x);
    }
}
