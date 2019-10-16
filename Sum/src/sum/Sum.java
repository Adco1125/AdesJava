/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum;
import java.util.*;
/**
 *
 * @author FindAd3s!
 */
public class Sum {
    static Scanner console = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String word;
        char a,b,c,d;
        int sum;
        
        System.out.print("Enter 4(four) letter word: ");
        word = console.nextLine();
        
        a = word.charAt(0);
        b = word.charAt(1);
        c = word.charAt(2);
        d = word.charAt(3);
        
        sum = ((int) a +  (int) b + (int) c + (int) d);
        
        System.out.println("ASCII Sum of four leter word: " + sum);
        
        // TODO code application logic here
    }
    
}
