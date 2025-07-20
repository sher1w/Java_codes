/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

package array;

/**
 *
 * @author Me
 */
public class Array {

    /**
     * @param args the command line arguments
     *
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array ");
        n = sc.nextInt();
        int x[] = new int [n];
              System.out.println("Enter elments of the array ");
        for(int i =0; i<n ;i++)
        {
            x[i] =sc.nextInt();
            System.out.println("");
        }
        
              System.out.println("The elments of the array are ");
        for(int i =0; i<n ;i++)
        {
            System.out.println(x[i]);
        }
        // TODO code application logic here
    }
    
}
