/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindrome;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Palindrome {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();

       
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

       
        String reversed = new StringBuilder(cleanedInput).reverse().toString();

       
        if (cleanedInput.equals(reversed)) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("Not a palindrome.");
        }

        scanner.close();
    }
}
 
