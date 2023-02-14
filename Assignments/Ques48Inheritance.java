class circle{
    public void area(int r){
        System.out.println(r*r);
    }
    public void volume(int r){
        System.out.println(r*r*r);
    }
}
public class Ques48Inheritance {
    public static void main(String[] args){
        circle obj = new circle();
        System.out.print("Area: ");
        obj.area(2);
        System.out.print("Volume: ");
        obj.volume(4);
    }
}
