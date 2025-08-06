/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubble;
import java.util.Scanner;
/**
 *
 * @author Me
 */
public class Bubble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int n  , i  ,j = 0  , k =0    ;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the  no of elments");
      n = sc.nextInt();
      int x[]= new int [n];
       System.out.println("Enter elments to be inserted ");
for( i = 0 ;i < n; i++)
{
    x[i]= sc.nextInt();
} // TODO code application logic5here
    for(i =0 ;i < n;i++)
    {   for(j =0 ;j  < n-1  ; j++ )
        {
            if( x[j] > x[j+1])
            {
                k  = x[j];
               x[j] =x[j+1];
                x[j+1] = k ;                
            }
        
        }
    }
    
      System.out.println("Array in aescending order ");
    for( i = 0 ;i < n; i++)
{
    System.out.println(x[i]);
} // TODO code application logi
    
    }
    
}
