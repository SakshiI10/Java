//Create three classes calculator , Sc calculator and Hybridcalculator and group them into a package.
//Must include javac Ques49Package.java then java Ques49Package then java -d . Ques49Package.java then java (package name)/(file name).

package calc;

class calculator{
    public void calculate(int a, int b){
        System.out.println("Result: "+ a+b);
    }
}
class sccalculator{
    public void sc_calculator(int a, int b){
    System.out.println("Result: "+ Math.sin(a+b));
    }
}
class hybridcalculator{
    public void hybrid_calculator(int a, int b){
        System.out.println("Result: "+ a+b);
        System.out.println("Result: "+ Math.sin(a+b));
    }

}

public class Ques49Package {
    public static void main(String[] args){
        System.out.println("Main method");
    }
}
