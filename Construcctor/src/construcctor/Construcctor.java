/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
package construcctor;
;
/**
 *
 * @author Me
 */
public class Construcctor {
private int  X ;
private int  Y ;
Construcctor()
{
    X=10;
    Y =  12;
}

void display()
{
    System.out.println(X);
      System.out.println(Y);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    Construcctor t1 = new Construcctor();
t1.display();
// TODO code application logic here
    }
    
}
