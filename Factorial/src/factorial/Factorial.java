/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
       package factorial;
       import java.util.Scanner;
/**
 *
 * @author Me
 */
       public class Factorial {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        // TODO code application logic here
        int num , fact;
        fact =1 ;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number ");
        num = sc.nextInt();
        for(int i = 1 ;i <= num ; i++)
        {
            fact= fact *i ;
        }
        System.out.println("The factorial of the Number is " +fact);
        
        }
    
        }
