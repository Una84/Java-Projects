package com.mycompany.guiage;
import java.util.Scanner;

public class Guiage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your current year:");
        int currentyear = input.nextInt();
        System.out.println("Enter your birth year:");
        int birthyear = input.nextInt();
        int age  = currentyear - birthyear;
         System.out.println("your age is " + age);
     }
}
