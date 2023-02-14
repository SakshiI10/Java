interface bicycle{
    void applyBrake(int decrement);
    void speedup(int increment);
}

interface hornbicycle{
    void blowhorn1();
    void blowhorn2();
}

class avoncycle implements bicycle, hornbicycle{
    public void applyBrake(int decrement){
        System.out.println("Brake applied");
    }
    public void speedup(int increment){
        System.out.println("Donw with speeding up");
    }
    public void blowhorn1(){
        System.out.println("qwertyuiop");
    }
    public void blowhorn2(){
        System.out.println("zxcvbnm");
    }
}
public class Interfaces {
    public static void main(String[] args){
        avoncycle obj = new avoncycle();
        obj.applyBrake(1);
        obj.speedup(2);
        obj.blowhorn1();
        obj.blowhorn2();
    }
}
