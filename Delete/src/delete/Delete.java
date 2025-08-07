/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package delete;
import java.util.Scanner;
/**
 *
 * @author Me
 */
public class Delete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n , item = 0 , i  ,j = 0  , c = 0  ;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the  no of elments");
      n = sc.nextInt();
      int x[]= new int [n];
       System.out.println("Enter elments to be inserted ");
for( i = 0 ;i < n; i++)
{
    x[i]= sc.nextInt();
}
       System.out.println("Enter elment to be deleted ");
       item = sc.nextInt();
       
        for(i = 0; i < n  ;i++)
        { //System.out.println("heelo 1");
        if(x[i] == item )
        {
           c++ ; 
        }
        else
        {
            x[j]  = x[i];
            j++;
        } 
        }
        
       
        
        
if( c == 0)
{
    System.out.println("NO such element found ");
}
 else 
{
    System.out.println("The new array is ");
for(j=0 ; j<n - 1 ;j++)
{
    System.out.println(x[j]);
}
}
    } 
// TODO code application logic here
}


