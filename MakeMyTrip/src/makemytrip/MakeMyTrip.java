/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makemytrip;
import java.util.*;

/**
 *
 * @author FindAd3s!
 */
public class MakeMyTrip {

    static Scanner console = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        int num;
        int x = 0;
        float[] stu = new float[100];
        float [][] mon = new float [100][100];
        float [] ave = new float [100];
        float [] exc = new float [100];
        
        do{
            System.out.print("Enter how many students in trip: ");;
            num = console.nextInt();
            float total = 0;
            if(num>0){
                stu[x] = num;
                
                for(int z = 0; z<stu[x];z++){
                    System.out.print("Enter the amount spent by student number " + (z+1) + ": ");
                    mon[x][z] = console.nextFloat();
                    total = total + mon[x][z];             
                }
                ave[x] = total/stu[x];
                for(int s = 0; s<stu[x];s++){
                    if(ave[x]>mon[x][s]){
                        exc[x] = exc[x] + (ave[x] - mon[x][s]);
                    }
                }
                x++;
            }
        }
        while(num != 0);
        
        System.out.print("\n\n");
        for(int y=0; y<x;y++){
            System.out.printf("Average exchange for batch %d is %.2f\n", (y+1), exc[y]);
        }
    }
}
