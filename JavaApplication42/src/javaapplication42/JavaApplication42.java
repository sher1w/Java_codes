/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication42;

/**
 *
 * @author Me
 */

class Rec
{
    int l , w ;
    Rec(int x ,int y )
    {
        l = x ;
        w = y;
    }
    int Ar()
    {
        return(l * w );
    }
}
public class JavaApplication42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
      Rec r = new Rec(15,10);
      int Ar =r.Ar();
      System.out.println("Area =" + Ar);
    }
    
}
