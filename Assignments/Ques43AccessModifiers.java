//Using constructor create a class cylinder and use getter and setters to set its radius and height 
class radius{
    private int r;

    public radius(){
        this.r=2;
    }
    public radius(int r){
        this.r=r;
    }
    public int getradius(){
        return r;
    }
}

class height{
    private int h;
    
    public height(){
        this.h=2;
    }
    public height(int h){
        this.h=h;
    }
    public int getheight(){
        return h;
    }
}

public class Ques43AccessModifiers{
    public static void main(String[] args){
        radius si = new radius(2);
        System.out.println(r.getradius());
    }
}