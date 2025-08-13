/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.haslicense;


public class Haslicense {

    public static void main(String[] args) {
         int age = 20;
       
       boolean haslicense = true;
       
       if (age >=18){
           if (haslicense){
               System.out.println("You can drive.");
           } else {
               System.out.println("Get your license first!");
           }
       } else {
           System.out.println("You're too young to drive.");
       }  
    }
}
