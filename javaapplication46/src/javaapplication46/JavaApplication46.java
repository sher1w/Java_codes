/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication46;

/**
 *
 * @author Me
 */
import java.util.Scanner;


class test
{
    private int x;
    private int y ;
    
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for  X and Y");
        x = sc.nextInt();
        y =sc.nextInt();   
    }
    
     test addobj( test t2)
    {
        test t4 = new test();
        t4.x = x + t2.x;
        t4.y = y + t2.y;
        return t4;
    }
     void display()
     {
              System.out.print("the neww values of x and y  are "+x+" "+y);

     }
}
public class JavaApplication46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test t1 =new test();
        test t2 = new test();
        test t3 = new test();
        t1.getdata();
        t2.getdata();
        t3 = t1.addobj(t2);
        t3.display();
      
    }
}
