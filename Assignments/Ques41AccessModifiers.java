//create a class cylinder and use getter and setters to set its radius and height 

class cylinder{
    private int radius;
    private int height;
    
    public void setradius(int r){
        radius=r;
    }
    public int getradius(){
        return radius;
    }
    public void setheight(int h){
        height=h;
    }
    public int getheight(){
        return height;
    }
}

    public class Ques41AccessModifiers {
        public static void main(String[] args){
            cylinder si = new cylinder();
            si.setradius(3);
            System.out.println(si.getradius());
            si.setheight(6);
            System.out.println(si.getheight());
        }
}