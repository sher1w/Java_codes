/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array1;
import java.util.Scanner;
/**
 *
 * @author Me
 */
public class ARRAY1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n , count = 0,  i  ,element  =0;
       int arr[] = new int [10] ;
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter 10 elements  for the array  ");
       for(i = 0 ;i<  10 ;i++)
       {
           arr[i] =sc.nextInt();
       }
       System.out.println("Enter elment to be found ");
       element = sc.nextInt();
       for( i = 0 ; i <  10; i ++ )
       {
           if( arr[i] == element )
           {
               System.out.println("The element is  found at index " +  (i+1) );
count ++;
           }

       }
                  if( count == 0 )
           {
               System.out.println("The elemnt is not found ");
           }
// TODO code application logic here
    }
    
}
