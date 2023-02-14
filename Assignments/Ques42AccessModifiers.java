//create a class cylinder and use getter and setters to calculate its surface area and volume of the cylinder

class cylinder{
    private int surface;
    private int volume; 

    public void setsurface(int s){
        surface=s;
    }
    public int getsurface(){
        return surface;
    }
    public void setvolume(int v){
        volume = v;
    }
    public int getvolume(){
        return volume;
    }
}

public class Ques42AccessModifiers{
    public static void main(String[] args){
        cylinder si = new cylinder();
        si.setsurface(9);
        System.out.println(si.getsurface());
        si.setvolume(12);
        System.out.println(si.getvolume());      
    }
}