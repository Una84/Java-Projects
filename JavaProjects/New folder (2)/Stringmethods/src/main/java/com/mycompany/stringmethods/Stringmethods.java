/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringmethods;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Stringmethods {

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        int atIndex = email.indexOf('@');

        if (atIndex != -1) {
            String username = email.substring(0, atIndex);
            System.out.println("Username: " + username);
        } else {
            System.out.println("Invalid email address. '@' symbol not found.");
        }

        scanner.close();
    }
}

 
