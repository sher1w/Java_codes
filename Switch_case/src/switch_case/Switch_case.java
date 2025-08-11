/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switch_case;
import java.util.*;
/**
 *
 * @author Me
 */
public class Switch_case {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Choice;
        float s , r , l , b ,h ,vol ;
        Scanner sc = new Scanner (System.in);
        System.out.println("OPTIONS");
          System.out.println("1.VOLUME OF CUBE");
          System.out.println("2.VOLUME OF SPHERE");
          System.out.println("3.VOLUME OF CUBOID");
          Choice = sc.nextInt();
          
              switch (Choice)
              {
              case  1:
              {System.out.println("Enter side of a Cube ");
               s = sc.nextInt();
               vol  = s*s*s;
               System.out.println("The volume is "+vol);       
               }            
               break;
          
              case 2:
              {       
              System.out.println("Enter Radius ");
              r =sc.nextInt();
              vol= (float)4/3 * 3.14F * r * r * r;
              System.out.println("The  volume  is " + vol);
              }  
              break;
               
              case 3:
              {           
              System.out.println("Enter length , breath and heigth respectively ");
              l =sc.nextInt();
              b= sc.nextInt();
              h= sc.nextInt();
              vol =l*b *h ;
              System.out.println("The volume is " + vol );
              } 
              break;
          
              default:
              
             System.out.println("ERROR");
              break;
              
              }
              }
              }
    

