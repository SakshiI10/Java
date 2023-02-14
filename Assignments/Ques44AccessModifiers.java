//Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters 

class rectangle{
    private int length;
    private int breadth;

    public rectangle(){
        this.length=4;
        this.breadth=5;
    }
    public rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int getlength(){
        return length;
    }
    public int getbreadth(){
        return breadth;
    }
}

public class Ques44AccessModifiers {
    public static void main(String[] args){
        rectangle r = new rectangle(2,4);
        System.out.println(r.getlength());
        System.out.println(r.getbreadth());
    }
}