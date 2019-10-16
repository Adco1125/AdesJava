/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cannotbedontpush;
import java.util.*;
/**
 *
 * @author FindAd3s!
 */
public class CannotBeDontPush {
static Scanner console = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int y;
        //int[] num = new int[100];
        //int[][] 
        String[][] timestring = new String [100][100];
        int[][] timeint = new int [100][100];
        String [][] temp = new String [100][100];
        int x = 0;
        
        do{
           System.out.print("Enter number of events: ");
           y = console.nextInt();
           if(y>0){
               //num[x] = y;
               for(int z = 0; z<=y;z++){
                   timestring[x][z] = console.nextLine();
                   temp[0][0] = timestring[x][0].substring(0,1);
                   //timeint[x][z+1] = Integer.parseInt(temp.substring(3,4));
                   
                   
               }
               x++;
           }
           
           
        }
        while(y != 0);
        
        
        for(int t = 0; t<x;t++){
            System.out.println("Time #" + (t+1) + ": " + temp[0][1]);
        }
        
        
        
        
        // TODO code application logic here
    }
    
}
