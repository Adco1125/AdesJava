/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swap;

/**
 *
 * @author FindAd3s!
 */
import java.util.*;
public class Swap {
static Scanner console = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //swap the last two letters in a given name
        String Name;
        String str;
        int length;
        //int index;
        char ch1, ch2;
        
        System.out.print("Enter the Name: ");
        Name = console.nextLine();
        
        length = Name.length();
        ch1 = Name.charAt(0);
        ch2 = Name.charAt(length-1);
        
        str = ch2 + Name.substring(1,(length-1)) + ch1;
        System.out.println("NewName: " + str);
        
        // TODO code application logic here
    }
    
}
