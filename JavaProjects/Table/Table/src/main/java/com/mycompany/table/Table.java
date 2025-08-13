/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.table;

/**
 *
 * @author RC_Student_lab
 */
public class Table {

    public static void main(String[] args) {
       // Declare and initialize a 2D array with 4 rows and 3 columns
        int[][] array = {
            {20, 50, 80},  // Row 1
            {80, 25, 15},  // Row 2
            {60, 100, 35},  // Row 3
            {40, 75, 45},  // Row 4
        };
             // Print the 2D array
        System.out.println("Two-Dimensional Array:");
       
        for (int i = 0; i < array.length; i++) { // Iterate through rows
            for (int j = 0; j < array[i].length; j++) { // Iterate through columns
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}    
 