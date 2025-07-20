/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Me
 */
    import area.*;
    import java.util.Scanner;

    public class MAIN_FNC {
    
   
     public static void main(String[] args) 
     {
          Scanner sc = new Scanner(System.in);
         float radius; 
         System.out.println("Enter radius of the Circle");
         radius =  sc.nextFloat();
         AREAOFCIRCLE A  = new AREAOFCIRCLE();
         CIRCUMFERENCEOFCIRCLE C = new CIRCUMFERENCEOFCIRCLE();
         double p ;
        p = A.getanswer(radius);
     System.out.println("AREA ->"+p );
          p=  C.getanswer(radius);
                
                      System.out.println("CIRCUMFERENCE ->"+p );
        // TODO code application logic here
    }   
    }
    
