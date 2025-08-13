/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylist;

import java.util.ArrayList;

/**
 *
 * @author RC_Student_lab
 */
public class Arraylist {

    public static void main(String[] args) {
        // Create an ArrayList to store names
        ArrayList<String> names = new ArrayList<>();

        // Add names to the ArrayList
        names.add("Lux");
        names.add("Anex");
        names.add("Sma");
        names.add("Nanka");
        names.add("Anitha");
        names.add("Ruth");
        names.add("Mathew");

        // Remove specific names
        names.remove("Anex");
        names.remove("Anitha");


        // Print all names
        System.out.println("Names in the list: " + names);
}
    }
