/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursesplitter;
import java.util.*;
/**
 *
 * @author findt
 */
public class CourseSplitter {
static Scanner console = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String Course;
        int index1;
        int index2;
        int index3;
        
        
        System.out.print("Statement to be Printed: ");
        Course = console.nextLine();
        
        index1 = Course.indexOf(' ');
        index2 = Course.indexOf(':');
        index3 = Course.length();
        
        System.out.print("\nCourse Name: ");
        System.out.print(Course.substring(0, index1));
        System.out.print("\nCourse Number: ");
        System.out.print(Course.substring(index1+1, index2));
        System.out.print("\nCourse Description: ");
        System.out.print(Course.substring(index2+1, index3));
        
        
        
        // TODO code application logic here
    }
    
}
