/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.validatepassword;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Validatepassword {

    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

     
        if (password.length() < 8) {
            System.out.println("Password is invalid (must be at least 8 characters).");
        } else if (!containsUppercase(password)) {
            System.out.println("Password is invalid (must contain at least one uppercase letter).");
        } else if (!containsDigit(password)) {
            System.out.println("Password is invalid (must contain at least one digit).");
        } else {
            System.out.println("Password is valid.");
        }

        scanner.close();
    }

   
    public static boolean containsUppercase(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }


    public static boolean containsDigit(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
