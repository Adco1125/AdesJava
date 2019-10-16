/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familyname;
import java.util.*;
/**
 *
 * @author FindAd3s!
 */
public class FamilyName {
static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        String Name1;
        String Name2;
        int index1, index2;
        int length1, length2;
        String NewName1;
        String NewName2;
        
        
        System.out.print("Name1: ");
        Name1 = console.nextLine();
        System.out.print("Name2: ");
        Name2 = console.nextLine();
        
        
        index1 = Name1.indexOf(" ");
        length1 = Name1.length();
        index2 = Name2.indexOf(" ");
        length2 = Name2.length();
        
        NewName1 = Name1.substring(0, index1) + Name2.substring(index2, length2);
        NewName2 = Name2.substring(0, index2) + Name1.substring(index1, length1);
        
        System.out.println("New Name1: " + NewName1);
        System.out.println("New Name2: " + NewName2);
        
       
    }
    
}
