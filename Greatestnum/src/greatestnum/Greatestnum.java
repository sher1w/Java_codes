/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package greatestnum;
import java.util.Scanner;

/**
 *
 * @author Me
 */
public class Greatestnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int A , B  , C;
       Scanner sc = new Scanner(System.in);
               System.out.println("Enter 1st number");
               A = sc.nextInt();
               System.out.println("Enter 2nd Number ");
               B = sc.nextInt();
               System.out.println("Enter the 3rd Number");
               C= sc.nextInt();
               if( A < B)
               {
if(B < C)
{System.out.println(C+" "+"is the  greatest Numer");
       // TODO code application logic here
    }else
{
    System.out.println(B+" "+"is the greatest Number");
}
}else
               {
    if( C < A )
    {
        System.out.println(A +" "+"is the largest number");
}else
    {
        System.out.println(C+" "+"is the largest number");
    }

               } } }