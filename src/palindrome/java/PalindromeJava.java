/*
 * Julianne Wojdak
 * Palindrome.java
 * 25/02/2020
 */

package palindrome.java;
import javax.swing.*;
/**
 *
 * @author JuWoj8013
 */
public class PalindromeJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        String myInput;
        String backwards;
        int pos;
        
        //Prompts user input
        myInput = JOptionPane.showInputDialog(
                "Words that are the same forwards and backwards are called palindromes. \n"
                 + "This program determines if a word is a palindrome. \n\n"
                 +"Please enter a word:");
        
        //Reverses user input word
        backwards = "";
        for(pos = myInput.length()-1; pos >= 0; pos--){
            backwards += myInput.charAt(pos);
        }
        
        //Outputs if word is palindrome or not
        if (myInput.equalsIgnoreCase(backwards)){
            JOptionPane.showMessageDialog(null, myInput + " in reverse is " + backwards
            + ".\nIt is a palindrome.");
        }else{
            JOptionPane.showMessageDialog(null, myInput + " in reverse is " + backwards
            + ".\nIt is not a palindrome.");
        }
        // TODO code application logic here
    }
    
}
