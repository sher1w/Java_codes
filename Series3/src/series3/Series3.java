/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package series3;
import java.util.*;
/**
 *
 * @author Me
 */
public class Series3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n; 
  int a ;
  float sum = 1 ;
  Scanner sc = new Scanner(System.in) ;
  System.out.println("Enter number ");
  n = sc.nextInt();
  System.out.println("Enter valuue for  a ");
  a =sc.nextInt();
  for(int i = 1 ; i <n ; i ++ )
  { 
   if ( n ==1 )
   {
       sum = 1;
       
   }else
   { int temp =1 ;
    for(int j = 1 ; j <= i ; j++)
    { temp = temp * j;}
      
   float term = (float)  Math.pow(a,i+1)  / temp;

  
  sum =  sum  +  term;
  }
  }
  System.out.println( "The answer is " + sum);
 
    
    }
}


  
