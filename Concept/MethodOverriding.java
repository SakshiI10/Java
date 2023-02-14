class A{
    public int a;

    public int Sakshi(){
        return 1;
    }
    public void method2(){
        System.out.println("Mothod 2 of class A");
    }
}

class B extends A{
    public void method2(){
        System.out.println("Method 2 of class B");
    }
    public void method3(){
        System.out.println("Method 3 of class B");
    }
}

public class MethodOverriding {
    public static void main(String[] args){
        A obj1=new A();
        obj1.method2();

        B obj2=new B();
        obj2.method2();
    }
}
