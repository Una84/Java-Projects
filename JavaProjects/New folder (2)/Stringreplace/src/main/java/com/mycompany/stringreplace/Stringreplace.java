/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringreplace;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Stringreplace {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter word to replace: ");
        String wordToReplace = scanner.nextLine();

        System.out.print("Enter new word: ");
        String newWord = scanner.nextLine();

        String updatedSentence = sentence.replace(wordToReplace, newWord);

        System.out.println("Updated sentence: " + updatedSentence);

        scanner.close();
    }
}

