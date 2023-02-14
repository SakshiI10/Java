//Create a class circle and use inheritance to create another class cylinder from it

class circle{
    public void cir(){
        System.out.println("I'm a method of class circle");
    }
}

class cylinder extends circle{
    public void cyl(){
        System.out.println("I'm a method of class cylinder");
    }
}

public class Ques46Inheritance{
    public static void main(String[] args){
        circle obj=new circle();
        obj.cir();
        cylinder obj2=new cylinder();
        obj2.cyl();
    }
}