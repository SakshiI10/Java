//Write a recursive function to calculate the sum of first n natural numbers. 

public class Ques35Method {
    static void recsum(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum + i;
        }
        System.out.print(sum);
    }
    public static void main(String[] args){
        System.out.print("Sum: ");
        recsum(5);
    }
}
