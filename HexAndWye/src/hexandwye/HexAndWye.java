/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hexandwye;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author FindAd3s!
 */
public class HexAndWye {

    static Scanner console = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String hex1, hex2;
        int total;
        
        System.out.print("Enter first values from 0-9 or A-F: ");
        hex1 = console.nextLine();
        System.out.print("Enter second values from 0-9 or A-F: ");
        hex2 = console.nextLine();
        
        int length1 = hex1.length();
        int length2 = hex2.length();
        
        
        
        int dec1 =(int) hex1;
        int dec2 = (int) hex2;
        
        
        System.out.println("Dec1: " + dec1);
        System.out.println("Dec2: " + dec2);
        
        
    }
    
}
