//*****Calculate income tax paid by an employee to the government as per the slabs mentioned below:
/*
Income Slab	        Tax
2.5L – 5.0L  	    5%
5.0L – 10.0L 	    20%
Above 10.0L	        30% */

import java.util.Scanner;

public class Ques16Conditionals {
    public static void main(String[] args){
        Scanner si = new Scanner(System.in);
        float tax = 0;
        float income = 3.3f;
        if(tax<2.5){
            tax=tax+0;
        }
        else if(tax>2.5f && tax< 5f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(tax>10){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10f - 5f);
            tax = tax + 0.3f * (income - 10f);
        }
        System.out.print("Total tax paid by the employee: "+tax);
    }
}
