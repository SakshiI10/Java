//Write a Java program to fill in a letter template which looks like below:

public class Ques13String {
    public static void main(String[] args){
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Sakshi");
        System.out.println(letter);
    }
}