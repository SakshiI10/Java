import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner si = new Scanner(System.in);
        String var = si.next();
        switch (var) {
            case "Sakshi": {
                System.out.print("You are going to become an Adult!");
                break;
            }
            case "Dhananjay": {
                System.out.print("You are going to join a Job!");
                break;
            }
            case "Sakshuda":{
                System.out.print("You are going to get retired!");
                break;
            }
            default: System.out.print("Enjoy Your life!"); 
        System.out.print("Thanks for using my Java Code!");
    }
}
}