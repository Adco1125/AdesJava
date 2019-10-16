/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replace;

import java.util.*;
/**
 *
 * @author FindAd3s!
 */
public class Replace {
static Scanner console = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String str;
        String replace;
        
        str = "This is ICS102 Lab";
        
        System.out.println("Original Statement: " + str);
        System.out.print("\nReplace 'ICS102' with: ");
        replace = console.nextLine();
        
        str = str.replace("ICS102", replace);
        
        System.out.println("New Statement: " + str);
        
    }
    
}
