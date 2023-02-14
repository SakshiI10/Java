public class MethodOverloading {
    int mul(int a, int b){
        return a*b;
    }
    double mul(double a, double b){
        return a*b;
    }
    double mul(double a, double b, double c){
        return a*b*c;
    }
    public static void main(String[] args){
        MethodOverloading obj = new MethodOverloading();
        int x = obj.mul(5, 4);
        System.out.println(x);
        double y = obj.mul(1.2, 3.4);
        System.out.println(y);
        double z = obj.mul(4,5,6);
        System.out.println(z);
    }
}
