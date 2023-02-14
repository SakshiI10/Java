public class Methods2 {
    static int logic(int x, int y){
        int z;
        if(x>y){
            return x+y;
        }
        else{
            return (x+y)*5;
        }
        // return z;
    }
    public static void main(String[] args){
        int a = 5, b = 7;
        int c = logic(a, b);
        System.out.println(a + " "+ b);
        System.out.println(c);

        Methods2 obj = new Methods2();
        int z = obj.logic(5,4);
        System.out.println(a + " "+ b);
        System.out.println(z);
        
        int a1 = 2, b1 = 1, c1;
        c1 = logic(a1, b1);
        System.out.println(a1 + " " + b1);
        System.out.println(c1);
    }
}
