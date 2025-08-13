/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teststring;

/**
 *
 * @author RC_Student_lab
 */
public class Teststring {

    public static void main(String[] args) {
        
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        StringBuilder str4 = new StringBuilder("last");

        str4.append(" Name"); 
        System.out.println(str1 == str2);
        System.out.println(str1.length());   
        String uppercaseString = str2.toUpperCase();
        System.out.println(uppercaseString);  
        String lowercaseString = str3.toLowerCase();
        System.out.println(lowercaseString);  
        StringBuilder fullName = new StringBuilder("Una");
        System.out.println(fullName);
        System.out.println(str4.toString()); 
    }
}

  