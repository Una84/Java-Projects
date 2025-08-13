/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringbuilder.reverse;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class StringBuilderReverse {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your firstName: ");
        String input = scanner.nextLine();
        
        System.out.print("Enter lastName: ");
        String lastName = scanner.nextLine();
        
        String reversed = new StringBuilder(input).reverse().toString();
          
        
        System.out.println("Reversed: " + reversed);

        scanner.close();
    }
}
       
  

       
      
        

        
       
