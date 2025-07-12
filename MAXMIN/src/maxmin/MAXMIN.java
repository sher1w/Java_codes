/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maxmin;
import java.util.Scanner;
/**
 *
 * @author Me
 */
public class MAXMIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int  n  ,  min,  i , max  =0 ;
        Scanner sc = new Scanner(   System.in);
        System.out.println("Enter size of arrray ");
        n= sc.nextInt();
        int X[] = new int [n];
        System.out.println("Enter the elments to  be inserted ");
        for( i = 0 ; i < n;i++)
        {
            X[i]=sc.nextInt();
        }
        min = max = X[0];
        for(i =0 ; i<n ; i++)
        {
          if(X[i] < min)
          {
              min =X[i];
          }
          if(X[i] > max)
          {
              max = X[i];
          }
        }
        System.out.println("MAX no:"+max);
        System.out.println("Min no: "+min);
       
        // TODO code application logic here
    }
    
}
