/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mtrix101;
import java.util.Scanner;
/**
 *
 * @author Me
 */
public class Mtrix101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int i =0 , j=0 ,sum =0 ,  n =0;
   System.out.println("Enter the size of the matrix");
   Scanner sc = new Scanner (System.in);
   n = sc.nextInt();
   int a[][]= new int [n][n];
   System.out.println("Enter the matrix");
   for(i =0 ;i <  n ;  i++)
   {
   for( j = 0 ; j < n ; j ++)
   {
   a[i][j]=sc.nextInt ();
   System.out.print(" ");
   }
   System.out.println();
   }
    
    for(i =0 ;i <  n ;  i++)
    {
    for( j = 0 ; j < n ; j ++)
    {   if(i == j  )
    {
     sum = sum +  a[i][j];
    } 
    }
    }
   int sum1 =0 ;
for(i =0 ; i <  n ;  i++)
{
    for( j = 0 ; j < n ; j ++)
    {   if( (i+j)==2 ){
       
        sum1 = sum1 +  a[i][j];
    } 
    }
}
System.out.println("The sum of the left  diagonals are " + sum);
System.out.println("The sum of the right  diagonals are " + sum1);

    }
    
}
