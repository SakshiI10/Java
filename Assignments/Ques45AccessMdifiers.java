//create a class sphere and use getter and setters to calculate radius of sphere.
class sphere{
    private int sphere;

    public void setsphere(int p){
        sphere=p;
    }
    public int getsphere(){
        return sphere;
    }
}

public class Ques45AccessMdifiers {
    public static void main(String[] args){
        sphere si = new sphere();
        si.setsphere(15);
        System.out.println(si.getsphere());
    }
}
