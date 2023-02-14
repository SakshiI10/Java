/*Write a program to find out the type of website from the URL:
.com –  commercial website
.org –  organization website
.in  –  Indian website */

import java.util.Scanner;

public class Ques19Conditionals {
   public static void main(String[] args) {
    Scanner si = new Scanner(System.in);
    System.out.print("Enter URL: ");
    String str = si.nextLine();
    if(str.endsWith(".com")){
        System.out.print("Commercial website");
    }
    if(str.endsWith(".org")){
        System.out.print("Organization website");
    }
    if(str.endsWith(".in")){
        System.out.print("Indian website");
    }
   }
}
