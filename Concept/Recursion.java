public class Recursion {
    static void func(int n){
        if(n>0){
            System.out.println(n);
            func(n-1);
        }
    }
    public static void main(String[] args){
        func(5);
    }
}
