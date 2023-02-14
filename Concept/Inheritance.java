class base{
    public int x;

    public void setx(int x){
        System.out.println("I'm in base and setting x now");
        this.x=x;
    }
    public int getx(){
        return x;
    }
    public void printme(){
        System.out.println("I'm a constructor");
    }
}

class derived extends base{
    public int y;

    public void sety(int y){
        System.out.println("I'm in derived and setting y");
        this.y=y;
    }
    public int getx(){
        return y;
    }
}

public class Inheritance{
    public static void main(String[] args){
        base b = new base();
        b.setx(2);
        System.out.println(b.getx());

        derived d = new derived();
        d.sety(4);
        System.out.println(d.getx());
    }
}