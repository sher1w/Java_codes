/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xy_compare;
import java.util.Scanner;
/**
 *
 * @author Me
 */
public class Xy_compare {
private int x, y;
    void get_xy()
    {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter value for x");
            x = sc.nextInt();
                System.out.println("Enter value for y");
            y = sc.nextInt();
     Compare();       
    }
    
   private void Compare()
    {
     if(x > y )
     {
         System.out.println("X="+x+" is greater than y");
     }
     else
     {
          System.out.println("Y="+y+"is greater than x"); 
     }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Xy_compare  xy = new Xy_compare();
    xy.get_xy();
   
    }
    
}
