/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fseries2;

import java.util.*;
/**
 *
 * @author Me
 */

    

  
  public class Fseries2 
  {

  public static void main(String[] args) 
  {
  int n; 
  
  float sum = 0 ;
  Scanner sc = new Scanner(System.in) ;
  System.out.println("Enter number ");
  n = sc.nextInt();
  for(int i = 1 ; i <=n ; i ++ )
  { int temp =1 ;
      
    for(int j = 1 ; j <= i ; j++)
    { temp = temp * j;}
      
  float term = (float) i/temp;
  if(i%2 == 0) 
  term = (float) -term; 
  else
      term =  (float) term;
  
  sum =  sum  +  term;
  }
  
  System.out.println( "The answer is " + sum);
   
  }
  }
   
