/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumscanner;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class SumScanner {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in); // create Scanner object
        
        System.out.print("Enter your name: "); 
        String name = input,nextline(); // Read user input
        greetUser(name); // Call the method with user input
        input.close(); // Close the scanner (good practice)
    }  
    
    public static void greetuser(String name) {    
        System.out.println("Hello, " + name + "!");
    }
}
