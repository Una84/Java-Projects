/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mobilephone1;

/**
 *
 * @author RC_Student_lab
 */
public class MobilePhone {
         private String brand;
       private int price;
 
   public MobilePhone(String brand,int price) {
       this.brand = brand;
       this.price = price;
  } 

   public void displayInfo(){
     System.out.println("phone brand:");
     System.out.println("phone price:"); 
   }
}