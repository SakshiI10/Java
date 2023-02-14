public class Methods{
    int sum(int a, int b){                      //Method is created
        return a+b;
    }
    
    public static void main(String[] args) {
        Methods obj = new Methods();            //Inside the main() method, we've created an object of the calculate class.           
        int c = obj.sum(5,4);                   //We've invoked the sum method and passed 5 and 4 as arguments.
        System.out.println(c);
    }
}