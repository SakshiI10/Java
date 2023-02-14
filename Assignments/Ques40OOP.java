import javax.annotation.processing.SupportedOptions;

public class Ques40OOP {
   class Employee{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public int getname(){
        return salary;
    }
    public String setname(){
        return name;
    }
   } 

   class cellphone{
    public void ring(){
        System.out.print("Ringing...");
    }
    public void vibrate(){
        System.out.print("Vibrating...");
    }
    }

    class square{
    int side;
    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }
    }

    class Tommy{
        public void hit(){
            System.out.print("Hitting...");
        }
        public void run(){
            System.out.print("Running...");
        }
        public void fire(){
            System.out.print("Firing...");
        }
    }
}
