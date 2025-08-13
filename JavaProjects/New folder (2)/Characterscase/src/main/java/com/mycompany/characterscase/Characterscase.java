/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.characterscase;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Characterscase {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String input = scanner.next();

        
        if (input.length() != 1) {
            System.out.println("Please enter a single character.");
        } else {
            char ch = input.charAt(0);
            char converted;

            if (Character.isUpperCase(ch)) {
                converted = Character.toLowerCase(ch);
                System.out.println("Converted: " + converted);
            } else if (Character.isLowerCase(ch)) {
                converted = Character.toUpperCase(ch);
                System.out.println("Converted: " + converted);
            } else {
              
                System.out.println("Converted: " + ch + " (No change)");
            }
        }

        scanner.close();
    }
}
  