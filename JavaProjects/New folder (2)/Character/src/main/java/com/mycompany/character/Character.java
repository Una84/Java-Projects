/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.character;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Character {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String input = scanner.next();

      
        if (input.length() != 1) {
            System.out.println("Please enter a single character.");
        } else {
            char ch = input.charAt(0);

            if (Character.isLetter(ch)) {
                System.out.println(ch + " is a letter.");
            } else if (Character.isDigit(ch)) {
                System.out.println(ch + " is a digit.");
            } else {
                System.out.println(ch + " is neither a letter nor a digit.");
            }
        }

        scanner.close();
    }

    private static boolean isLetter(char ch) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static boolean isDigit(char ch) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
 
