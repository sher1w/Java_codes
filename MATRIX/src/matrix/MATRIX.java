/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrix;
import java.util.Scanner;
/**
 *
 * @author Me
 */
public class MATRIX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int n =0 , i = 0 ,j =0  ;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of matrix ");
    n = sc.nextInt();
          int a[][]=new int[n][n];
              int b[][]=new int[n][n];
                  int c[][]=new int[n][n];
     System.out.println("Enter the 1st matrix ");
    for(i =0 ;i < n ;i++)
    {
        
        for( j = 0 ;j < n ; j++)
        {
      a[i][j]= sc.nextInt();
         
        }
           
    }
    
      System.out.println("Enter the 2nd matrix ");
    for(i =0 ;i < n ;i++)
    {
        
        for( j = 0 ;j < n ; j++)
        {
      b[i][j]= sc.nextInt();
         
        }
           
    }
    
    
    
    
       for(i =0 ;i < n ;i++)
    {   
        for( j = 0 ;j < n ; j++)
        {
      c[i][j]= a[i][j] + b[i][j];
         
        }
           
    }
        
       System.out.println("The sum is ");
       
      for(i =0 ;i < n ;i++)
    {
        
        for( j = 0 ;j < n ; j++)
        {
      System.out.print(c[i][j]);
          System.out.print(" ");
        }
        System.out.println();
    }
        // TODO code application logic here
    }
    
}
