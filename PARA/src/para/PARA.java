/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
package para;

/**
 *
 * @author Me
 */
public class PARA {
private int X , Y ;

PARA(int u , int v)
{
    X =u;
    Y =v;
}
PARA(PARA T)
{
    X = T.X;
    Y =T.Y;
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
    {int u , v;
      
       Scanner sc =new Scanner(System.in);
       
       System.out.println("Enter x and  y ");
       u = sc.nextInt();
       v = sc.nextInt();
         PARA P = new  PARA( u, v);
        
       P.display();
        PARA T = new PARA(P);
        System.out.println("COPY CONSTRUCTOR");
        T.display();
    }
    
}
