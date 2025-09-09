/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
       package series6;
       import java.util.*;
/**
 *
 * @author Me
 */
     public class Series6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    float sum = 0 ; 
    int n ,a;
    int m =1;
    int  b =1  ;
    float temp ;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of terms  ");
    n = sc.nextInt();
    System.out.println("Enter value for a  ");
    a = sc.nextInt();
    for(int i = 1 ; i <= n ;i++)
    {
        double Numerator = Math.pow(a,m);
        m = m + 2 ;
        float Denominator = b;
        b= b +4  ;
        temp = (float) Numerator / Denominator ;       
        if(i%2 == 0) 
        temp = (float) -temp; 
        else
        temp =  (float) temp;
        sum = sum + temp;
    }
    System.out.println("The answer is " + sum );
    }
     }
