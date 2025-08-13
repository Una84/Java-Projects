/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.entercorrectpasswword;

import java.util.Scanner;


public class Entercorrectpasswword {

    private static Object correctPassword;

    public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in);
      String Password = "1234";
      String inputPassword;
      do {
          System.out.print("Enter password");
          inputPassword = scanner.nextLine();
          if (!inputPassword.equals(correctPassword)) {
          System.out.println("Incorrect password. Please try again.");
            }
        } while (!inputPassword.equals(correctPassword));

        System.out.println(" Access granted.");
       
    }
       
}
