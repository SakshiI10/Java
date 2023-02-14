class base1{
    base1(){
        System.out.println("I'm a constructor.");
    }
    base1(int x){
        System.out.println("I'm an overloaded constructor and value of x is: "+x);
    }
}

class derived1 extends base1{
    derived1(){
        System.out.println("I'm a derived constructor");
    }
    derived1(int x, int y){
        super(x);
        System.out.println("I'm an overloaded derived constructor and value of y is: "+y);
    }
} 

class child1 extends derived1{
    child1(){
        System.out.println("I'm a child of derived constructor");
    }
    child1(int x, int y, int z){
        super(x, y);
        System.out.println("I'm an overloaded child constructor of derived constructor and value of z is: "+z);
    }
} 

public class ConsInherit {
    public static void main(String[] args){
        base1 b=new base1();
        System.out.println();
        derived1 e=new derived1(10,12);
        System.out.println();
        derived1 d=new derived1();
        System.out.println();
        child1 f=new child1(1, 2, 3);
    }
}
