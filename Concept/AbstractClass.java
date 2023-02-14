abstract class parent{
    public parent(){
        System.out.println("I'm a constructor of Parent");
    }
    public void greet(){
        System.out.println("Good Morning");
    }
    abstract public void greet2();
    abstract public void greet3();
}

class child extends parent{
    public void greet2(){
        System.out.println("Good Afternoon");
    }
    public void greet3(){
        System.out.println("Good Evening");
    }
}

abstract class child2 extends parent{
    public void gre(){
        System.out.println("Hiii");
    }
}

public class AbstractClass {
    public static void main(String[] args){
        // parent obj = new parent();       object of abstract class can't be made
        child obj2=new child();
        obj2.greet();
        obj2.greet2();
        obj2.greet3();
    }
}
