/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sin_series;
import java.util.*;
/**
 *
 * @author Me
 */
public class Sin_Series {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int n  , degree ;
        float sum = 0 ; 
        float term = 0 ; 
        float Nterm= 0 ;
       int a =0 ;
       double temp =1 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms");
        n = sc.nextInt();
        System.out.println("Enter the value of X  in degree ");
        degree = sc.nextInt();
        float Numerator =  (float) ((degree) *(3.141592));
        float Radian = (float) Numerator / 180;
               
               for( int i = 1 ;i <= n ; i++)
               {
                   for( int j = 1 ;j <= a ; j ++)
                   { 
                    temp = j * temp;
                   }
               
               Nterm = (float) Math.pow(Radian, a);
               a = a + 2 ;      
               term = (float) (Nterm / temp);
               if(i % 2 == 0 )
               {
               term = - term ;
               }
               else
               {
               term =  term;
               }
               sum = term + sum ;        
               }
               System.out.println("The COS(x) series sum is" + sum);
               }
    
               }
