class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {

        Phone obj = new SmartPhone();       // Yes it is allowed because on() is in both classes
        // SmartPhone obj2 = new Phone();   // Not allowed because derived class can't be a reference class

        obj.showTime();
        obj.on();
        // obj.music(); Not Allowed         // Other Methods of the same class can't be called excluding the method present in both the methods.


    }
}
