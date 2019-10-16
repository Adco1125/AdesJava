/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringwelcome;
import java.util.*;

/**
 *
 * @author findt
 */

public class StringWelcome {
static Scanner console = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String welcome;
        String search;
        
        System.out.print("Statement to be Printed: ");
        welcome = console.nextLine();
        System.out.print("Word to find Index of: ");
        search = console.nextLine();
        
        System.out.println(welcome.toUpperCase());
        System.out.println(welcome.toLowerCase());
        System.out.println(welcome.length());
        System.out.println(welcome.indexOf(search));
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
