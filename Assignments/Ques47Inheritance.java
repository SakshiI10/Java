//Create a class rectangle and use inheritance to create another class cuboid, try to keep it as close to the real-world scenario as possible

class rectangle{
    public void rec(){
        System.out.println("I'm a method of class rectangle");
    }
}

class cuboid extends rectangle{
    public void cubo(){
        System.out.println("I'm a method of class cuboid");
    }
}
public class Ques47Inheritance {
    public static void main(String[] args){
        rectangle obj1=new rectangle();
        obj1.rec();
        cuboid obj2=new cuboid();
        obj2.cubo();
    }
}
