public class MethodOverloading2 {
    static void num(){
        System.out.println("Gm");
    }

    static void num(int a){
        System.out.println(a);
    }

    static void num(int a, int b){
        System.out.println(a + b);
    }

    public static void main(String[] args){
        num();
        num(1);
        num(2,3);
    }
}
