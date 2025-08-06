/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;
import java.util.Scanner;
/**
 *
 * @author Me
 */
public class ARRAYS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int n , sum  = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array ");
        n = sc.nextInt();
        int x[] = new int [n];
              System.out.println("Enter elments of the Array ");
        for(int i =0; i<n ;i++)
        {
            x[i] =sc.nextInt();
            System.out.println("");
        }
        
             
        for(int i =0 ; i <n ;i++)
        {
           sum = x[i] + sum ;
        }
        System.out.println(" The Sum is " +sum);
        // TODO code application logic here
    }
    
}
