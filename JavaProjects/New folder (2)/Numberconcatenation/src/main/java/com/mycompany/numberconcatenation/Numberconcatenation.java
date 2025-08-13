/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberconcatenation;

/**
 *
 * @author RC_Student_lab
 */
public class Numberconcatenation {

    public static void main(String[] args) {
         StringBuilder sb = new StringBuilder();

        // Append numbers 1 to 10 using a loop
        for (int i = 1; i <= 10; i++) {
            sb.append(i);
        }

        // Print the result
        System.out.println("Concatenated numbers: " + sb.toString());
    }
}
 