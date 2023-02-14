class Cons {
    Cons(){
        System.out.println("This is the default constructor of Cons class.");
    }
}

class Cons_2 {
    Cons_2(String s, int b){
        System.out.println(s+", This is the Parameterized constructor of Cons_2 class. "+b);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Cons obj1 = new Cons();
        Cons_2 obj2 = new Cons_2("Sakshi", 10);
    }
}
