/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberofwords;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Numberofwords {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        sentence = sentence.trim();

        if (sentence.isEmpty()) {
            System.out.println("Word count: 0");
        } else {
            String[] words = sentence.split("\\s+");
            System.out.println("Word count: " + words.length);
        }

        scanner.close();
    }
}
 