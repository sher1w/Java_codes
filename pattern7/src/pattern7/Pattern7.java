/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pattern7;

/**
 *
 * @author Me
 */
public class Pattern7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int s , i , j ;
     for( i = 5 ;i>0;i--)
     {
         for(s=i;s<5;s++)
        {
             System.out.print(" ");
        }
         for( j =i ; j > 0 ; j--)
         {
             System.out.print(j);
         }
         System.out.println();
     }
    }
    
}
