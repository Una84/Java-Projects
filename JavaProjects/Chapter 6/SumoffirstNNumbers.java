/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumoffirstnnumbers;

import java.util.Scanner;


public class SumoffirstNNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
         System.out.println("Enter n Numbe:");
       int N = scanner.nextInt();
    
       int sum =0;
       int i = 1;
       while (i <= N) {
        sum += i;
        i++;
  

       }
   System.out.println("The sum of first " + N + " numbers: " + sum );  
        
       
    }
}
