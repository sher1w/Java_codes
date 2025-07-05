/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
package javaapplication44;
/**
 *
 * @author Me
 * 
 */



class Fruit
    {  
    
        private int x;
        private int y;
        
       public void getdata()
        {Scanner sc = new Scanner(System.in);
         System.out.println("Enter value of X and Y");
         x = sc.nextInt();
         y  = sc.nextInt();
        }
        
        public void display()
        {
            System.out.println(" X="+x);
            
               System.out.println(" Y="+y);
        }
        
      public   void  addobj (Fruit f1, Fruit f2)
        {
            x= f1.x + f2.x;
            y = f1.y + f2.y;
        }
        
    }
    
public class JavaApplication44 {
    

    
    public static void main(String[] args) 
    {
        
        Fruit f1 = new Fruit();
        Fruit f2 = new Fruit();
        Fruit f3 = new Fruit();
        
       f1.getdata();
        f2.getdata();
        f3.addobj(f1,f2);
        f3.display();
        // TODO code application logic here
    }
    
}
