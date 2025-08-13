 package com.mycompany.guiagejoption;
 import javax.swing.JOptionPane;


public class GuiageJoption {

    public static void main(String[] args) {
         String currentyearString1 = JOptionPane.showInputDialog("Enter your current year:");  
        
        
        String birthyearString1 = JOptionPane.showInputDialog("Enter your birth year:");
      
        
        int currentyear = Integer.parseInt(currentyearString1);
        int birthyear = Integer.parseInt(birthyearString1);
        
        
        int sum = currentyear - birthyear;
        
        
        JOptionPane.showMessageDialog(null, " The difference is: " + sum );
        
        
        }

}