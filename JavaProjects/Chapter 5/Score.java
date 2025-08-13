/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.score;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Score {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your score: A");
        int score = input.nextInt();
        
        if (score >= 90) {
           System.out.println("Grade: A");
        }else if (score >=75) {
            System.out.println("Grade: B");
        } else {
      System.out.println("Grade: C");
            
        }
    }
}